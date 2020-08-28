package com.lqq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName: TestUservice
 * @Description: TODO
 * @author: liuqingqing
 * @Date: 2020/8/27 21:42
 * @Version: 1.0
 */
public class TestUserService {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:userservice.xml"});
        context.start();
        System.out.println(11);
        System.in.read(); // 按任意键退出
    }
}
