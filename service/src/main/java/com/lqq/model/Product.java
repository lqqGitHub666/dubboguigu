package com.lqq.model;

import java.io.Serializable;

/**
 * @ClassName: Product
 * @Description: TODO
 * @author: liuqingqing
 * @Date: 2020/8/31 14:38
 * @Version: 1.0
 */
public class Product implements Serializable {

    private String id;

    private String name;

    private String price;

    public Product() {
    }

    public Product(String id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
