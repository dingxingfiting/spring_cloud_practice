package com.igeekhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient//允许服务发现
public class ItemConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ItemConsumerApplication.class,args);
    }
}
