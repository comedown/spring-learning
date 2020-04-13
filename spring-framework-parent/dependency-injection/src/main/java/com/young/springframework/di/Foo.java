package com.young.springframework.di;

public class Foo {

    private Bar bar;
    private Baz baz;

    public Foo(Bar bar, Baz baz) {
        this.bar =bar;
        this.baz =baz;
    }

    public void doSomething(String something) {
        System.out.println("do sth: " + something);
    }

}
