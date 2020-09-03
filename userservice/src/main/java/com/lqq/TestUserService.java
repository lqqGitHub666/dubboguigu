package com.lqq;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: TestUservice
 * @Description: TODO
 * @author: liuqingqingget
 * @Date: 2020/8/27 21:42
 * @Version: 1.0
 */
@EnableDubbo(scanBasePackages = "com.lqq.impl")
@SpringBootApplication
public class TestUserService {

    public static void main(String[] args) {
        SpringApplication.run(TestUserService.class,args);
    }
}


/**
 * Springboot与dubbo整合的三种方式：
 * 1）、导入dubbo-starter，在application.properties配置属性，使用@Service【暴露服务】使用@Reference【引用服务】
 * 2）、导入dubbo-starter，保留dubbo配置xml文件，使用注解@ImportResource(locations = "classpath:userservice.xml")，
 *      这样dubbo相关的配置将会在xml中读取
 * 3）、使用注解API的方式，将每个组件手动创建到容器中
 *
 */