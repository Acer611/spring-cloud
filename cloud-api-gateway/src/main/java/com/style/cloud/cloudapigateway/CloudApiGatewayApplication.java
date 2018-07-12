package com.style.cloud.cloudapigateway;

import com.style.cloud.cloudapigateway.fillter.AccessFilter;
import com.style.cloud.cloudapigateway.fillter.ErrorFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 使用@EnableZuulProxy注解开启Zuul的功能。
 * @Auth Gaofei
 * @Date 2018-07-11
 */
@EnableSwagger2
@EnableZuulProxy
@SpringBootApplication
public class CloudApiGatewayApplication {


    /**
     * 注入AccessFilterBean
     * 每次请求前先进入当前Filter,通过过滤逻辑处理后，在进入相应的路由
     * @return
     */
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }

    /**
     * 注入错入过滤的Filter
     * @return
     */
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudApiGatewayApplication.class, args);


    }
}
