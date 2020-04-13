package com.young.springframework.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDenpendyInject {

    public static void main(String[] args) {
//        testConstructorBased();
        testFactoryBean();
    }

    public static void testConstructorBased() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("constructor-based.xml");
//        Foo foo = (Foo) classPathXmlApplicationContext.getBean("foo");
//        foo.doSomething("hh");
//        Bar bar = (Bar) classPathXmlApplicationContext.getBean("bar");
//        bar.doFoo("dd");
        Baz baz = (Baz) classPathXmlApplicationContext.getBean("baz");
        baz.doFoo("gg");
    }

    public static void testFactoryBean() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("factory-bean.xml");
        Worker worker = (Worker) classPathXmlApplicationContext.getBean("myWorkerFactoryBean");
        worker.doWork("测试FactoryBean");
    }

}
