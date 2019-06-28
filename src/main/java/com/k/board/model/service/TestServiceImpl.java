package com.k.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.k.board.model.vo.TestVO;

public class TestServiceImpl implements TestService {

	@Autowired
	TestDAO TestDAO;

	@Override
	public List<TestVO> getTestValue(TestVO testVO) {

		return TestDAO.getTestValue(testVO);
	}

}
