<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style>
    @import "/LoginRegister/css/register/register.css";
</style>
<title>Register</title>
</head>
<body>
	<form action="/LoginRegister/register" method="post">
		<div class="container">
			<label for="id"><b>Id</b></label>
			<input type="text" placeholder="Enter Id" name="id" required>
			
			<label for="password"><b>Password</b></label>
			<input type="password" placeholder="Enter Password" name="password" required>
			
			<label for="confirm_password"><b>Confirm Password</b></label>
			<input type="password" placeholder="Enter Password" name="confirm_password" required>
			
			<button type="submit">Register</button>
		</div>
		
		<div class="container">
			<a href="/LoginRegister/index" class="cancelbtn">Cancel</a>
		</div>
	</form>
</body>
</html>