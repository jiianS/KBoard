package com.k.board;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.k.board.service.BoardServiceInterface;
import com.k.board.service.BoardVO;

@Controller
public class BoardController {
	
	//Autowired >> interface로 입력
	@Autowired
	private BoardServiceInterface boardService;
	
	@RequestMapping(value="/boardList.do")
	// boardList >> bList
	public String boardList(Model model) throws Exception {
		
		model.addAttribute("data", boardService.selectBoardList());
		return "/board/boardList";
	}
	
	// 게시물 작성  폼 > 입력받은 값 처리 후 redirect
	@RequestMapping(value="/writeForm.do")
	public String bWriteForm() {
		return "board/writeForm";
	}
	
	@RequestMapping(value="/bWrite.do")
    public String bWrite(Model model, HttpServletRequest req) {
		model.addAttribute("data",boardService.insertBoard(getParamMap(req)));
        
        return "redirect:/board/boardList.do";
    }
	
	// 게시글 조회
	// viewForm > bview
	 @RequestMapping(value="/viewContent.do")
	    public String bview(Model model, HttpServletRequest req){
	        model.addAttribute("data", boardService.selectBoardOne(getParamMap(req)));
	        
	        return "board/viewForm";
	    }
	    
	 	// 게시글 수정
	 	@RequestMapping(value="/updateboard.do")
	    public String bUpdate(Model model, HttpServletRequest req) {
			model.addAttribute("data", boardService.selectBoardOne(getParamMap(req)));
	        return "redirect:/board/boardList.do";
	    }
	 	
	 	
		public HashMap<String, Object> getParamMap(HttpServletRequest req) {
			HashMap<String, Object> result = new HashMap<String, Object>();

			Enumeration<?> enums = req.getParameterNames();

			// parameter 갯수만큼 돌려랏
			while (enums.hasMoreElements()) {
				String paramName = enums.nextElement().toString(); // return 값이 object)
				System.out.println(paramName);
				result.put(paramName, req.getParameter(paramName));
			}

			return result;
		}
		
	 
}
