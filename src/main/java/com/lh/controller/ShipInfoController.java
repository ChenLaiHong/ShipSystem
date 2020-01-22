package com.lh.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lh.pojo.*;
import com.lh.pojo.Result;
import com.lh.service.*;
import com.lh.utils.*;
import net.sf.json.JSONObject;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;

import static com.lh.utils.CommentUtils.res;
import static com.lh.utils.FileUploadUtil.getImgDirFile;


/**
 * Created by laiHom on 2020/1/22.
 */
@Controller
@RequestMapping("/shipInfo")
public class ShipInfoController {
    /**上传地址*/
    @Value("${file.upload.path}")
    private String filePath;
    @Autowired
    private ShipInfoService shipInfoService;



    ////////////////////////////
    @RequestMapping("/list")
    public String list(@RequestParam(value = "page", required = false) String page,
                       @RequestParam(value = "limit", required = false) String rows,
                       @RequestParam(value = "q", required = false) String q,
                       HttpServletResponse response) throws Exception {
        PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("start", pageBean.getStart());
        map.put("size", pageBean.getPageSize());
        map.put("q", StringUtil.formatLike(q));

        List<ShipInfo> list = shipInfoService.list(map);
        Integer total = shipInfoService.getTotal(map);
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
    public ModelAndView toAdd() throws Exception {

        ModelAndView mav = new ModelAndView();
        mav.addObject("shipId", "");
        mav.addObject("btn_text", "添加");
        mav.addObject("save_url", "/shipInfo/add");
        mav.setViewName("/admin/shipInfoAddOrUpdate");
        return mav;
    }

    @RequestMapping("/add")
    public String add(ShipInfo shipInfo, HttpServletResponse response) throws Exception {

        int resultTotal = shipInfoService.add(shipInfo);
        Gson gson = new Gson();
        ResponseUtil.write(response, gson.toJson(res(resultTotal)));
        return null;
    }

    @RequestMapping("/toEdit")
    public ModelAndView toEdit(@RequestParam(value="shipId",required=false)Integer shipId) throws Exception {

        ModelAndView mav = selectInfo(shipId);
        mav.addObject("shipId", shipId);
        mav.addObject("btn_text", "修改");
        mav.addObject("save_url", "/shipInfo/update?shipId="+shipId);
        mav.setViewName("/admin/shipInfoAddOrUpdate");
        return mav;
    }



    @RequestMapping("/showAll")
    public ModelAndView showAll(@RequestParam(value="shipId",required=false)Integer shipId) throws Exception {

        ModelAndView mav = selectInfo(shipId);
        mav.addObject("btn_text", "所有信息");
        mav.setViewName("/admin/shipInfoShowAllInfo");
        return mav;
    }

    @RequestMapping("/update")
    public String update(ShipInfo shipInfo, HttpServletResponse response) throws Exception {

        int resultTotal = shipInfoService.update(shipInfo);
        Gson gson = new Gson();
        ResponseUtil.write(response, gson.toJson(res(resultTotal)));
        return null;
    }
    //更新状态setState
    @RequestMapping("/setState")
    public String setState(@RequestParam(value = "shipId", required = false) Integer shipId, HttpServletResponse response)
            throws Exception {
        Gson gson = new Gson();
        Result result = new Result();
        ShipInfo shipInfo = shipInfoService.findById(shipId);
        if (shipInfo.getState() == 0) {
            shipInfo.setState(1);
        } else {
            shipInfo.setState(0);
        }
        shipInfoService.update(shipInfo);
        result.setSuccess(true);
        ResponseUtil.write(response, gson.toJson(result));
        return null;
    }



    //导出信息
    @RequestMapping("/exportExcel")
    public void exportExcel(HttpServletResponse response) throws UnsupportedEncodingException {

        List<ShipInfo> shipInfos = shipInfoService.getAll();
        // 设置响应输出的头类型(设置响应类型)
        String fileName = "船舶信息";
        response.setHeader("content-Type", "application/vnd.ms-excel");
        // 下载文件的默认名称(设置下载文件的默认名称)
        response.setHeader("Content-disposition", "attachment;filename="+new String(fileName.getBytes("utf-8"), "iso8859-1")+".xls");
        //导出操作
        try {
            Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("船舶信息","1"),ShipInfo.class,shipInfos);
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //编辑与查看全部信息
    public  ModelAndView selectInfo(Integer id){
        ModelAndView mav = new ModelAndView();
        ShipInfo shipInfo = shipInfoService.findById(id);
        mav.addObject("shipInfo", shipInfo);
        return mav;
    }


    //图片上传测试
    @ResponseBody
    @RequestMapping("upload")
    public Map upload(MultipartFile file,@RequestParam("shipId")Integer shipId){
        try{
            if(file!=null){
                String fileName = getImgDirFile(file,filePath);
                Map<String,Object> map2=new HashMap<>();
                Map<String,Object> map=new HashMap<>();
                if (shipId != null){
                    String photo_url = shipInfoService.findById(shipId).getShipImage();
                    if(photo_url != null){
                        FileUploadUtil.deleteFile(filePath+photo_url);
                    }
                }
                map.put("code",0);
                map.put("msg","");
                map.put("data",map2);
                map2.put("src",fileName);
                return map;
            }
        }catch (Exception e){
        }
        Map<String,Object> map=new HashMap<>();
        map.put("code",1);
        map.put("msg","");
        return map;

    }


}
