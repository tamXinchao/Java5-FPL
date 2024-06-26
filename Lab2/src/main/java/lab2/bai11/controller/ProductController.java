package lab2.bai11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	HttpServletRequest req;

	
	@GetMapping("/form")
	public String form() {
		return "form2";
	}
	
	@PostMapping("/save")
	public String save(@RequestParam("name") String name , @RequestParam("price") Double price) {
		product pt = new product(name, price);
		req.setAttribute("name", pt.getName());	
		req.setAttribute("price", pt.getPrice());
		return "form2";
				
	}
	
}
