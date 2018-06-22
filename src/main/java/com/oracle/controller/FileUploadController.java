package com.oracle.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class FileUploadController {

    @RequestMapping("/fileUpload")
    @ResponseBody
    public Map<String,Object> fileUpload (@RequestParam("uplodFile") MultipartFile uplodFile, HttpSession session) throws IOException {
    	Map<String,Object> map = new HashMap<String, Object>();
    	String filePath =  session.getServletContext().getRealPath("/upload");
//        System.out.println(uplodFile.getOriginalFilename());
//        System.out.println(uplodFile.getContentType());
//        System.out.println(uplodFile.getName());
        String fileNewName = UUID.randomUUID().toString()+"."+uplodFile.getOriginalFilename().split("[.]")[1];
        FileUtils.copyInputStreamToFile(uplodFile.getInputStream(),new File(filePath+"/"+fileNewName));
        map.put("url","/ee/upload/"+fileNewName);
        return map;
    }
}
