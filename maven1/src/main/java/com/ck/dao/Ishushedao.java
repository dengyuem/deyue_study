package com.ck.dao;

import com.ck.entity.shushe;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Ishushedao {
    @Select("select * from goods")
    @ResultMap("map1")
    public List<shushe> queryAll();
}
