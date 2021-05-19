package com.ck;

import com.ck.dao.Ishushedaoimpl;
import com.ck.entity.shushe;
import org.junit.Test;

import java.util.List;

public class MyText {
    @Test
    public  void  test1(){
        Ishushedaoimpl ishushedaoimpl = new Ishushedaoimpl();
        List<shushe> shushes = ishushedaoimpl.queryAll();
        System.out.println(shushes);
    }
}
