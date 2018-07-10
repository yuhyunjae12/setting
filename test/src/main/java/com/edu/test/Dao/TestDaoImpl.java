package com.edu.test.Dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edu.test.Vo.TestVo;

@Repository
public class TestDaoImpl implements TestDao {

	@Autowired
	private SqlSession sqlSession;
	
	private String nameSpace="test.";
	
	@Override
	public List<TestVo> testList() {
		return sqlSession.selectList(nameSpace+"testList");
	}

}
