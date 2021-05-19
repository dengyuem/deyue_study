package com.ck.controller;

import com.ck.entity.Booktype;
import com.ck.service.Bookinfoservice;
import com.ck.service.Booktypeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Booktypecontroller {

  @Autowired
  private Booktypeservice booktypeservice;
@RequestMapping("queryAll")
  public String queryAll(ModelMap modelMap){
      List<Booktype> booktypes = booktypeservice.queryBYid(modelMap);
      modelMap.put("booktypes",booktypes);
    System.out.println(booktypes);
      return "p_add";
    }

}
