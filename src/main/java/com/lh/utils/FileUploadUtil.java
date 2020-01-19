package com.lh.utils;


import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.UUID;

/**
 * Created by CHLaih on 2018/4/24.
 */
public class FileUploadUtil  {


        // 项目根路径下的目录  -- SpringBoot static 目录相当于是根路径下（SpringBoot 默认）
        public final static String IMG_PATH_PREFIX = "static/upload";

        public static String getImgDirFile(MultipartFile file,String filePath) throws Exception {
            String imageName = DateUtil.getCurrentDateStr() + "."
                    + file.getOriginalFilename().split("\\.")[1];
            // 定义上传文件保存路径
            String path = filePath+"rotPhoto/";
            // 新建文件
            File filepath = new File(path, imageName);
            // 判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            try {
                // 写入文件
                file.transferTo(new File(path + File.separator + imageName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "/images/rotPhoto/"+imageName;
        }


}
