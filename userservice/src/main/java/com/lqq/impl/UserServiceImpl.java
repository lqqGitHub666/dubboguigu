package com.lqq.impl;

import com.lqq.service.UserService;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @author: liuqingqing
 * @Date: 2020/8/27 18:21
 * @Version: 1.0
 */
public class UserServiceImpl implements UserService {

    @Override
    public String user(String name) {
        System.out.println("hello " + name);
        return name;
    }
}
