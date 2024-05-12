<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/ctrl/ok" method="post">
		<button>OK</button>
		<button formmethod="get">OK 2</button>
		<button formaction="/ctrl/ok?x">OK 3 </button>
	</form>
	Kết quả : ${message}
</body>
</html>