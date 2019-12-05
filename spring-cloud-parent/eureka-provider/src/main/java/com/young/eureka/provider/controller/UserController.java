package com.young.eureka.provider.controller;

import com.young.common.transfer.bean.UserBean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UserController {

    @PostMapping("/register")
    public UserBean register(@RequestBody UserBean userBean) {
        userBean.setUserId(UUID.randomUUID().toString());
        return userBean;
    }

}
