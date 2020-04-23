package com.lh.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lh.pojo.*;
import com.lh.service.ItemsService;
import com.lh.service.TainService;
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
@RequestMapping("/shipItems")
public class ItemsController {
    @Autowired
    private TainService tainService;

    @Autowired
    private ItemsService itemsService;
    /**
     * 前往项目管理页
     * @return
     */
    @RequestMapping(value = "/page")
    public String twoPage(@RequestParam("mainTainId") Integer mainTainId, Model model) {
        MainTain tain = tainService.findById(mainTainId);
        model.addAttribute("mainTainId", mainTainId);
        model.addAttribute("tain", tain);
        return "/admin/itemsManage";
    }


    @RequestMapping("/list")
    public String list(@RequestParam("mainTainId") Integer mainTainId,
                       @RequestParam(value = "page", required = false) String page,
                       @RequestParam(value = "limit", required = false) String rows,
                       @RequestParam(value = "q", required = false) String q,
                       HttpServletResponse response) throws Exception {
        PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("start", pageBean.getStart());
        map.put("size", pageBean.getPageSize());
        map.put("mainTainId", mainTainId);
        map.put("q", StringUtil.formatLike(q));

        List<TainItems> list = itemsService.pageList(map);
        Integer total = itemsService.getTotal(map);
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
    public ModelAndView toAdd(@RequestParam(value="mainTainId") Integer mainTainId) throws Exception {

        ModelAndView mav = new ModelAndView();
        mav.addObject("btn_text", "添加");
        mav.addObject("oneIdT", mainTainId);
        mav.addObject("save_url", "/shipItems/add");
        mav.setViewName("/admin/itemsAddOrUpdate");
        return mav;
    }
    @RequestMapping("/add")
    public String add(TainItems tainItems, @RequestParam(value="oneIdT") Integer mainTainId, HttpServletResponse response) throws Exception {

        tainItems.setMainTainId(mainTainId);
        int resultTotal = itemsService.add(tainItems);
        Gson gson = new Gson();
        ResponseUtil.write(response, gson.toJson(res(resultTotal)));
        return null;
    }

    @RequestMapping("/toEdit")
    public ModelAndView toEdit(@RequestParam(value = "itemId", required = false) Integer itemId) throws Exception {
        TainItems tainItems = itemsService.findById(itemId);
        ModelAndView mav = new ModelAndView();
        mav.addObject("itemId", itemId);
        mav.addObject("tainItems", tainItems);
        mav.addObject("btn_text", "修改");
        mav.addObject("save_url", "/shipItems/update?itemId="+itemId);
        mav.setViewName("/admin/itemsAddOrUpdate");
        return mav;
    }

    @RequestMapping("/update")
    public String update(TainItems tainItems, HttpServletResponse response) throws Exception {

        int resultTotal = itemsService.update(tainItems);
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
        itemsService.delete(ids);
        result.setSuccess(true);
        ResponseUtil.write(response,gson.toJson(result));
        return null;
    }
}
