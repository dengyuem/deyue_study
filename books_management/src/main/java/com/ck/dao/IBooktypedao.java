package com.ck.dao;

import com.ck.entity.Booktype;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface IBooktypedao {
    //查询所有图书类型
    @Select("select * from book")
    @ResultMap("map1")
    public List<Booktype> queryBYid(Map map);
}
