<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng nhập</title>
</head>
<body>
    <form action="/user" method="post">
        <input type="text" name="username" value="${username}">
        <input type="password" name="password" value="${password}">
        <button type="submit">Tạo tài khoản</button>
    </form>
</body>
</html>
