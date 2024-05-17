<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri ="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Product Form</h1>
<form action="/sanpham/save" method="post">
    <input name="name" placeholder="Product Name" value="${product.name}">
    <input name="price" placeholder="Product Price" type="number" step="0.01" value="${product.price}">
    <button type="submit">Save</button>
</form>

<!-- Display properties of the product -->
<h1>Product Details</h1>
<ul>
    <li>Name: ${product.name}</li>
    <li>Price: ${product.price}</li>
</ul>

<!-- Display list of products -->
<h1> =*= Product List =*=</h1>
<ul>
    <li>Products:</li>
    <c:forEach var="item" items="${products}">
        <li>Name: ${item.name}</li>
    <li>Price: ${item.price}</li>
    <li><a href="/sanpham/edit/${item.name}">Edit</a></li>
    </c:forEach>
    
    </ul>
</body>
</html>