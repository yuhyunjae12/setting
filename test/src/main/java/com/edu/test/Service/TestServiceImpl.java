package com.edu.test.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.test.Dao.TestDao;
import com.edu.test.Vo.TestVo;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao dao;
	
	@Override
	public List<TestVo> testList() {
		return dao.testList();
	}

}
