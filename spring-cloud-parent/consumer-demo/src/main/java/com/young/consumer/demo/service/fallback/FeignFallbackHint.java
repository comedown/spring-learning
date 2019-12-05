package com.young.consumer.demo.service.fallback;

import com.young.common.transfer.bean.UserBean;
import com.young.consumer.demo.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignFallbackHint implements FeignService {

    @Override
    public String sayHiFromClient(String name) {
        return "sorry,system error.";
    }

    @Override
    public UserBean autoRegister(UserBean userBean) {
        return null;
    }
}
