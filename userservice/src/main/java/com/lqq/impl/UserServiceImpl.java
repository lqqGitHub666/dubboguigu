package com.lqq.impl;

import com.lqq.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @author: liuqingqing
 * @Date: 2020/8/27 18:21
 * @Version: 1.0
 */
@Service(version = "1.0.0",interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    @Override
    public String user(String name) {
        System.out.println("hello " + name);
        return name;
    }
}
