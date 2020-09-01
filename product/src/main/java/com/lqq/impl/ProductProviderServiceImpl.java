package com.lqq.impl;

import com.lqq.model.Product;
import com.lqq.service.ProductProviderService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: ProductProviderServiceImpl
 * @Description: TODO
 * @author: liuqingqing
 * @Date: 2020/8/31 14:40
 * @Version: 1.0
 */
@Service(version = "${dubbo.application.version}",interfaceClass = ProductProviderService.class)
@Component
public class ProductProviderServiceImpl implements ProductProviderService {
    @Override
    public List<Product> getProductList() {
        Product product1 = new Product("1","iPhone11","6000￥");
        Product product2 = new Product("2","mac13","16000￥");
        Product product3 = new Product("3","冰箱","4000￥");
        Product product4 = new Product("4","华为mate40","6000￥");
        List<Product> products = new LinkedList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        return products;
    }
}
