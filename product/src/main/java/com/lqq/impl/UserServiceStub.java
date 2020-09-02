package com.lqq.impl;

import com.lqq.model.Product;
import com.lqq.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author 作者 lqq
 * @ClassName 类名 UserServiceStub
 * @date 2020/9/2 22:18
 * @注释：
 */
public class UserServiceStub implements UserService {

    private final UserService userService;

    // 构造函数传入真正的远程代理对象
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<Product> user(String name) {
        // 此代码在客户端执行, 你可以在客户端做ThreadLocal本地缓存，或预先验证参数是否合法，等等
        if (StringUtils.isEmpty(name)){
            System.out.println("name is empty");
            return null;
        }
        System.out.println("----------------------stub");
        try {
            return userService.user(name);
        }catch (Exception e){
            // 你可以容错，可以做任何AOP拦截事项
            return null;
        }
    }
}
