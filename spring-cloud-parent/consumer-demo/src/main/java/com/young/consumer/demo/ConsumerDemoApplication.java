package com.young.consumer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @EnableEurekaClient 和 @EnableDiscoveryClient 都是让eureka发现该服务并注册到eureka上的注解
 * 相同点：都能让注册中心Eureka发现，并将该服务注册到注册中心上；
 * 不同点：@EnableEurekaClient只适用于Eureka作为注册中心，而@EnableDiscoveryClient可以是其他注册中心；
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDemoApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
