package com.style.springcloud.cloudrabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//@Configuration
//@ComponentScan("com.style.springcloud.cloudrabbitmq.controller")
//@EnableAutoConfiguration(exclude = RabbitAutoConfiguration.class)
@SpringBootApplication
public class CloudRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudRabbitmqApplication.class, args);
	}
}
