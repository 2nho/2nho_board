package com.inho.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inho.demo.DAO.BoardDAO;
import com.inho.demo.dto.BoardDTO;

@Service
public class BoardService {
	
	@Autowired
	BoardDAO boardDAO;
	// 게시판목록
	public List<BoardDTO> getBoardList() {
		return boardDAO.getBoardList();
	};
	
	// 게시글 내용
	public BoardDTO getBoardContent(int id) {
		return boardDAO.getBoardContent(id);
	};
	
	public List<BoardDTO> getReladtedList() {
		return boardDAO.getReladtedList();
	};
	
}
