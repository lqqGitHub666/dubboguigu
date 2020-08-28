package com.lqq.impl;

import com.lqq.service.ProductService;
import com.lqq.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @ClassName: ProductServiceImpl
 * @Description: TODO
 * @author: liuqingqing
 * @Date: 2020/8/27 21:20
 * @Version: 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Reference(version = "1.0.0",check = true)
    private UserService userService;

    @Override
    public void product() {
        System.out.println("product");
        System.out.println(userService.user("lqq"));
    }
}
