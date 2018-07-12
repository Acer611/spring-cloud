package com.style.springcloud.eurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * 这是一个消费者
 * 通过@EnableFeignClients注解开启扫描Spring Cloud Feign客户端的功能
 * 通过 @EnableCircuitBreaker或@EnableHystrix注解开启Hystrix的使用
 * @author  Gaofei 2018-07-05
 *
 *
 *
 *  *
 * 注意：这里我们还可以使用Spring Cloud应用中的@SpringCloudApplication注解来修饰应用主类，该注解的具体定义如下所示。
 * 我们可以看到该注解中包含了上我们所引用的三个注解，这也意味着一个Spring Cloud标准应用应包含服务发现以及断路器。
 *
 *@Target({ElementType.TYPE})
 *@Retention(RetentionPolicy.RUNTIME)
 *@Documented
 *@Inherited
 *@SpringBootApplication
 *@EnableDiscoveryClient
 *@EnableCircuitBreaker
 *
 *
 */

//@EnableCircuitBreaker
@EnableSwagger2
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerApplication {


	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerApplication.class, args);
	}
}
