package com.young.springframework.aop;

public class YouServiceImpl implements YouService {
    @Override
    public void hello(String name) {
        System.out.println("hello, " + name);
    }
}
