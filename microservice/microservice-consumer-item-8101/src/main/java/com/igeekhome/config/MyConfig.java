package com.igeekhome.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfig {
    @Bean
    @LoadBalanced //添加负载均衡注解 ， restTemplate就会按照Ribbon负载均衡算法进行调用
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


}

/*
* applicationContext.xml
* <bean id="userService" class="">
* */
