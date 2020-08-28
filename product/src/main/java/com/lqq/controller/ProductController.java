package com.lqq.controller;

import com.lqq.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ProductController
 * @Description: TODO
 * @author: liuqingqing
 * @Date: 2020/8/28 15:43
 * @Version: 1.0
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/test")
    public void testUser(){
        productService.product();
    }
}
