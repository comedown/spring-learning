package com.young.common.transfer.bean;

import lombok.Data;

import java.util.List;

@Data
public class UserBean {

    private String userId;
    private String mobile;
    private String name;
    private List<Integer> hobbies;

}
