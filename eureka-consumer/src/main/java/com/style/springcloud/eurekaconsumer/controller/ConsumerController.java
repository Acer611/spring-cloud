package com.style.springcloud.eurekaconsumer.controller;

import com.style.springcloud.eurekaconsumer.service.FileUploadService;
import com.style.springcloud.eurekaconsumer.service.IConsumer;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.*;


/**
 *
 *
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {


    @Autowired
    IConsumer consumer;
    @Autowired
    FileUploadService fileUploadService;


    /**
     * 简单的加法
     * @return
     */
    @ResponseBody
    @GetMapping("/add")
    public int operation(){
        int summer = consumer.consumer(3,3);
        return summer;
    }


    /**
     * 文件上传
     * @throws FileNotFoundException
     */
    @ResponseBody
    @GetMapping("/upload")
    public void fileUpload() throws FileNotFoundException {

        File file = new File("E:\\root_2018-06-20.csv");
        DiskFileItem fileItem = (DiskFileItem) new DiskFileItemFactory().createItem("file",
                MediaType.TEXT_PLAIN_VALUE, true, file.getName());

        try (InputStream input = new FileInputStream(file); OutputStream os = fileItem.getOutputStream()) {
            IOUtils.copy(input, os);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid file: " + e, e);
        }

        MultipartFile multi = new CommonsMultipartFile(fileItem);

        fileUploadService.handleFileUpload(multi);

    }

}
