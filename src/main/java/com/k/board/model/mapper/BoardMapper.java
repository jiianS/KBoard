package com.k.board.model.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.k.board.model.vo.BoardVO;


@Repository
public interface BoardMapper {
	// 게시물 리스트 조회
	public List<BoardVO> selectBoardList(BoardVO boardVO) throws Exception;

	// 게시물 등록
	public void insertBoard(BoardVO boardVO) throws Exception;

	// 게시물 수정
	public void updateBoard(BoardVO boardVO) throws Exception;

	// 게시물 삭제
	public void deleteBoard(BoardVO boardVO) throws Exception;

	// 게시물 조회
	public BoardVO selectBoardOne(BoardVO boardVO) throws Exception;
}
