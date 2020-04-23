package com.lh.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lh.pojo.*;
import com.lh.service.GrateService;
import com.lh.utils.ResponseUtil;
import com.lh.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Action;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.lh.utils.CommentUtils.res;

/**
 * Created by laiHom on 2020/4/18.
 */
@Controller
@RequestMapping("/grade")
public class GrateController {

    @Autowired
    private GrateService grateService;

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

        List<Grate> list = grateService.list(map);
        Integer total = grateService.getTotal(map);
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
        mav.addObject("save_url", "/grade/add");
        mav.setViewName("/admin/gradeAddOrUpdate");
        return mav;
    }

    @RequestMapping("/add")
    public String add(Grate grate, HttpServletResponse response) throws Exception {

        int resultTotal = grateService.add(grate);
        Gson gson = new Gson();
        ResponseUtil.write(response, gson.toJson(res(resultTotal)));
        return null;
    }

    @RequestMapping("/toEdit")
    public ModelAndView toEdit(@RequestParam(value="gradeId",required=false)String gradeId) throws Exception {

        ModelAndView mav = new ModelAndView();
        Grate grate = grateService.findById(Integer.parseInt(gradeId));
        mav.addObject("grate", grate);
        mav.addObject("btn_text", "修改");
        mav.addObject("save_url", "/grade/update?gradeId="+gradeId);

        mav.setViewName("/admin/gradeAddOrUpdate");
        return mav;
    }

    @RequestMapping("/update")
    public String update(Grate grate, HttpServletResponse response, HttpServletRequest request) throws Exception {

        int resultTotal = grateService.update(grate);
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
        grateService.delete(ids);
        result.setSuccess(true);
        ResponseUtil.write(response,gson.toJson(result));
        return null;
    }
}
