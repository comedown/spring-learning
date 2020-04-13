package com.young.springframework.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAop {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationBasedAop.class);
        MyService myService = (MyService) applicationContext.getBean("myService");
        myService.echo("test");
    }

}
