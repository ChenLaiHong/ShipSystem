package com.lh.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lh.pojo.*;
import com.lh.service.EquipmentService;
import com.lh.service.RepairService;
import com.lh.service.ShipInfoService;
import com.lh.utils.FileUploadUtil;
import com.lh.utils.ResponseUtil;
import com.lh.utils.StringUtil;
import lombok.extern.slf4j.Slf4j;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.lh.utils.CommentUtils.res;
import static com.lh.utils.FileUploadUtil.getImgDirFile;

;

/**
 * Created by laiHom on 2020/1/25.
 */
@Controller
@RequestMapping("/repair")
@Slf4j
public class RepairController {

    /**上传地址*/
    @Value("${file.upload.path}")
    private String filePath;

    @Autowired
    ShipInfoService shipInfoService;

    @Autowired
    RepairService repairService;


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

        List<Repair> list = repairService.list(map);
        Integer total = repairService.getTotal(map);
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

        List<ShipInfo> shipInfoList = shipInfoService.getAll();
        ModelAndView mav = new ModelAndView();
        mav.addObject("repairId", "");
        mav.addObject("shipInfoList", shipInfoList);
        mav.addObject("btn_text", "添加");
        mav.addObject("save_url", "/repair/add");
        mav.setViewName("/admin/repairAddOrUpdate");
        return mav;
    }

    @RequestMapping("/add")
    public String add(Repair repair, HttpServletResponse response) throws Exception {

        int resultTotal = repairService.add(repair);
        Gson gson = new Gson();
        ResponseUtil.write(response, gson.toJson(res(resultTotal)));
        return null;
    }

    @RequestMapping("/toEdit")
    public ModelAndView toEdit(@RequestParam(value="repairId",required=false)String repairId) throws Exception {
        List<ShipInfo> shipInfoList = shipInfoService.getAll();
        ModelAndView mav = new ModelAndView();
        Repair repair = repairService.findById(Integer.parseInt(repairId));
        mav.addObject("repair", repair);
        mav.addObject("repairId", repairId);
        mav.addObject("shipInfoList", shipInfoList);
        mav.addObject("btn_text", "修改");
        mav.addObject("save_url", "/repair/update?repairId="+repairId);

        mav.setViewName("/admin/repairAddOrUpdate");
        return mav;
    }

    @RequestMapping("/update")
    public String update(Repair repair, HttpServletResponse response) throws Exception {

        int resultTotal = repairService.update(repair);
        Gson gson = new Gson();
        ResponseUtil.write(response, gson.toJson(res(resultTotal)));
        return null;
    }

    //删除
    @RequestMapping("/delete")
    public String delete(@RequestParam(value = "ids", required = false) String ids, HttpServletResponse response)
            throws Exception {

        Gson gson = new Gson();
        Result result = new Result();
        repairService.delete(ids);
        result.setSuccess(true);
        ResponseUtil.write(response,gson.toJson(result));
        return null;
    }


    //导出
    @RequestMapping("/exportExcel")
    public void export(HttpServletResponse response){
        List<Repair> repairList = repairService.findAll();
        // 设置响应输出的头类型(设置响应类型)
        response.setHeader("content-Type", "application/vnd.ms-excel");
        // 下载文件的默认名称(设置下载文件的默认名称)
        response.setHeader("Content-Disposition", "attachment;filename=repair.xls");
        //导出操作
        try {
            Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("维修信息","1"),Repair.class,repairList);
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //导出模板
    @RequestMapping("/exportExcelTel")
    public void exportTel(HttpServletResponse response) throws UnsupportedEncodingException {

        List<Repair> repairTel = repairService.getTel();
        // 设置响应输出的头类型(设置响应类型)
        String fileName = "维修信息模板";
        response.setCharacterEncoding("utf-8");
        response.setHeader("content-Type", "application/vnd.ms-excel");
        // 下载文件的默认名称(设置下载文件的默认名称)
        response.setHeader("Content-disposition", "attachment;filename="+new String(fileName.getBytes("utf-8"), "iso8859-1")+".xls");
        //导出操作
        try {
            Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("维修信息","1"),Repair.class,repairTel);
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //附件上传测试
    @ResponseBody
    @RequestMapping("uploadAnnex")
    public Map uploadAnnex(MultipartFile file,@RequestParam("repairId")Integer repairId){
        try{
            if(file!=null){
                String fileName = getImgDirFile(file,filePath);
                Map<String,Object> map2=new HashMap<>();
                Map<String,Object> map=new HashMap<>();
                if (repairId != null){
                    String file_url = repairService.findById(repairId).getShipReport();
                    if(file_url != null){
                        FileUploadUtil.deleteFile(filePath+file_url);
                    }
                }
                map.put("code",0);
                map.put("msg","");
                map.put("data",map2);
                map2.put("value",fileName);
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
