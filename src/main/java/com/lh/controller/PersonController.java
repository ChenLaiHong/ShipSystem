package com.lh.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lh.pojo.*;
import com.lh.service.GradeService;
import com.lh.service.ImageService;
import com.lh.service.MajorService;
import com.lh.service.StudentService;

import com.lh.utils.*;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
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
 * Created by laiHom on 2019/8/31.
 */
@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private ImageService imageService;
    @Autowired
    private GradeService gradeService;
    @Autowired
    private MajorService majorService;

    @RequestMapping("/toInfo")
    public ModelAndView toInfo(HttpServletRequest request){
        Person person = studentService.findById((String) request.getSession().getAttribute("id"));
        Image image = imageService.findById((String) request.getSession().getAttribute("id"));
//        String personPhoto = "F:/project/IdeaProjects/javaProjects/ProfessionalChoice/src/main/resources/static/upload/imgs/";
//        if(image != null){
//            personPhoto += image.getPersonPhoto();
//        }
        String personPhoto = image.getPersonPhoto();
        ModelAndView mav = new ModelAndView();
        List<Major> majorList = majorService.getAll();
        List<Grade> gradeList = gradeService.getAll();
        mav.addObject("majorList", majorList);
        mav.addObject("gradeList", gradeList);
        mav.addObject("person", person);
        mav.addObject("personPhoto",personPhoto );
        mav.setViewName("/person/studentInfo");
        return mav;
    }

//

    @RequestMapping("/saveInfo")
    public String list(HttpServletRequest req,Person person,@RequestParam("personPhoto") MultipartFile file) throws Exception {
        if (!file.isEmpty()) {

            String imageName = DateUtil.getCurrentDateStr() + "."
                    + file.getOriginalFilename().split("\\.")[1];

            // 存放上传图片文件夹
            File fileDir = getImgDirFile();
            // 构建真实的文件路径的
            File newFile = new File(fileDir.getAbsolutePath() + File.separator + imageName);
            System.out.println(newFile.getAbsolutePath()+"**********************");
            file.transferTo(newFile);
            Image image = new Image();
            image.setPersonId(person.getLoginId());
            image.setPersonPhoto(imageName);
            Image result = imageService.findById(person.getLoginId());
            if(result == null){
                imageService.inster(image);
            }else {
                imageService.update(image);
            }
        }
        studentService.update(person);

        return "redirect:/person/toInfo";
    }

    //修改密码
    @RequestMapping("/modifyPassword")
    public String modifyPassword( @RequestParam(value = "password") String password,@RequestParam(value = "newPassword") String newPassword, HttpServletResponse response, HttpServletRequest request) throws Exception {
        JSONObject result1=new JSONObject();
        Person person = studentService.findById((String) request.getSession().getAttribute("id"));
        if(!person.getPassword().equals(MdUtil.md5(password))){
            result1.put("false", false);
        }else {
            person.setPassword(MdUtil.md5(newPassword));
            int result = studentService.update(person);

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
