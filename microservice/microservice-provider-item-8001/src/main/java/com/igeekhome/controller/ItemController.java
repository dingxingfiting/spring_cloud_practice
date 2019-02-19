package com.igeekhome.controller;

import com.igeekhome.api.pojo.Item;
import com.igeekhome.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/list")
    public List<Item> list(){
        return itemService.queryItems();
    }

    @RequestMapping("/get/{id}")
    public Item get(@PathVariable Integer id){
        return itemService.queryItem(id);
    }
}
