<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FORM</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
	integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
	integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
	crossorigin="anonymous"></script>
</head>
<body>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<div class="message_erros">${message}</div>
	<form:form action="save" modelAttribute="student">
		<div class="card">
			<div class="card-body">
				<h5 class="card-title">Thông tin sinh viên</h5>
				<ul class="list-group list-group-flush">
					<li class="list-group-item"><form:input path="name" /> <form:errors
							paht="name" cssClass="message_erros"></form:errors></li>
					<li class="list-group-item"><form:input path="email" /> <form:errors
							paht="email" cssClass="message_erros"></form:errors></li>
					<li class="list-group-item"><form:input path="marks" /> <form:errors
							paht="marks" cssClass="message_erros"></form:errors></li>
					<li class="list-group-item"><form:radiobutton path="gender"
							value="true" label="Male" /> <form:errors paht="name"
							cssClass="message_erros"></form:errors></li>
					<li class="list-group-item"><form:radiobutton path="gender"
							value="false" label="Female" /> <form:errors paht="name"
							cssClass="message_erros"></form:errors></li>
					<li class="list-group-item">
						<form:select path="faculty">
							<form:option value="">Chọn khoa</form:option>
							<form:options items="${faculties}"></form:options>
						</form:select></li>
						<form:errors paht="faculty"
							cssClass="message_erros"></form:errors>
					<li class="list-group-item"><input name="attach" type="file"></li>
					
				</ul>
			</div>
			<img src="..." class="card-img-bottom" alt="...">
			<button class="btn btn-primary">Save</button>
		</div>
	</form:form>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>