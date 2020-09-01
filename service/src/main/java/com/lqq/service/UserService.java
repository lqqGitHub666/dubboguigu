package com.lqq.service;

import com.lqq.model.Product;

import java.util.List;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @author: liuqingqing
 * @Date: 2020/8/27 18:21
 * @Version: 1.0
 */
public interface UserService {

    List<Product> user(String name);
}
