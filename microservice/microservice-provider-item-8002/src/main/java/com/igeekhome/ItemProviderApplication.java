package com.igeekhome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient 该注解新版本可以省略
@MapperScan(basePackages = {"com.igeekhome.mapper"})
public class ItemProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ItemProviderApplication.class,args);
    }
}
