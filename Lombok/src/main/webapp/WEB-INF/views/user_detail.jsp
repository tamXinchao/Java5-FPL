<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<form action="/user/save" method="post">

		<p>${user.getUsername()}</p>
		<p>${user.getPassword()}</p>
	</form>


</body>
</html>