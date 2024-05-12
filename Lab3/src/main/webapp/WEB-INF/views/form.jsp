<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FORM</title>
</head>
<body>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<form:form action="" modelAttribute="student">
		<form:input path="name" />
		<form:input path="email" />
		<form:input path="marks" />
		<form:radiobutton path="gender" value ="true" label="Male" />
		<form:radiobutton path="gender" value ="false" label="Female" />
		<form:select path="faculty">
			<form:option value="CNTT">Công nghệ thông tin</form:option>
			<form:option value="KHMT">Khoa học máy tính</form:option>
			<form:option value="MKT">Marketing</form:option>
		</form:select>
	</form:form>
	<button>Lưu</button>
</body>
</html>