package com.style.springcloud.cloudrabbitmq;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * 消息队列接受类
 * @author  Gaofei
 * @Date   2018-07-06
 */


//通过@RabbitListener注解定义该类对hello队列的监听，并用@RabbitHandler注解来指定对消息的处理方法


//@RabbitListener(queues = "hello")
@EnableBinding(Sink.class)
public class RabbitMqReceiver {

    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        System.out.println("Received: " + payload);
    }

   // @RabbitHandler
  /*  public void receive(String content) {
        System.out.println("Receiver : " + content);
    }*/

}
