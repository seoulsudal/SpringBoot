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
	<h2>model04 결과</h2>
	
	<h4>user.address : </h4>
	user.address.postCode : ${user.address.postCode}<br>
	user.address.location : ${user.address.location}<br>
	
	<h4>user.cardList : </h4>
	<c:forEach var="card" items="${user.cardList}">
		<c:out value="${card.no} ${card.validMonth}"/><br>
	</c:forEach>
	
	<c:forEach var="card" items="${user.cardList}">
		<c:out value="${card.no}"/><br>
		<c:out value="${card.validMonth}"/><br>
	</c:forEach>
	
	<c:forEach var="card" items="${user.cardList}">
		${card.no} ${card.validMonth}<br>
	</c:forEach>
</body>
</html>