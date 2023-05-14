package com.inho.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inho.demo.dto.BoardDTO;
import com.inho.demo.service.BoardService;

@RestController
@RequestMapping("/api/board/*")
public class BoardRestController {
	@Autowired
	BoardService boardService;
	
	/* 게시판 목록 */
	@GetMapping("list")
	public Map<String, Object> getBoardList() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data",boardService.getBoardList()); // data형태로 담아줘야 datatable에서 data를 key값으로 사용
		return result;
	}
	/* 미사용 - 서비스에서 직접접근처리 */
	//@GetMapping("contetnt")
	//public BoardDTO getBoardContent(String id) {
	//	return (BoardDTO) boardService.getBoardContent(id);
	//}
	
	/* 연관게시판 목록 */
	@GetMapping("related-list")
	public List<BoardDTO> getRelatedList() {
		return boardService.getBoardList();
	}
}
