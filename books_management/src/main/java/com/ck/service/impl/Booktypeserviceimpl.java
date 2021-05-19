package com.ck.service.impl;

import com.ck.dao.IBooktypedao;
import com.ck.entity.Booktype;
import com.ck.service.Booktypeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class Booktypeserviceimpl implements Booktypeservice {
    @Autowired
    private IBooktypedao iBooktypedao;


    @Override
    public List<Booktype> queryBYid(Map map) {
        return iBooktypedao.queryBYid(map);
    }
}
