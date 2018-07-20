package com.style.springcloud.cloudrabbitmq.service.receiver;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * 定义指定消息队列接收类
 */
@RabbitListener(queues = "topic.message")
@EnableBinding(Sink.class)
public class TopExchangeReceiver {

    @RabbitHandler
    public void receive(String content) {
        System.out.println("TopExchangeReceiver----->Receiver : " + content);
    }



}
