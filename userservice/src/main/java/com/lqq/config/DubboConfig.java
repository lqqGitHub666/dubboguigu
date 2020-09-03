package com.lqq.config;

import com.lqq.service.ProductProviderService;
import com.lqq.service.UserService;
import org.apache.dubbo.config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 作者 lqq
 * @ClassName 类名 DubboConfig
 * @date 2020/9/2 22:56
 * @注释：
 */
@Configuration
public class DubboConfig {

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("userservice");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("192.168.38.3:2181");
        registryConfig.setCheck(false);
//        registryConfig.setAddress("192.168.72.3:2181");
        return registryConfig;
    }

    @Bean
    public ServiceConfig<UserService> userServiceServiceConfig(UserService userService){
        ServiceConfig<UserService> serviceServiceConfig = new ServiceConfig<>();
        serviceServiceConfig.setInterface(UserService.class);
        serviceServiceConfig.setRef(userService);
//        serviceServiceConfig.setVersion("1.0.0");
        //配置一个method的信息
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("user");
        methodConfig.setTimeout(5000);
        methodConfig.setRetries(3);
        //将method关联到service配置中
        List<MethodConfig> methodConfigList = new ArrayList<>();
        methodConfigList.add(methodConfig);
        serviceServiceConfig.setMethods(methodConfigList);
        return serviceServiceConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20882);
        return protocolConfig;
    }

    @Bean
    public ReferenceConfig<ProductProviderService> productProviderService(){
        ReferenceConfig<ProductProviderService> productProviderServiceReferenceConfig = new ReferenceConfig<>();
        productProviderServiceReferenceConfig.setInterface(ProductProviderService.class);
        productProviderServiceReferenceConfig.setCheck(false);
        return productProviderServiceReferenceConfig;
    }

    @Bean
    public ConsumerConfig consumerConfig(){
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setCheck(false);
        return consumerConfig;
    }

//    MonitorConfig
}

