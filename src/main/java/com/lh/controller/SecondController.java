package com.lh.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lh.pojo.Grate;
import com.lh.pojo.PageBean;
import com.lh.pojo.Result;
import com.lh.pojo.SecondGrade;
import com.lh.service.GrateService;
import com.lh.service.SecondService;
import com.lh.utils.ResponseUtil;
import com.lh.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.lh.utils.CommentUtils.res;

/**
 * Created by laiHom on 2020/4/18.
 */
@Controller
@RequestMapping("/secondGrade")
public class SecondController {
    @Autowired
    private GrateService grateService;

    @Autowired
    private SecondService secondService;

    /**
     * 前往二级管理页
     * @return
     */
    @RequestMapping(value = "/page")
    public String twoPage(@RequestParam("gradeId") Integer gradeId, Model model) {
        Grate grade = grateService.findById(gradeId);
        model.addAttribute("gradeId", gradeId);
        model.addAttribute("grade", grade);
        return "/admin/secondManage";
    }


    @RequestMapping("/list")
    public String list(@RequestParam("gradeId") Integer gradeId,
                       @RequestParam(value = "page", required = false) String page,
                       @RequestParam(value = "limit", required = false) String rows,
                       @RequestParam(value = "q", required = false) String q,
                       HttpServletResponse response) throws Exception {
        PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("start", pageBean.getStart());
        map.put("size", pageBean.getPageSize());
        map.put("gradeId", gradeId);
        map.put("q", StringUtil.formatLike(q));

        List<SecondGrade> list = secondService.pageList(map);
        Integer total = secondService.getTotal(map);
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
    public ModelAndView toAdd(@RequestParam(value="gradeId") Integer gradeId) throws Exception {

        ModelAndView mav = new ModelAndView();
        mav.addObject("btn_text", "添加");
        mav.addObject("oneIdT", gradeId);
        mav.addObject("save_url", "/secondGrade/add");
        mav.setViewName("/admin/secondAddOrUpdate");
        return mav;
    }
    @RequestMapping("/add")
    public String add(SecondGrade secondGrade, @RequestParam(value="oneIdT") Integer gradeId, HttpServletResponse response) throws Exception {

        secondGrade.setGradeId(gradeId);
        int resultTotal = secondService.add(secondGrade);
        Gson gson = new Gson();
        ResponseUtil.write(response, gson.toJson(res(resultTotal)));
        return null;
    }

    @RequestMapping("/toEdit")
    public ModelAndView toEdit(@RequestParam(value = "secondId", required = false) Integer secondId) throws Exception {
        SecondGrade secondGrade = secondService.findById(secondId);
        ModelAndView mav = new ModelAndView();
        mav.addObject("secondId", secondId);
        mav.addObject("secondGrade", secondGrade);
        mav.addObject("btn_text", "修改");
        mav.addObject("save_url", "/secondGrade/update?secondId="+secondId);
        mav.setViewName("/admin/secondAddOrUpdate");
        return mav;
    }

    @RequestMapping("/update")
    public String update(SecondGrade secondGrade, HttpServletResponse response) throws Exception {

        int resultTotal = secondService.update(secondGrade);
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
        secondService.delete(ids);
        result.setSuccess(true);
        ResponseUtil.write(response,gson.toJson(result));
        return null;
    }

}
