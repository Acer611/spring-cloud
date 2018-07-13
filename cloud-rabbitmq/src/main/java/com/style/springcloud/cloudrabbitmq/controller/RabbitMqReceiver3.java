package com.style.springcloud.cloudrabbitmq.controller;


import com.style.springcloud.cloudrabbitmq.RabbitMqSender;
import com.style.springcloud.cloudrabbitmq.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

import java.util.Map;

/**
 * 消息队列接受类
 * @author  Gaofei
 * @Date   2018-07-06
 */


//通过@RabbitListener注解定义该类对hello队列的监听，并用@RabbitHandler注解来指定对消息的处理方法


@RabbitListener(queues = "hello")
@EnableBinding(Sink.class)
public class RabbitMqReceiver3 {

   /* @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        System.out.println("Received: " + payload);
    }*/

    @RabbitHandler
    public void receive1(String content) {
        System.out.println("RabbitMqReceiver3----->Receiver1 : " + content);
    }

    @RabbitHandler
    public void receive2(Map content) {
        System.out.println("RabbitMqReceiver3----->Receiver2 : " + content);
    }

    @RabbitHandler
    public void receive3(User user) {
        System.out.println("RabbitMqReceiver3----->Receiver3 : " + user.getName() + "   " +user.getAge());
    }


}
