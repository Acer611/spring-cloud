package com.style.springcloud.eurekaconsumer.service;

public class HystrixClientFallback  implements IConsumer{
    @Override
    public int consumer(Integer operand1, Integer operand2) {
        return 0;
    }


}
