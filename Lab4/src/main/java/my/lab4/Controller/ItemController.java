package my.lab4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import my.lab4.service.ShoppingCartService;
import my.lab4.util.SP;


@Controller
@RequestMapping("item")
public class ItemController {
	@Autowired
	ShoppingCartService cart;
	
	@RequestMapping("index")
	public String cart(Model model) {
		model.addAttribute("items", SP.list);
		model.addAttribute("count", cart.getProductCount());
		return "cart/spview";
	}
}
