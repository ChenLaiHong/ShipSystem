package com.lh.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.TemplateExportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lh.pojo.*;
import com.lh.service.*;
import com.lh.utils.MdUtil;
import com.lh.utils.ResponseUtil;
import com.lh.utils.StringUtil;
import net.sf.json.JSONObject;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;

import static com.lh.utils.CommentUtils.res;


/**
 * Created by laiHom on 2019/8/20.
 */
@Controller
@RequestMapping("/crew")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private CrewService crewService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private MajorService majorService;

    @Autowired
    private GradeService gradeService;



    ////////////////////////////
    @RequestMapping("/list")
    public String list(@RequestParam(value = "page", required = false) String page,
                       @RequestParam(value = "limit", required = false) String rows,
                       @RequestParam(value = "q", required = false) String q,
                       HttpServletResponse response,HttpServletRequest request) throws Exception {
        PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("start", pageBean.getStart());
        map.put("size", pageBean.getPageSize());
        map.put("roleId", request.getSession().getAttribute("state"));
        map.put("q", StringUtil.formatLike(q));

        List<Crew> list = crewService.list(map);
        Integer total = crewService.getTotal(map);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

        map.clear();
        map.put("data", list);
        map.put("count", total);
        map.put("code", 0);
        map.put("msg", "");
        ResponseUtil.write(response, gson.toJson(map));
        return null;
    }




    @RequestMapping("/toAdd")
    public ModelAndView toAdd(HttpServletRequest request) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("roleId", request.getSession().getAttribute("state"));
        List<Role> roleList = roleService.getOther(map);
        ModelAndView mav = new ModelAndView();
        mav.addObject("roleList", roleList);
        mav.addObject("btn_text", "添加");
        mav.addObject("save_url", "/crew/add");
        mav.setViewName("/admin/crewAdd");
        return mav;
    }

    @RequestMapping("/add")
    public String add(Crew crew, HttpServletResponse response) throws Exception {

        crew.setPassword(MdUtil.md5("123456"));
        int resultTotal = crewService.add(crew);
        Gson gson = new Gson();
        ResponseUtil.write(response, gson.toJson(res(resultTotal)));
        return null;
    }

    @RequestMapping("/toEdit")
    public ModelAndView toEdit(@RequestParam(value="loginId",required=false)String loginId,HttpServletRequest request) throws Exception {

        ModelAndView mav = selectInfo(loginId,request);
        mav.addObject("btn_text", "修改");
        mav.addObject("save_url", "/crew/update?loginId="+loginId);
        mav.setViewName("/admin/crewUpdate");
        return mav;
    }

    @RequestMapping("/showAll")
    public ModelAndView showAll(@RequestParam(value="loginId",required=false)String loginId,HttpServletRequest request) throws Exception {

        ModelAndView mav = selectInfo(loginId,request);
        mav.addObject("btn_text", "所有信息");
        mav.setViewName("/admin/studentShowAllInfo");
        return mav;
    }

    @RequestMapping("/update")
    public String update(Crew crew, HttpServletResponse response, HttpServletRequest request) throws Exception {

        int resultTotal = crewService.update(crew);
        Gson gson = new Gson();
        ResponseUtil.write(response, gson.toJson(res(resultTotal)));
        return null;
    }

    //删除
    @RequestMapping("/delete")
    public String delete(@RequestParam(value = "ids", required = false) String ids, HttpServletResponse response)
            throws Exception {
        String[] idsStr = ids.split(",");
        Gson gson = new Gson();
        Result result = new Result();
        crewService.delete(idsStr);
        result.setSuccess(true);
        ResponseUtil.write(response, gson.toJson(result));
        return null;
    }
    //打开上传窗口toImport
    @RequestMapping("/toImport")
    public ModelAndView toImport(HttpServletRequest request) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("roleId", request.getSession().getAttribute("state"));
        List<Role> roleList = roleService.getOther(map);
        ModelAndView mav = new ModelAndView();
        mav.addObject("roleList", roleList);
        mav.setViewName("/admin/crewImportExcel");
        return mav;
    }

    @RequestMapping("/importExcel")
    @ResponseBody
    public String importExcel2(@RequestParam("files") MultipartFile file, @RequestParam(value = "roleId") Integer roleId,  HttpServletResponse response) throws Exception {
        // 带结果到页面
        JSONObject jsonResult = new JSONObject();
        ImportParams importParams = new ImportParams();
        // 数据处理
        importParams.setHeadRows(1);
        importParams.setTitleRows(1);
        // 需要验证
        importParams.setNeedVerfiy(false);


        int res = 0;
        try {
            ExcelImportResult<Crew> result = ExcelImportUtil.importExcelMore(file.getInputStream(), Crew.class,
                    importParams);
            List<Crew> crewList = result.getList();

                Map<String, Object> map = new HashMap<>();
                map.put("roleId", roleId);
                map.put("crewList", crewList);
                map.put("password", MdUtil.md5("123456"));
                res = crewService.inputAll(map);


        }catch (InvalidFormatException e){
            jsonResult.put("status", "fail");
            jsonResult.put("message", "批量导入失败！文件格式不正确");
        }catch (Exception e){
            jsonResult.put("status", "fail");
            jsonResult.put("message", "批量导入失败！检查是否学号重复");
        }

        if(res>0){
            jsonResult.put("status", "ok");
            jsonResult.put("message", "批量导入成功！");
        }

        ResponseUtil.write(response, jsonResult);

        return null;

    }

    //导出信息
    @RequestMapping("/exportExcel")
    public void exportExcel(HttpServletResponse response) throws UnsupportedEncodingException {

        List<Crew> crewList = crewService.getAll();
        // 设置响应输出的头类型(设置响应类型)
        String fileName = "船员信息";
        response.setHeader("content-Type", "application/vnd.ms-excel");
        // 下载文件的默认名称(设置下载文件的默认名称)
        response.setHeader("Content-disposition", "attachment;filename="+new String(fileName.getBytes("utf-8"), "iso8859-1")+".xls");
        //导出操作
        try {
            Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("船员信息","1"),Crew.class,crewList);
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //导出模板
    @RequestMapping("/exportExcelTel")
    public void export(HttpServletResponse response) throws UnsupportedEncodingException {

        List<Crew> crewTel = crewService.getTel();
        // 设置响应输出的头类型(设置响应类型)
        String fileName = "船员信息模板";
        response.setCharacterEncoding("utf-8");
        response.setHeader("content-Type", "application/vnd.ms-excel");
        // 下载文件的默认名称(设置下载文件的默认名称)
        response.setHeader("Content-disposition", "attachment;filename="+new String(fileName.getBytes("utf-8"), "iso8859-1")+".xls");
        //导出操作
        try {
            Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("船员信息(注：工号必填，其他列可删减)","1"),Crew.class,crewTel);
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //编辑与查看全部信息
    public  ModelAndView selectInfo(String id, HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("roleId", request.getSession().getAttribute("state"));
        List<Role> roleList = roleService.getOther(map);
        ModelAndView mav = new ModelAndView();
        Crew crew = crewService.findById(id);
        mav.addObject("crew", crew);
        mav.addObject("roleList", roleList);
        return mav;
    }



}
