package com.inho.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	// 초기페이지 
	@GetMapping("/")
	public String init() {
		return "redirect:/board/list";
	}
}
