package com.style.springcloud.cloudrabbitmq.service.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * MQ发送者类
 */
@Component
public class RabbitMQsender2 {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send1() {
        String context = "hi, i am message 1";
        System.out.println("Sender : " + context);
        this.amqpTemplate.convertAndSend("exchange", "topic.message", context);
    }

    public void send2() {
        String context = "hi, i am messages 2";
        System.out.println("Sender2 : " + context);
        this.amqpTemplate.convertAndSend("exchange", "topic.messages", context);
    }
}
