package com.ck.controller;

import com.ck.entity.Booktype;
import com.ck.service.Bookinfoservice;
import com.ck.service.Booktypeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class Bookinfocontroller {
  @Autowired
  private

  @RequestMapping("queryAll")
  public String queryAll(@RequestParam Map paramMap, ModelMap map, int page) {
    if (map.get("bname") == null) {
      map.put("bname", "");
    }
    if (map.get("btid") == null) {
      map.put("btid", "");

    }


  }
}
