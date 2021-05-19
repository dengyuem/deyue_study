package com.ck.dao;

import com.ck.entity.shushe;
import com.ck.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Ishushedaoimpl implements Ishushedao{


    @Override
    public List<shushe> queryAll() {
        SqlSession sqlSession= MyBatisUtil.openSession(false);
        Ishushedao mapper = sqlSession.getMapper(Ishushedao.class);
        return mapper.queryAll();

    }
}
