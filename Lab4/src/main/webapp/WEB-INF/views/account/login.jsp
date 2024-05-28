<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"></script>

</head>
<body>
<a href="/"><font color="blue">Lab 4</font></a>
	<form action="/account/login" method="post" enctype="multipart/form-data"> 
		<div class="container w-50 m-auto card mt-5">
			<div class="card-header">Login</div>
			<div class="card-body row">
				<input name="username" class="form-control border-danger mb-2" placeholder="Username?"> <br>
				<input name="password" class="form-control border-danger" type="password"
					placeholder="Password?"> <br>
				<div class="my-2">
					<input name="remember" type="checkbox"  value="true">Remember me?
				</div><hr>
				<div class="my-2">
                    Image:
                    <input name="photo" type="file" > <br>
                    <img src="/images/${image}" width="200px"> <br>
                </div>
				<div class="">
					<button class="btn btn-primary float-end">Login</button>
				</div>
			</div>
			<div class="card-footer">
				<label class="text-danger fw-bold">${message}</label>
			</div>
		</div>
	</form> 
</body>
</html>