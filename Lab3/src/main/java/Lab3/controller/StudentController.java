package Lab3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import Lab3.bean.Student;

@Controller

@RequestMapping("student")
public class StudentController {
	@RequestMapping("/form")
	public String form(@ModelAttribute("sv") Student sv) {
		return "form";
	}
	@RequestMapping("/save")
	public String save(@ModelAttribute("sv") Student sv) {
		return "form";
	}
}
