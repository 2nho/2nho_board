package com.inho.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inho.demo.dto.BoardDTO;
import com.inho.demo.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	// 게시판 목록
	@GetMapping("list")
	public String getList() {
		return "boardList";
	}
	
	// 게시글 내용
	@GetMapping("content/{id}")
	public String getContent(@PathVariable int id, Model model) {
		BoardDTO result = boardService.getBoardContent(id);
		model.addAttribute("title", result.getTitle()); // 제목
		model.addAttribute("content", result.getContent()); // 본문
		return "boardContent";
	}
}
