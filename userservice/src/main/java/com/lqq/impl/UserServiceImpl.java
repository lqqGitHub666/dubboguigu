package com.lqq.impl;

import com.lqq.model.Product;
import com.lqq.service.ProductProviderService;
import com.lqq.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @author: liuqingqing
 * @Date: 2020/8/27 18:21
 * @Version: 1.0
 */
@Service(version = "${dubbo.application.version}",interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    @Reference(version = "${dubbo.application.version}",check = false)
    private ProductProviderService productProviderService;

    @Override
    public List<Product> user(String name) {
        System.out.println("hello " + name);
        List<Product> productList;
        System.out.println(productList = productProviderService.getProductList());
        String productStr = "";
        //            productStr = productStr + product.getId() + "----" + product.getName() + "----" + product.getPrice() + "\n";
        productList.stream().map(product -> product.getId() + "----" + product.getName() + "----" + product.getPrice()).forEach(System.out::println);
        for (Product product : productList) {
            String id = product.getId();
            System.out.println(id);
        }
        productList.forEach(product -> test(product));


        return productList;
    }

    public void test(Product product){
        System.out.println(product.getId());
    }

    public static void main(String[] args) {

        Product product1 = new Product("1","iPhone11","6000￥");
        Product product2 = new Product("2","mac13","16000￥");
        Product product3 = new Product("3","冰箱","4000￥");
        Product product4 = new Product("4","华为mate40","6000￥");
        List<Product> products = new LinkedList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.stream().filter(product -> !product.getId().equals("2")).map(Product::getId).forEach(System.out::println);
        Map<String,Object> map = new HashMap<>();
        map.put(null,null);
        map.put(null,null);
        map.forEach((s, o) -> System.out.println(s + "-------" + o));
    }
}
