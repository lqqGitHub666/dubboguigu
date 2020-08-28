package com.lqq;


import com.lqq.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @ClassName: TestProduct
 * @Description: TODO
 * @author: liuqingqing
 * @Date: 2020/8/27 21:43
 * @Version: 1.0
 */
public class TestProduct {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:product.xml"});
        context.start();
        UserService userService = (UserService) context.getBean("userService");
        String str = userService.user("lqq");
        System.out.println(str);
    }
}
