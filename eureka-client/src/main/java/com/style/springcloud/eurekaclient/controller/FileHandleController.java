package com.style.springcloud.eurekaclient.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


/**
 * 文件上传操作类  尝试fegin 的上功能
 * @author  Gaofei
 * @Date 2018-07-09
 */
@RestController
@RequestMapping(value = "/file")
public class FileHandleController {


    @PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String handleFileUpload(@RequestPart(value = "file") MultipartFile file) {

        System.out.println(file.getName());
        return file.getName();
    }
}
