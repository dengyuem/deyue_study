package com.ck.controller;

import com.ck.entity.Shushe;
import com.ck.service.shusheservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class Ishushecontroller {

    @Autowired
    private shusheservice shusheservice;
    @RequestMapping("queryAll")
    public String queryAll(ModelMap map){
        List<Shushe> shushes = shusheservice.queryAll();
        map.put("shushes",shushes);
        return "index";
    }
}
