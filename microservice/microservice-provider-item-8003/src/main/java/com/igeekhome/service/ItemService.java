package com.igeekhome.service;

import com.igeekhome.api.pojo.Item;

import java.util.List;

public interface ItemService {
    List<Item> queryItems();

    Item queryItem(Integer id);
}
