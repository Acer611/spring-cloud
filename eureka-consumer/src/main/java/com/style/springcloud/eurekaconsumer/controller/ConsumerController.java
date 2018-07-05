package com.style.springcloud.eurekaconsumer.controller;

import com.style.springcloud.eurekaconsumer.service.IConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 *
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {


    @Autowired
    IConsumer consumer;


    @ResponseBody
    @GetMapping("/add")
    public int operation(){
        int summer = consumer.consumer(3,3);
        return summer;
    }
}
