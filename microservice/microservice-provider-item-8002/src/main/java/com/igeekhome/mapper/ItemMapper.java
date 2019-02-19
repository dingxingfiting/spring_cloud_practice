package com.igeekhome.mapper;

import com.igeekhome.api.pojo.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ItemMapper {
    @Select("select * from item")
    List<Item> selectItems();
    @Select("select * from item where id = #{id}")
    Item selectItem(Integer id);

}
