package com.igeekhome.controller;

import com.igeekhome.api.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController_Consumer {

    //使用eureka application name进行调用
    private static final String API_ITEM_ROOT = "http://MICROSERVICE-ITEM-PROVIDER/item/";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/list")
    public List<Item> list(){
        //发送HTTP请求
        return restTemplate.getForObject(API_ITEM_ROOT+"list",List.class);
    }

    @RequestMapping("/get/{id}")
    public Item get(@PathVariable Integer id){
        //发送HTTP请求
        return restTemplate.getForObject(API_ITEM_ROOT+"get/"+id,Item.class);
    }

    /**
     * 服务发现
     * 查询当前可用的服务
     * @return
     */
    @RequestMapping("/discovery")
    public String discovery(){
        //查询可用的服务
        List<String> services = client.getServices();
        System.out.println("services===>"+services);

        //获取实例信息
        List<ServiceInstance> instances = client.getInstances("ITEM-PROVIDER-8001");
        for (ServiceInstance instance : instances){
            System.out.println("******");
            System.out.println(instance.getHost()+"--"+instance.getPort()+"--"+instance.getUri());
        }

        return "success";
    }

}
