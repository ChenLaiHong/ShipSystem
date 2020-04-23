package com.lh.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lh.pojo.*;
import com.lh.service.TainService;
import com.lh.utils.ResponseUtil;
import com.lh.utils.StringUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

import static com.lh.utils.CommentUtils.res;

/**
 * Created by laiHom on 2020/4/18.
 */
@Controller
@RequestMapping("/tain")
public class TainController {
    @Autowired
    private TainService tainService;

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

        List<MainTain> list = tainService.list(map);
        Integer total = tainService.getTotal(map);
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
        mav.addObject("btn_text", "添加");
        mav.addObject("save_url", "/tain/add");
        mav.setViewName("/admin/tainAddOrUpdate");
        return mav;
    }

    @RequestMapping("/add")
    public String add(MainTain mainTain, HttpServletResponse response) throws Exception {

        int resultTotal = tainService.add(mainTain);
        Gson gson = new Gson();
        ResponseUtil.write(response, gson.toJson(res(resultTotal)));
        return null;
    }

    @RequestMapping("/toEdit")
    public ModelAndView toEdit(@RequestParam(value="mainTainId",required=false)String mainTainId) throws Exception {

        ModelAndView mav = new ModelAndView();
        MainTain tain = tainService.findById(Integer.parseInt(mainTainId));
        mav.addObject("tain", tain);
        mav.addObject("btn_text", "修改");
        mav.addObject("save_url", "/tain/update?mainTainId="+mainTainId);

        mav.setViewName("/admin/tainAddOrUpdate");
        return mav;
    }

    @RequestMapping("/update")
    public String update(MainTain mainTain, HttpServletResponse response, HttpServletRequest request) throws Exception {

        int resultTotal = tainService.update(mainTain);
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
        tainService.delete(ids);
        result.setSuccess(true);
        ResponseUtil.write(response,gson.toJson(result));
        return null;
    }


    @GetMapping("/export")
    public void export(HttpServletResponse response){
        List<MainTain> repairList = tainService.selectAll();
        // 设置响应输出的头类型(设置响应类型)
        response.setHeader("content-Type", "application/vnd.ms-excel");
        // 下载文件的默认名称(设置下载文件的默认名称)
        response.setHeader("Content-Disposition", "attachment;filename=repair.xls");
        //导出操作
        try {
            Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("船舶年度维修与保养报表","1"),MainTain.class,repairList);
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
