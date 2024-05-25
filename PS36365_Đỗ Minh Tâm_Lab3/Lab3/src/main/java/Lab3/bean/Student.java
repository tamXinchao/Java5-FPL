package Lab3.bean;

import java.util.List;

import org.springframework.format.annotation.NumberFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
	@NotBlank(message = "{NotBlank.sv.name}")
	private String name;
	
	
	@NotBlank(message = "Vui lòng nhập địa chỉ email")
	@Email(message = "Vui lòng nhập đúng định dạng email")
	private String email;
	
	@Min(value = 0, message = "Điểm phải lớn hơn hoặc bằng 0")
	@Max(value = 10 , message = "Điểm phải nhỏ hơn hoặc bằng 10")
	@NumberFormat(style = NumberFormat.Style.NUMBER, pattern = "#0.0" )
	
	@NotNull(message = "Vui lòng nhập điểm")
	private Double marks;
	
	
	
	@NotNull(message = "Vui lòng chọn giới tính")
	private Boolean gender;
	
	@NotBlank(message = "Vui lòng chọn khoa")
	private String faculty;
	
	@NotEmpty(message = "Vui lòng chọn sở thích")
	List<String> hobbies;
	
	
	String image;
	
	
	public Student() {
		
	}
	
	public Student(String name, String email, Double marks, Boolean gender, String faculty , List<String> hobbies) {
		this.name = name;
		this.email = email;
		this.marks = marks;
		this.gender = gender;
		this.faculty = faculty;
		this.hobbies = hobbies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
	
}
