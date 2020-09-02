package com.lqq.impl;

import com.lqq.model.Product;
import com.lqq.service.ProductService;
import com.lqq.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: ProductServiceImpl
 * @Description: TODO
 * @author: liuqingqing
 * @Date: 2020/8/27 21:20
 * @Version: 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Reference(stub = "com.lqq.impl.UserServiceStub")
    private UserService userService;

    @Override
    public List<Product> product(String name) {
        System.out.println("product");
        return userService.user(name);
    }
}
