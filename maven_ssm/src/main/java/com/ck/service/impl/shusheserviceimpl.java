package com.ck.service.impl;

import com.ck.dao.Ishushe;
import com.ck.entity.Shushe;
import com.ck.service.shusheservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class shusheserviceimpl implements shusheservice {
    @Autowired
   private Ishushe ishushe;

    @Override
    public List<Shushe> queryAll() {
        return ishushe.queryAll();
    }
}
