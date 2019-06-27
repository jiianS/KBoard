package com.k.board.service;

import java.util.HashMap;

public interface BoardServiceInterface {

	public HashMap<String, Object> selectBoardList();
	public HashMap<String, Object> insertBoard(HashMap<String, Object> param);
	public HashMap<String, Object> updateBoard(HashMap<String, Object> param);
	public HashMap<String, Object> deleteBoard(HashMap<String, Object> param);
	public HashMap<String, Object> selectBoardOne(HashMap<String, Object> param);
	
}
