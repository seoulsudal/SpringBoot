<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    
<h2><spring:message code="item.header.read"/></h2>

<form:form modelAttribute="item" action="buy">
	<form:hidden path="itemId"/>
	<form:hidden path="pictureUrl"/>
	<form:hidden path="previewUrl"/>
	
	<table>
		<tr>
			<td><spring:message code="item.itemName"/></td>
			<td><form:input path="itemName"/></td>
			<td><font color="red"><form:errors path="itemName"/></font></td>
		</tr>
		<tr>
			<td><spring:message code="item.itemPrice"/></td>
			<td><form:input path="price"/>&nbsp;원</td>
			<td><font color="red"><form:errors path="price"/></font></td>
		</tr>
		<tr>
			<td><spring:message code="item.preview"/></td>
			<td><img src="display?itemId=${item.itemId}" width="210"></td>
		</tr>
		<tr>
			<td><spring:message code="item.itemDescription"/></td>
			<td><form:textarea path="description"/></td>
			<td><font color="red"><form:errors path="description"/></font></td>
		</tr>
	</table>
</form:form>

<div>	
	<button type="submit" id="btnList"><spring:message code="action.list"/></button>
</div>

<script>
	$(document).ready(function() {
		var formObj = $("#item");
		
		$("#btnList").on("click", function() {
			self.location = "list";
		});
		
	});
</script>