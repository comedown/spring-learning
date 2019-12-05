package com.young.consumer.demo.service;

import com.young.common.transfer.bean.UserBean;
import com.young.consumer.demo.service.fallback.FeignFallbackHint;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-provider", fallback = FeignFallbackHint.class)
public interface FeignService {

    @RequestMapping(value = "/eureka-provider/hi", method = RequestMethod.GET)
    String sayHiFromClient(String name);

    @PostMapping(value = "/eureka-provider/register")
    UserBean autoRegister(@RequestBody UserBean userBean);

}
