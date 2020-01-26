package com.lh.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lh.pojo.*;
import com.lh.service.EquipmentService;
import com.lh.service.ShipInfoService;
import com.lh.utils.ResponseUtil;
import com.lh.utils.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import net.sf.json.JSONObject;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.lh.utils.CommentUtils.res;

/**
 * Created by laiHom on 2020/1/25.
 */
@Controller
@RequestMapping("/equipment")
@Slf4j
public class EquipmentController {
    @Autowired
    ShipInfoService shipInfoService;

    @Autowired
    EquipmentService equipmentService;


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

        List<Equipment> list = equipmentService.list(map);
        Integer total = equipmentService.getTotal(map);
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
        mav.addObject("shipInfoList", shipInfoList);
        mav.addObject("btn_text", "添加");
        mav.addObject("save_url", "/equipment/add");
        mav.setViewName("/admin/equipmentAddOrUpdate");
        return mav;
    }

    @RequestMapping("/add")
    public String add(Equipment equipment, HttpServletResponse response, HttpServletRequest request) throws Exception {

        int resultTotal = equipmentService.add(equipment);
        Gson gson = new Gson();
        ResponseUtil.write(response, gson.toJson(res(resultTotal)));
        return null;
    }

    @RequestMapping("/toEdit")
    public ModelAndView toEdit(@RequestParam(value="eid",required=false)String eid) throws Exception {
        List<ShipInfo> shipInfoList = shipInfoService.getAll();
        ModelAndView mav = new ModelAndView();
        Equipment equipment = equipmentService.findById(Integer.parseInt(eid));
        mav.addObject("equipment", equipment);
        mav.addObject("shipInfoList", shipInfoList);
        mav.addObject("btn_text", "修改");
        mav.addObject("save_url", "/equipment/update?eid="+eid);

        mav.setViewName("/admin/equipmentAddOrUpdate");
        return mav;
    }

    @RequestMapping("/update")
    public String update(Equipment equipment, HttpServletResponse response, HttpServletRequest request) throws Exception {

        int resultTotal = equipmentService.update(equipment);
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
        equipmentService.delete(ids);
        result.setSuccess(true);
        ResponseUtil.write(response,gson.toJson(result));
        return null;
    }


    //导出
    @RequestMapping("/exportExcel")
    public void export(HttpServletResponse response){
        List<Equipment> equipmentList = equipmentService.findAll();
        // 设置响应输出的头类型(设置响应类型)
        response.setHeader("content-Type", "application/vnd.ms-excel");
        // 下载文件的默认名称(设置下载文件的默认名称)
        response.setHeader("Content-Disposition", "attachment;filename=equipment.xls");
        //导出操作
        try {
            Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("设备信息","1"),Equipment.class,equipmentList);
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //导出模板
    @RequestMapping("/exportExcelTel")
    public void exportTel(HttpServletResponse response) throws UnsupportedEncodingException {

        List<Equipment> equipmentTel = equipmentService.getTel();
        // 设置响应输出的头类型(设置响应类型)
        String fileName = "设备信息模板";
        response.setCharacterEncoding("utf-8");
        response.setHeader("content-Type", "application/vnd.ms-excel");
        // 下载文件的默认名称(设置下载文件的默认名称)
        response.setHeader("Content-disposition", "attachment;filename="+new String(fileName.getBytes("utf-8"), "iso8859-1")+".xls");
        //导出操作
        try {
            Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("设备信息","1"),Equipment.class,equipmentTel);
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
