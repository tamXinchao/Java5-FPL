package lab2.bai11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("ctrl")
public class okController {
	
	@Autowired
	HttpServletRequest req;
	
	
	@RequestMapping("ok")
	public String OK() {
		req.setAttribute("message", "Goi ok()");
		return "ok";
	}
	
	@PostMapping("ok")
	public String m1() {
		req.setAttribute("message", "Goi m1()");
		return "ok";
	}
	
	@GetMapping("ok")
	public String m2() {
		req.setAttribute("message", "Goi m2()");
		return "ok";
	}
	
	@RequestMapping(value = "ok", params = "x")
	public String m3() {
		req.setAttribute("message", "Goi m3()");
		return "ok";
	}
	
}
