<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모델을 통한 데이터 전달</title>
</head>
<body>
	<h2>model02 결과</h2>
	
	member.userId : ${member.userId}<br>
	member.password : ${member.password}<br>
	member.userName : ${member.userName}<br>
	member.email : ${member.email}<br>
</body>
</html>