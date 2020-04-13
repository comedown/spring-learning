package com.young.springframework.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AnnotationBasedAop {

    @Bean
    public MyAspect myAspect() {
        return new MyAspect();
    }

    @Bean
    public MyService myService() {
        return new MyServiceImpl();
    }

}
