package com.style.springcloud.cloudrabbitmq.controller;


import com.style.springcloud.cloudrabbitmq.service.sender.RabbitMQsender2;
import com.style.springcloud.cloudrabbitmq.service.sender.RabbitMqSender;
import com.style.springcloud.cloudrabbitmq.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * Rabbit MQ 控制层
 * @author  Gaofei
 * @Date 2018-07-06
 *
 */
@RestController
@RequestMapping(value="/rabbitmq")
public class RabbitMqController {
    @Autowired
    private RabbitMqSender rabbitMqSender;
    @Autowired
    private RabbitMQsender2 rabbitMQsender2;


    /**
     * 发送测试消息队列
     */
    @RequestMapping(value = "/addRabbitMq", method = RequestMethod.GET)
    @ResponseBody
    public void addEntity() {
        rabbitMqSender.send("你好啊，李银河！！");
    }



    /**
     * 发送测试消息队列
     */
    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    @ResponseBody
    public void addUser(){
        User user = new User();
        user.setName("奇衡三");
        user.setAge(20);
        rabbitMqSender.addUser(user);

    }


    /**
     * 发送测试消息队列
     */
    @RequestMapping(value = "/send", method = RequestMethod.GET)
    @ResponseBody
    public void send() {

        rabbitMQsender2.send1();
        rabbitMQsender2.send2();
    }



}
