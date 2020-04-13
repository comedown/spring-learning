package com.young.springframework.di;

public class SpringWorker implements Worker {
    @Override
    public void doWork(String content) {
        System.out.println("do work : " + content);
    }
}
