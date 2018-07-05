package com.style.springcloud.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * 这是一个provider server
 * @author  Gaofei create by Gaofei
 * 通过@EnableDiscoveryClient 来激活 Eureka 中的 DiscoveryClient
 */

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
}
