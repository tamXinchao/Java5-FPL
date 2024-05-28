package my.lab4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import my.lab4.service.ShoppingCartService;


@Controller
public class ShoppingCartController {

	@Autowired
	ShoppingCartService cart; // tiêm Spring Bean đã tạo

	@RequestMapping("/cart/view")
	public String view(Model model) {
		model.addAttribute("cart", cart);
		model.addAttribute("Count", cart.getProductCount());
		model.addAttribute("Amount", cart.getAmount());
		return "cart/cart";
	}

	@RequestMapping("/cart/add/{id}")
	public String add(@PathVariable("id") Integer id) {
		cart.add(id);
		return "redirect:/item/index"; // hiển thị giỏ hàng
	}

	@RequestMapping("/cart/remove/{id}")
	public String remove(@PathVariable("id") Integer id) {
		cart.remove(id);
		return "redirect:/cart/view";
	}

	@RequestMapping("/cart/update/{id}/{pre}")
	public String update(@PathVariable("id") Integer id,@PathVariable("pre") String pre) {
		cart.update(id, pre);
		return "redirect:/cart/view";
	}

	@RequestMapping("/cart/clear")
	public String clear() {
		cart.clear();
		return "redirect:/cart/view";
	}
}
