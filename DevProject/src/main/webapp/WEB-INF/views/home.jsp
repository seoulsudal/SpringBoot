<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메시지 처리</title>
</head>
<body>
	<h1>환영합니다.</h1>
		<spring:message code="welcome.message"/><br>
		<spring:message code="welcome.message" arguments="홍길동"/>
	
	<p>서버의 시간은 ${serverTime}.</p>
</body>
</html>