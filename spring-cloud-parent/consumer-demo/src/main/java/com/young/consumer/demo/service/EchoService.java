package com.young.consumer.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EchoService {

    @Autowired
    private RestTemplate restTemplate;

    public String callHi(String name) {
        return restTemplate.getForObject("http://EUREKA-PROVIDER/eureka-provider/hi?name=" + name, String.class);
    }

}
