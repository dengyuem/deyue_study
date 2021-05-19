package com.ck.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private static SqlSessionFactory factory;

	static{
		try {
			InputStream in = 
				Resources.getResourceAsStream("mybatis-config.xml");
			
			factory = new SqlSessionFactoryBuilder().build(in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static  SqlSession openSession(boolean istan){
		return factory.openSession(istan);
	}

}
