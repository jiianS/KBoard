package com.k.board.service;

import java.util.HashMap;import javax.print.DocFlavor.STRING;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BoardService implements BoardServiceInterface {

	@Autowired
	BoardDAOInterface bDAO;
	
	// 전역변수- return & parameter 설정
	
	//전역변수로 리턴값 & 파라미터 설정하기
	HashMap<String, Object> result;
	HashMap<String, Object> param; 

	
	@Override
	public HashMap<String, Object> selectBoardList() {
				
		this.param = new HashMap<String, Object>();
		this.param.put("type", "selectBoardList");
		this.result = bDAO.boardCall(this.param);
		return this.result;	
	}

	@Override
	public HashMap<String, Object> insertBoard(HashMap<String, Object> param) {
		this.param = new HashMap<String, Object>();
		this.param.put("type", "insertBoard");
		this.param.put("param",param);
		this.result = bDAO.boardCall(this.param);
		return this.result;
	}
	@Override
	public HashMap<String, Object> updateBoard(HashMap<String, Object> param) {
		this.param = new HashMap<String, Object>();
		this.param.put("type", "updateBoard");
		this.param.put("param",param);
		this.result = bDAO.boardCall(this.param);
		return this.result;
	}

	@Override
	public HashMap<String, Object> deleteBoard(HashMap<String, Object> param) {
		this.param = new HashMap<String, Object>();
		this.param.put("type", "deleteBoard");
		this.param.put("param",param);
		this.result = bDAO.boardCall(param);
		return this.result;
	}

	@Override
	public HashMap<String, Object> selectBoardOne(HashMap<String, Object> param) {
		this.param = new HashMap<String, Object>();
		this.param.put("type", "selectBoardOne");
		this.param.put("param",param);
		this.result = bDAO.boardCall(param);
		return this.result;
	}
	

}
