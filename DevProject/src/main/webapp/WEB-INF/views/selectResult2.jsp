<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Form Select</title>
</head>
<body>
	<h3>Select Result_2</h3>
	
	<h4>carList : </h4>
	
	<c:forEach var="car" items="${carList}">
		<c:out value="${car}"/>
	</c:forEach>	
</body>
</html>