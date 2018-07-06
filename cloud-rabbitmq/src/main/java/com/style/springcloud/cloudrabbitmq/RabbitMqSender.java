package com.style.springcloud.cloudrabbitmq;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 消息队列发送类
 * @author  Gaofei
 * @Date  2018-07-06
 */

@Component
public class RabbitMqSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(String content) {
        String date = " " + new Date();
        System.out.println("*****Sender : " + content+"  "+date);
        this.amqpTemplate.convertAndSend("hello", content);

    }
}