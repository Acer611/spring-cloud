package com.style.springcloud.eurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * 这是一个消费者
 * 通过@EnableFeignClients注解开启扫描Spring Cloud Feign客户端的功能
 * @author  Gaofei 2018-07-05
 *
 */

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerApplication {


	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerApplication.class, args);
	}
}
