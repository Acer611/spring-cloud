package com.style.springcloud.eurekaconsumer.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 创建一个Feign的客户端接口定义。使用@FeignClient注解来指定这个接口所要调用的服务名称，
 * 接口中定义的各个函数使用Spring MVC的注解就可以来绑定服务提供方的REST接口，
 * 比如下面就是绑定eureka-client服务的/add接口的例子
 */
@FeignClient(name = "eureka-client", fallback=HystrixClientFallback.class)
public interface IConsumer {

    @HystrixCommand(fallbackMethod = "addMethod")
    @GetMapping("/add")
    int consumer(@RequestParam(value = "operand1", defaultValue = "3") Integer operand1,@RequestParam(value = "operand2", defaultValue = "3") Integer operand2);


}
