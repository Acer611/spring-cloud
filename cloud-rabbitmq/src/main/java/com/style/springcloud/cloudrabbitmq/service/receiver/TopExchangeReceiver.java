package com.style.springcloud.cloudrabbitmq.service.receiver;

import com.style.springcloud.cloudrabbitmq.User;
import com.style.springcloud.cloudrabbitmq.config.TopicRabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

import java.util.Map;

@RabbitListener(queues = "topic.message")
@EnableBinding(Sink.class)
public class TopExchangeReceiver {

    @RabbitHandler
    public void receive(String content) {
        System.out.println("TopExchangeReceiver----->Receiver : " + content);
    }



}
