package com.ck.dao;

import com.ck.Student;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IStudentdao {

    @Select("select * from students")
    @ResultMap("map1")
    public List<Student> queryALL();
}
