package com.inho.demo.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inho.demo.dto.BoardDTO;

@Repository
public class BoardDAO {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public List<BoardDTO> getBoardList() {
		return sqlSessionTemplate.selectList("board.list");
	}; 
	
	public BoardDTO getBoardContent(int id) {
		return sqlSessionTemplate.selectOne("board.content",id);
	}; 
	
	public List<BoardDTO> getReladtedList() {
		return sqlSessionTemplate.selectList("board.relatedList");
	}; 
}
