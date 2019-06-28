package com.k.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.k.board.model.vo.BoardVO;

@Service("boardServiceImpl")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	// 비즈니스 로직 들어가는 클래스
	@Override
	public List<BoardVO> selectBoardList(BoardVO boardVO) throws Exception {
		 List<BoardVO> list = null;
		 list = boardDAO.selectBoardList(boardVO);		 
		 return list;
	}

	@Override
	public void insertBoard(BoardVO boardVO) throws Exception {
		boardDAO.insertBoard(boardVO);
	}

	@Override
	public void updateBoard(BoardVO boardVO) throws Exception {
		boardDAO.updateBoard(boardVO);

	}

	@Override
	public void deleteBoard(BoardVO boardVO) throws Exception {
		boardDAO.deleteBoard(boardVO);

	}

	@Override
	public BoardVO selectBoardOne(BoardVO boardVO) throws Exception {
		BoardVO resultVO = boardDAO.selectBoardOne(boardVO);
		return resultVO;
	}

}
