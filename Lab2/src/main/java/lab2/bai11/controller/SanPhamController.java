package lab2.bai11.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("sanpham")
public class SanPhamController {
	
	@Autowired
	HttpServletRequest req;
	
	private List<product> products;
	
	@GetMapping("form4")
	public String form(Model model) {
		product p = new product();
        p.setName("iPhone 30");
        p.setPrice(5000.0); // Double value
        model.addAttribute("product", p);
        products = getItems();
        model.addAttribute("products", products);
		return "form4";
	}
	
	@PostMapping("save")
	public String save(@ModelAttribute("p2") product pt, Model model) {
		   products.add(pt);
	        model.addAttribute("products", products);
		return "form4";
	}
	
	@ModelAttribute("items")
	public List<product> getItems(){
		List<product> products = new ArrayList<>();
        products.add(new product("A", 1.0));
        products.add(new product("B", 2.0));
        return products;
		
	}
	
	@GetMapping("edit/{name}")
    public String edit(@PathVariable("name") String name, Model model) {
        for (product product : products) {
            if (product.getName().equals(name)) {
                model.addAttribute("product", product);
                break;
            }
        }
        model.addAttribute("products", products);
        return "form4";
    }

	
}
