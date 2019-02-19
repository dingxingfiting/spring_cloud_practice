package com.ribbon.client.custom;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomRibbon {
    @Bean
    public IRule rule(){
        return new RandomRule();//切换Ribbon默认轮询算法
    }
}
