<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/sanpham/save" method="post">
		<input name = "name">
		<input name = "price">
		<button>Save</button>
	</form>
	<ul>
		<li>${pt.getName()}</li>
		<li>${pt.getPrice()}</li>
	</ul>
	<ul>
		<li>${p2.getName()}</li>
		<li>${p2.getPrice()}</li>
	</ul>
	<ul>
		<c:forEach var ="item" items = "${items}">
			<li>${item.getName()}</li>
			<li>${item.getPrice()}</li>
		</c:forEach>
	</ul>
</body>
</html>