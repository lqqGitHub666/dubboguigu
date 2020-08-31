package com.lqq.impl;

import com.lqq.model.Product;
import com.lqq.service.ProductProviderService;
import com.lqq.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


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

    @Reference(version = "1.0.0",check = false)
    private ProductProviderService productProviderService;

    @Override
    public String user(String name) {
        System.out.println("hello " + name);
        List<Product> productList;
        System.out.println(productList = productProviderService.getProductList());
        String productStr = "";
        for (Product product : productList) {
            System.out.println(product.getId()+"----"+product.getName()+"----"+product.getPrice());
            productStr = productStr + product.getId()+"----"+product.getName()+"----"+product.getPrice()+"\n";
        }
        return productStr;
    }
}
