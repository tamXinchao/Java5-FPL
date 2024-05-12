package com.lab1.bai1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("index")
	public String index(Model model) {
		model.addAttribute("message","Index-Welcome to Java 5 Spring MVC Do Minh Tam");
		return "index";
	}
	
	
}
