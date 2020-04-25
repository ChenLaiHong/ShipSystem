package com.lh.controller;

import com.lh.pojo.Role;
import com.lh.service.RoleService;
import com.lh.utils.MdUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by laiHom on 2020/1/20.
 */
@Controller
public class PageController {

    @Autowired
    private RoleService roleService;


    //访问登陆页面
    @RequestMapping("/index")
    public String index(HttpServletRequest request){
        List<Role> roleList = roleService.getAll();
        System.out.println(roleList.size()+"================daxiao");
        request.getSession().setAttribute("roleList",roleList);
        return "index";
    }


    @RequestMapping("/main")
    public String main(){
        return "/admin/noticeManage";
    }

    @RequestMapping("/toCrew")
    public String toCrew(){
        return "/admin/crewManage";
    }

    @RequestMapping("/toEquipment")
    public String toEquipment(){
        return "/admin/equipmentManage";
    }
    //
    @RequestMapping("/toRepair")
    public String toRepair(){
        return "/admin/repairManage";
    }

    //
    @RequestMapping("/toGoods")
    public String toGoods(){
        return "/admin/goodsManage";
    }

    //
    @RequestMapping("/toGrate")
    public String toGrate(){
        return "/admin/grateManage";
    }

    @RequestMapping("/toTain")
    public String toTain(){
        return "/admin/tainManage";
    }

    @RequestMapping("/toShipItems")
    public String toShipItems(){
        return "/admin/itemsManage";
    }
    //
    @RequestMapping("/toRole")
    public String toRole(){
        return "/admin/roleManage";
    }

    //notePad
    @RequestMapping("/person/toNotePad")
    public String notePad(){
        return "/admin/notePad";
    }

    @RequestMapping("/toPrint")
    public String toPrint(){
        return "/admin/printManage";
    }
    //
    @RequestMapping("/toShipInfo")
    public String toShipInfo(){
        return "/admin/shipInfoManage";
    }
    //登陆操作
    @PostMapping("/login")
    public String login(HttpServletRequest request, Map<String,Object> map,Model model) {
        String name = request.getParameter("adminName");
        String password = request.getParameter("adminPassword");
        int state = Integer.parseInt(request.getParameter("state"));
        request.getSession().setAttribute("state", state);
        //获取subject
        Subject subject = SecurityUtils.getSubject();
        //封装用户信息
        UsernamePasswordToken token = new UsernamePasswordToken(name, MdUtil.md5(password));

        try {

            subject.login(token);
            //登陆成功

//            request.getSession().removeAttribute("state");
            return "/admin/AdminMain";

        }catch (UnknownAccountException e){
            //登陆用户名不存在
            map.put("msg", "请检查用户名、密码、身份！");

        }catch (IncorrectCredentialsException e){
            //登陆失败，密码错误
            map.put("msg", "密码错误!");
        }
        return "index";

    }



}
