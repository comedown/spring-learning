package com.young.springframework.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Bar {

    @Autowired
    private Foo foo;

    public void doFoo(String str) {
        foo.doSomething(str);
    }

}
