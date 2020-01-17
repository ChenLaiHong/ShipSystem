package com.lh.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lh.pojo.Major;
import com.lh.pojo.Notice;
import com.lh.pojo.PageBean;
import com.lh.pojo.Result;
import com.lh.service.NoticeService;
import com.lh.utils.DateJsonValueProcessor;
import com.lh.utils.ResponseUtil;
import com.lh.utils.ResultData;
import com.lh.utils.StringUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

import static com.lh.utils.CommentUtils.findListFirst;
import static com.lh.utils.CommentUtils.findListSecond;

/**
 * Created by laiHom on 2019/8/23.
 */
@Controller
@RequestMapping("/notice")
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

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


        List<Notice> list = noticeService.listF(map);
        Integer total = noticeService.getTotalF(map);
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
        mav.addObject("save_url", "/notice/add");
        mav.setViewName("/admin/noticeAddOrUpdate");
        return mav;
    }

    @RequestMapping("/add")
    public String add(Notice notice, HttpServletResponse response, HttpServletRequest request) throws Exception {

        notice.setNoticePerson((String) request.getSession().getAttribute("userName"));
        notice.setNoticeTime(new Date());
        int resultTotal = noticeService.addNotice(notice);
        Result result = new Result();
        Gson gson = new Gson();
        if (resultTotal > 0) {
            result.setSuccess(true);
            result.setMsg("添加成功");
        } else {
            result.setSuccess(false);
            result.setMsg("添加失败");
        }
        ResponseUtil.write(response, gson.toJson(result));
        return null;
    }

    @RequestMapping("/toEdit")
    public ModelAndView toEdit(@RequestParam(value="noticeId",required=false)String noticeId) throws Exception {
        ModelAndView mav = new ModelAndView();

        Notice notice = noticeService.findById(Integer.parseInt(noticeId));

        mav.addObject("notice", notice);
        mav.addObject("btn_text", "修改");
        mav.addObject("save_url", "/notice/update?noticeId="+noticeId);


        mav.setViewName("/admin/noticeAddOrUpdate");
        return mav;
    }

    @RequestMapping("/update")
    public String update(Notice notice, HttpServletResponse response, HttpServletRequest request) throws Exception {
        notice.setNoticePerson((String) request.getSession().getAttribute("userName"));
        int resultTotal = noticeService.updateNotice(notice);
        Result result = new Result();
        Gson gson = new Gson();
        if (resultTotal > 0) {
            result.setSuccess(true);
            result.setMsg("修改成功");
        } else {
            result.setSuccess(false);
            result.setMsg("修改失败");
        }
        ResponseUtil.write(response, gson.toJson(result));
        return null;
    }

    //删除
    @RequestMapping("/delete")
    public String delete(@RequestParam(value = "ids", required = false) String ids, HttpServletResponse response)
            throws Exception {
        String[] idsStr = ids.split(",");
        Gson gson = new Gson();
        Result result = new Result();
        noticeService.delete(idsStr);
        result.setSuccess(true);
        ResponseUtil.write(response, gson.toJson(result));
        return null;
    }

    //更新状态setState
    @RequestMapping("/setState")
    public String setState(@RequestParam(value = "noticeId", required = false) String noticeId, HttpServletResponse response)
            throws Exception {
        Gson gson = new Gson();
        Result result = new Result();
        Notice notice = noticeService.findById(Integer.parseInt(noticeId));
        if(notice.getNoticeState() == 0){
            notice.setNoticeState(1);
        }else {
            notice.setNoticeState(0);
        }
        noticeService.updateNotice(notice);
        result.setSuccess(true);
        ResponseUtil.write(response, gson.toJson(result));
        return null;
    }


}
