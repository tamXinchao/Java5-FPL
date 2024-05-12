package lab2.bai11.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("sanpham")
public class SanPhamController {
	
	@Autowired
	HttpServletRequest req;
	
	@GetMapping("form4")
	public String form() {
		product pt = new product();
		pt.setName("iPhone 30");
		pt.setPrice(5000.0);
		req.setAttribute("pt", pt);
		return "form4";
	}
	
	@PostMapping("save")
	public String save(@ModelAttribute("p2") product pt) {
		return "form4";
	}
	
	@ModelAttribute("items")
	public List<product> getItems(){
		return Arrays.asList(new product("A",1.0), new product("B",2.0));
		
	}
	
	
	
	
}
