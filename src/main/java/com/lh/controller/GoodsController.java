package com.lh.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lh.pojo.*;
import com.lh.service.EquipmentService;
import com.lh.service.GoodsOperateService;
import com.lh.service.ShipInfoService;
import com.lh.utils.ResponseUtil;
import com.lh.utils.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.lh.utils.CommentUtils.res;

;

/**
 * Created by laiHom on 2020/1/25.
 */
@Controller
@RequestMapping("/goods")
@Slf4j
public class GoodsController {
    @Autowired
    ShipInfoService shipInfoService;

    @Autowired
    GoodsOperateService goodsOperateService;


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

        List<GoodsOperate> list = goodsOperateService.list(map);
        Integer total = goodsOperateService.getTotal(map);
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
        mav.addObject("save_url", "/goods/add");
        mav.setViewName("/admin/goodsAddOrUpdate");
        return mav;
    }

    @RequestMapping("/add")
    public String add(GoodsOperate goodsOperate, HttpServletResponse response) throws Exception {

        int resultTotal = goodsOperateService.add(goodsOperate);
        Gson gson = new Gson();
        ResponseUtil.write(response, gson.toJson(res(resultTotal)));
        return null;
    }

    @RequestMapping("/toEdit")
    public ModelAndView toEdit(@RequestParam(value="operateId",required=false)String operateId) throws Exception {
        List<ShipInfo> shipInfoList = shipInfoService.getAll();
        ModelAndView mav = new ModelAndView();
        GoodsOperate goodsOperate = goodsOperateService.findById(Integer.parseInt(operateId));
        mav.addObject("goodsOperate", goodsOperate);
        mav.addObject("shipInfoList", shipInfoList);
        mav.addObject("btn_text", "修改");
        mav.addObject("save_url", "/goods/update?operateId="+operateId);

        mav.setViewName("/admin/goodsAddOrUpdate");
        return mav;
    }

    @RequestMapping("/update")
    public String update(GoodsOperate goodsOperate, HttpServletResponse response, HttpServletRequest request) throws Exception {

        int resultTotal = goodsOperateService.update(goodsOperate);
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
        goodsOperateService.delete(ids);
        result.setSuccess(true);
        ResponseUtil.write(response,gson.toJson(result));
        return null;
    }


    //导出
    @RequestMapping("/exportExcel")
    public void export(HttpServletResponse response){
        List<GoodsOperate> goodsOperateList = goodsOperateService.findAll();
        // 设置响应输出的头类型(设置响应类型)
        response.setHeader("content-Type", "application/vnd.ms-excel");
        // 下载文件的默认名称(设置下载文件的默认名称)
        response.setHeader("Content-Disposition", "attachment;filename=equipment.xls");
        //导出操作
        try {
            Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("设备信息","1"),GoodsOperate.class,goodsOperateList);
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //导出模板
    @RequestMapping("/exportExcelTel")
    public void exportTel(HttpServletResponse response) throws UnsupportedEncodingException {

        List<GoodsOperate> goodsTel = goodsOperateService.getTel();
        // 设置响应输出的头类型(设置响应类型)
        String fileName = "货物信息模板";
        response.setCharacterEncoding("utf-8");
        response.setHeader("content-Type", "application/vnd.ms-excel");
        // 下载文件的默认名称(设置下载文件的默认名称)
        response.setHeader("Content-disposition", "attachment;filename="+new String(fileName.getBytes("utf-8"), "iso8859-1")+".xls");
        //导出操作
        try {
            Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("货物信息","1"),GoodsOperate.class,goodsTel);
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
