package com.lh.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lh.pojo.*;
import com.lh.service.*;

import com.lh.utils.*;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.lh.utils.FileUploadUtil.*;

/**
 * Created by laiHom on 2020/1/18.
 */
@Controller
@RequestMapping("/person")
public class PersonController {
    /**上传地址*/
    @Value("${file.upload.path}")
    private String filePath;

    @Autowired
    private CrewService crewService;
    @Autowired
    private ImageService imageService;

    @RequestMapping("/toInfo")
    public ModelAndView toInfo(HttpServletRequest request){
        Crew crew = crewService.findById((String) request.getSession().getAttribute("id"));
        Image image = imageService.findById((String) request.getSession().getAttribute("id"));

        String personPhoto = null;
        if(image != null){
            personPhoto =  image.getPersonPhoto();
        }
        ModelAndView mav = new ModelAndView();

        mav.addObject("person", crew);
        mav.addObject("personPhoto", personPhoto);
        mav.setViewName("/person/crewInfo");
        return mav;
    }

//

    @RequestMapping("/saveInfo")
    public String list(Crew crew,@RequestParam("personPhoto") MultipartFile file) throws Exception {

        if (!file.isEmpty()) {


            // 存放上传图片文件夹
            String imageName = getImgDirFile(file,filePath);

            Image image = new Image();
            image.setPersonId(crew.getLoginId());
            image.setPersonPhoto(imageName);
            Image result = imageService.findById(crew.getLoginId());
            if(result == null){
                imageService.inster(image);
            }else {
                imageService.update(image);
            }
        }
        crewService.update(crew);

        return "redirect:/person/toInfo";
    }

    //修改密码
    @RequestMapping("/modifyPassword")
    public String modifyPassword( @RequestParam(value = "password") String password,@RequestParam(value = "newPassword") String newPassword, HttpServletResponse response, HttpServletRequest request) throws Exception {
        JSONObject result1=new JSONObject();
        Crew crew = crewService.findById((String) request.getSession().getAttribute("id"));
        if(!crew.getPassword().equals(MdUtil.md5(password))){
            result1.put("false", false);
        }else {
            crew.setPassword(MdUtil.md5(newPassword));
            int result = crewService.update(crew);

            if (result > 0) {
                result1.put("success", true);
            } else {
                result1.put("false", false);
            }
        }
        ResponseUtil.write(response, result1);
        return null;
    }




}
