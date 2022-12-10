package com.micol.web.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.micol.web.board.service.BoardService;
import com.micol.web.board.service.BoardVO;
import com.micol.web.common.Paging;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired BoardService brdService;
	
	@RequestMapping("/brdSelectAll")
	public String brdSelectAll(Model model, BoardVO vo, Paging paging) {
		paging.setPageUnit(3);
		model.addAttribute("boards", brdService.getBrdAll(vo, paging) );
		return "board/board/boardAll";
	}
}
