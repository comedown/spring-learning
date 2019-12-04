package com.young.consumer.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("eureka-provider")
public interface FeignService {

    @RequestMapping(value = "/eureka-provider/hi", method = RequestMethod.GET)
    String sayHiFromClient(String name);

}
