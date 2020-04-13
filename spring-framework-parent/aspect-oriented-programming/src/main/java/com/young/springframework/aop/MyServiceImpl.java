package com.young.springframework.aop;

import org.springframework.util.StringUtils;

public class MyServiceImpl implements MyService {
    @Override
    public void echo(String str) {
        System.out.println(str);
    }

    @Override
    public String getUpCase(String str) {
        if (!StringUtils.hasText(str)) {
            return null;
        }
        return str.toUpperCase();
    }
}
