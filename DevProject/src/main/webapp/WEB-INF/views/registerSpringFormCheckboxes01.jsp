<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Form Checkboxes</title>
</head>
<body>
	<h2>Spring Form Checkboxes01</h2>
	<form:form modelAttribute="member" method="post" action="register">
		<table>
			<tr>
				<td>취미(hobbyList) : </td>
				<td>
				<form:checkboxes items="${hobbyMap}" path="hobbyList"/>
				</td>
			</tr>
		</table>
		
		<form:button action="register">등록</form:button>
	</form:form>
</body>
</html>