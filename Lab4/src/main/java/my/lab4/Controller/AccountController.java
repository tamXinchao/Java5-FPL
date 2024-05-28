package my.lab4.Controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import my.lab4.service.CookieService;
import my.lab4.service.ParamService;
import my.lab4.service.SessionService;

@Controller
public class AccountController {
	@Autowired
	CookieService cookieService;
	@Autowired
	ParamService paramService;
	@Autowired
	SessionService sessionService;

	@GetMapping("/account/login")
	public String login1() {
		return "/account/login";
	}

	@PostMapping("/account/login")
	public String login2(Model model, @RequestParam("photo") MultipartFile attach ) {
		String un = paramService.getString("username", "");
		String pw = paramService.getString("password", "");
		boolean rm = paramService.getBoolean("remember", false);
		
		if (un.equals("poly") && pw.equals("123")) {
			sessionService.setAttribute("username", un);
			String message = "Đăng nhập thành công!";
			if (rm == true) {
				cookieService.add("user", un, 10);
				message += " Đã lưu vào Cookie";
			} else {
				cookieService.remove("user");
				message+=" Đã xóa Cookie";
			}
			model.addAttribute("message",message);
		}else {
			model.addAttribute("message", "Đăng nhập thất bại!");
		}
		File saveFile = paramService.save(attach, "images");
		model.addAttribute("image",attach.getOriginalFilename());
		return "/account/login";
	}
}
