package com.young.consumer.demo.controller;

import com.young.consumer.demo.service.EchoService;
import com.young.consumer.demo.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @Autowired
    private EchoService echoService;

    @Autowired
    private FeignService feignService;

    @RequestMapping("/ribbon/hi")
    public String callRibbonHi(String name) {
        return echoService.callHi(name);
    }

    @RequestMapping("/feign/hi")
    public String callFeignHi(String name) {
        return feignService.sayHiFromClient(name);
    }

}
