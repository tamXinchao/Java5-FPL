package com.poly.bai1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller

public class UserController {

	@Autowired
	HttpServletRequest req;
	@Autowired
	HttpSession session;
	
	@Autowired
	HttpServletResponse resp;

	@Autowired
	ServletContext context;
	
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("", model);
		return "index";
	}
	
	@RequestMapping("/login")
	public String login() {
		String username = XCookie.get("username", req);
		String password = XCookie.get("password", req);
		req.setAttribute("username", username);
		req.setAttribute("password", password);
		return "login";
		
	}
	
	@PostMapping("/user")
	public String user() {
		user us = new user();
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if(username == null || password == null ) {
		    return "login";

		}else {
			XCookie.add("username", username, 1, resp);
			XCookie.add("password", password, 1, resp);
			us.setUsername(username);
			us.setPassword(password);
			session.setAttribute("user", us);
			return "user";
			
		}
		
		
	}

}
