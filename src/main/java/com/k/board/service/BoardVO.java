package com.k.board.service;


public class BoardVO {
	
	private int userNO;				// 사용자코드명
	private String title ="";		// 제목
	private String content="";		// 내용
	private String writer="";		// 작성자
	private String reg_datetime;	// 작성일
	
	public int getuserNO() {
		return userNO;
	}
	public void setuserNO(int userNO) {
		this.userNO = userNO;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getReg_datetime() {
		return reg_datetime;
	}
	public void setReg_datetime(String reg_datetime) {
		this.reg_datetime = reg_datetime;
	}
	
	
	

		
}
