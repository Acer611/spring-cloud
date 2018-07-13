package com.style.springcloud.cloudrabbitmq.controller;


import com.style.springcloud.cloudrabbitmq.RabbitMqSender;
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


    /**
     * 发送测试消息队列
     */
    @RequestMapping(value = "/addRabbitMq", method = RequestMethod.GET)
    @ResponseBody
    public void addEntity() {
        rabbitMqSender.send("你好啊，李银河！！");
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    @ResponseBody
    public void addUser(){
        User user = new User();
        user.setName("奇衡三");
        user.setAge(20);
        rabbitMqSender.addUser(user);

    }


}
