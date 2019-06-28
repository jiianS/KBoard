package com.k.board.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.k.board.model.service.*;
import com.k.board.model.vo.BoardVO;

@Controller
public class BoardController {
	
	//Autowired >> interface로 입력
	@Autowired
	private BoardService boardService;
	
	
	 /**
     * 게시판 조회
     * @param boardVO, model
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/board/boardList.do")
    public String boardList(@ModelAttribute("boardVO") BoardVO boardVO, Model model) throws Exception{
                
        List<BoardVO> list = boardService.selectBoardList(boardVO);
        model.addAttribute("list", list);
        return "board/boardList";
    }
	
    /**
     * 글쓰기 폼 
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/board/writeForm.do")
    public String writeForm() throws Exception{
        return "board/writeForm";
    }
    	
    /**
     * 게시글 등록
     * @param boardVO, model
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/board/write.do")
    public String write(@ModelAttribute("boardVO") BoardVO boardVO, Model model) throws Exception{
    	
        boardService.insertBoard(boardVO);
        return "redirect:/board/boardList.do";
    }
	
    /**
     * 게시글 조회
     * @param boardVO, model, request
     * @return
     */
    @RequestMapping(value="/board/viewContent.do")
    public String viewForm(@ModelAttribute("boardVO") BoardVO boardVO, Model model, HttpServletRequest request) throws Exception{
    	System.out.println("hello view=======");
    	System.out.println(request.getParameter("code"));
        int code = Integer.parseInt(request.getParameter("code"));
        System.out.println("code : " + code);
        
        boardVO.setcode(code);
        BoardVO resultVO = boardService.selectBoardOne(boardVO);
        System.out.println(resultVO);
        model.addAttribute("result", resultVO);
        
        return "board/viewForm";
    }
	    
    /**
     * 게시글 수정
     * @param boardVO, model
     * @return
     */
    @RequestMapping(value="/board/updateboard.do")
    public String updateBoard(@ModelAttribute("boardVO") BoardVO boardVO, Model model) throws Exception{
        
        try{            
            boardService.updateBoard(boardVO);
        } catch (Exception e){
            e.printStackTrace();
        }        
        
        return "redirect:/board/boardList.do";
        
    }
		
	 
}
