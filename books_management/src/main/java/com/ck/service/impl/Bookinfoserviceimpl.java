package com.ck.service.impl;

import com.ck.dao.IBookinfodao;
import com.ck.entity.Bookinfo;
import com.ck.service.Bookinfoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Bookinfoserviceimpl implements Bookinfoservice {

    @Autowired
    private IBookinfodao iBookinfodao;


    @Override
    public Bookinfo queryAll(int id) {
        return iBookinfodao.queryAll(id);
    }
}
