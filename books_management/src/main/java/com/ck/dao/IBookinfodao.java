package com.ck.dao;

import com.ck.entity.Bookinfo;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import javax.faces.annotation.RequestMap;
import java.util.List;


public interface IBookinfodao{


    @Select("select * from bookinfo ")
    @ResultMap("map")
    public List<Bookinfo> queryAll();
    //
}
