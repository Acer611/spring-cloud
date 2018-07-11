package com.style.springcloud.eurekaconsumer.service;


import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback  implements IConsumer{

    @Override
    public int consumer(Integer operand1, Integer operand2) {
        int result =  operand1 + operand2 + 10;
        return  result;
    }


}
