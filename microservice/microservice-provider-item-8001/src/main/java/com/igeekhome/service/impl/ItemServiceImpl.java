package com.igeekhome.service.impl;

import com.igeekhome.api.pojo.Item;
import com.igeekhome.mapper.ItemMapper;
import com.igeekhome.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public List<Item> queryItems() {
        return itemMapper.selectItems();
    }

    @Override
    public Item queryItem(Integer id) {
        return itemMapper.selectItem(id);
    }
}
