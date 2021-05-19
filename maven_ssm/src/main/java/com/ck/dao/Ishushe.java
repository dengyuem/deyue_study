package com.ck.dao;

import com.ck.entity.Shushe;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Ishushe {
    @Select("select * from goods")
    @ResultMap("map1")
    public List<Shushe> queryAll();
}
