package com.k.board;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.k.board.model.service.TestService;
import com.k.board.model.vo.TestVO;

/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController {

	@RequestMapping("/")
	public String boardList() {
		return "/board/boardList.do";
	}

	

}
