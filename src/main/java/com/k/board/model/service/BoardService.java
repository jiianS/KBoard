package com.k.board.model.service;

import java.util.List;

import com.k.board.model.vo.BoardVO;

public interface BoardService {
	
	/**
	 * 게시물 리스트 조회
	 * 
	 * @param boardVO
	 * @return
	 */
	public List<BoardVO> selectBoardList(BoardVO boardVO) throws Exception;

	/**
	 * 게시물 작성
	 * @param boardVO
	 */
	public void insertBoard(BoardVO boardVO) throws Exception;

	/**
	 * 게시물 수정
	 * @param boardVO
	 */
	public void updateBoard(BoardVO boardVO) throws Exception;

	/**
	 * 게시물 삭제
	 * @param boardVO
	 */
	public void deleteBoard(BoardVO boardVO) throws Exception;

	/**
	 * 게시글 조회
	 * 
	 * @param boardVO
	 * @return
	 */
	public BoardVO selectBoardOne(BoardVO boardVO) throws Exception;
}
