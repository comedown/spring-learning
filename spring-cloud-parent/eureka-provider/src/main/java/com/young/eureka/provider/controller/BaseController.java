package com.young.eureka.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @Value("${server.port}")
    private Integer port;

    @RequestMapping("/hi")
    public String baseHi(String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

}
