<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Form Hidden</title>
</head>
<body>
	<h3>Hidden Result</h3>
	<table border="1">
		<tr>
			<td>유저ID</td>
			<td>${member.userId}</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${member.userName}</td>
		</tr>
	</table>
</body>
</html>