package lab2.bai11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("param")
public class ParamController {
	@Autowired
	HttpServletRequest req;
	
	@RequestMapping("form")
	public String form() {
		return "form";
	}
	
	@RequestMapping("save/{x}")
	public String save(@PathVariable String x,@RequestParam(name = "y" , defaultValue = "true") String y){

		req.setAttribute("x", x);
		req.setAttribute("y", y);
		return "form";
	}
	
}
