package com.k.board.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.k.board.model.vo.TestVO;

public class TestDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public List<TestVO> getTestValue(TestVO testvo){
		return sqlSession.selectList("com.k.borad.model.service.getTestValue", testvo);

	}

}
