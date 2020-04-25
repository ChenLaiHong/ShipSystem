package com.lh.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lh.pojo.*;
import com.lh.service.PrintService;
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
@RequestMapping("/print")
@Slf4j
public class PrintController {

    /**上传地址*/
    @Value("${file.upload.path}")
    private String filePath;

    @Autowired
    ShipInfoService shipInfoService;

    @Autowired
    PrintService printService;


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

        List<BluePrint> list = printService.list(map);
        Integer total = printService.getTotal(map);
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
        mav.addObject("printId", "");

        mav.addObject("btn_text", "添加");
        mav.addObject("save_url", "/print/add");
        mav.setViewName("/admin/printAddOrUpdate");
        return mav;
    }

    @RequestMapping("/add")
    public String add(BluePrint bluePrint, HttpServletResponse response,HttpServletRequest request) throws Exception {
        String name = (String) request.getSession().getAttribute("fileOrName");
        bluePrint.setPrintName(name);
        int resultTotal = printService.add(bluePrint);
        Gson gson = new Gson();
        ResponseUtil.write(response, gson.toJson(res(resultTotal)));
        return null;
    }

    @RequestMapping("/toEdit")
    public ModelAndView toEdit(@RequestParam(value="printId",required=false)String printId) throws Exception {

        ModelAndView mav = new ModelAndView();
        BluePrint bluePrint = printService.findById(Integer.parseInt(printId));
        mav.addObject("bluePrint", bluePrint);
        mav.addObject("printId", printId);
        mav.addObject("btn_text", "修改");
        mav.addObject("save_url", "/print/update?printId="+printId);

        mav.setViewName("/admin/printAddOrUpdate");
        return mav;
    }

    @RequestMapping("/update")
    public String update(BluePrint bluePrint, HttpServletResponse response,HttpServletRequest request) throws Exception {

        String name = (String) request.getSession().getAttribute("fileOrName");
        bluePrint.setPrintName(name);
        int resultTotal = printService.update(bluePrint);
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
        printService.delete(ids);
        result.setSuccess(true);
        ResponseUtil.write(response,gson.toJson(result));
        return null;
    }




    //附件上传测试
    @ResponseBody
    @RequestMapping("uploadAnnex")
    public Map uploadAnnex(MultipartFile file, @RequestParam("printId")Integer printId, HttpServletRequest request){
        System.out.println(file.getOriginalFilename()+"文件原始名字。。。。。。。。。");
        String name = file.getOriginalFilename().split("\\.")[0];
        request.getSession().setAttribute("fileOrName",name);

        try{
            if(file!=null){
                String fileName = getImgDirFile(file,filePath);
                Map<String,Object> map2=new HashMap<>();
                Map<String,Object> map=new HashMap<>();
                if (printId != null){
                    String file_url = printService.findById(printId).getPrintUrl();
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
