package com.ck.service.impl;

import com.ck.Student;
import com.ck.dao.IStudentdao;
import com.ck.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Studentserviceimpl implements Studentservice {

    @Autowired
    private IStudentdao iStudentdao;
    @Override
    public List<Student> queryALL() {
        return iStudentdao.queryALL();
    }
}
