package com.young.springframework.di;

import org.springframework.beans.factory.FactoryBean;

public class MyWorkerFactoryBean implements FactoryBean<Worker> {

    private Worker worker;

    @Override
    public Worker getObject() throws Exception {
        if (worker == null) {
            worker = createWorker();
        }
        return worker;
    }

    private Worker createWorker() {
        Worker springWorker = new SpringWorker();
        return springWorker;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
