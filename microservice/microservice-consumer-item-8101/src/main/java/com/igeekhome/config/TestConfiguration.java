package com.igeekhome.config;

import com.ribbon.client.custom.CustomRibbon;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
//给指定客户端自定义负载均衡算法
//@RibbonClient(name = "MICROSERVICE-ITEM-PROVIDER", configuration = CustomRibbon.class)
public class TestConfiguration {
}
