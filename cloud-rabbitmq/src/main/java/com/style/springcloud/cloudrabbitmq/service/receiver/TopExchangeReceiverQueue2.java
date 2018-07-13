package com.style.springcloud.cloudrabbitmq.service.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@RabbitListener(queues = "topic.messages")
@EnableBinding(Sink.class)
public class TopExchangeReceiverQueue2 {

    @RabbitHandler
    public void receive(String content) {
        System.out.println("TopExchangeReceiverQueue2----->Receiver : " + content);
    }



}
