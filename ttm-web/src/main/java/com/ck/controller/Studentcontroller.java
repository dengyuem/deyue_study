package com.ck.controller;

import com.ck.Student;
import com.ck.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class Studentcontroller {

    @Autowired
    private Studentservice studentservice;

    @RequestMapping("queryALL")
    @ResponseBody
    public List<Student> queryALL(){
        return studentservice.queryALL();
    }

}
