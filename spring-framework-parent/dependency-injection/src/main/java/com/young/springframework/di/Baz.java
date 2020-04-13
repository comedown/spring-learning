package com.young.springframework.di;

public class Baz {

    private Foo foo;

    public Baz(Foo foo) {
        this.foo = foo;
    }

    public void doFoo(String str) {
        foo.doSomething(str);
    }

}
