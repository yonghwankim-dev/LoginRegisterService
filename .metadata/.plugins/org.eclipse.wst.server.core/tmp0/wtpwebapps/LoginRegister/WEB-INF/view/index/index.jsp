<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
    @import "/LoginRegister/css/index.css";
</style>
</head>
<body>
	home page
	<c:if test="${empty id}">
		<a href="/LoginRegister/login">Login</a>
	</c:if>
	<c:if test="${not empty id}">
		<a href="/LoginRegister/logout">Logout</a>
	</c:if>
	<a href="/LoginRegister/register">Register</a>
	<br>
	id : ${id}
</body>
</html>