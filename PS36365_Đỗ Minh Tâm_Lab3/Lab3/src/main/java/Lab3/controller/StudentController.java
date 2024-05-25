package Lab3.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.Binding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import Lab3.bean.Student;
import jakarta.servlet.ServletContext;

@Controller


public class StudentController {
	@Autowired
	ServletContext app;
	
	
	@GetMapping("/student/form")
	public String form(@ModelAttribute("sv") Student sv) {
		return "student/form";
	}	
	@RequestMapping("/student/save")
	public String save(Model model, @Validated @ModelAttribute("sv") Student sv, BindingResult errors, @RequestParam("photo_file") MultipartFile img) throws IllegalStateException, IOException {
		if (errors.hasErrors()) {
			model.addAttribute("message", "Vui lòng sửa các lỗi sau: ");
		} else if(img.isEmpty()) {
			model.addAttribute("message_img", "Vui Lòng chọn ảnh");
		}else {
			String filename = img.getOriginalFilename();
			File file = new File(app.getRealPath("/image/" + filename));
			img.transferTo(file);
			sv.setImage(filename);
			model.addAttribute("sv",sv);
			model.addAttribute("message","Chúc mừng bạn đã nhập đúng");
		}
		return "student/form";
	}

	@ModelAttribute("gender")
	public Map<Boolean, String> getGenders() {
		Map<Boolean, String> map = new HashMap<>();
		map.put(true, "Male");
		map.put(false, "Female");
		return map;
	}

	@ModelAttribute("faculties")
	public Map<String,String> getFaculties() {
		Map<String, String> map = new HashMap<>();
		map.put("CNTT", "Công nghệ thông tin");
		map.put("MKT", "Marketing");
		map.put("QHCC", "Quan hệ công chúng");
		return map;
	}

	@ModelAttribute("hobbies")
	public Map<String, String> getHobbies() {
		Map<String, String> map = new HashMap<>();
		map.put("T", "Traveling");
		map.put("M", "Music");
		map.put("F", "Food");
		map.put("O", "Other");
		return map;
	}
}
