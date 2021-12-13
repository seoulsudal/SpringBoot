<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyBatis 게시판</title>
</head>
<body>
<form:form modelAttribute="board" method="post" action="search">
	<h2>게시판 목록</h2>
	TITLE : <form:input path="title"/><input type="submit" value="검색">
	<a href="register">New</a>
	<table border="1">
		<tr>
			<th align="center" width="80">NO</th>
			<th align="center" width="320">TITLE</th>
			<th align="center" width="100">WRITER</th>
			<th align="center" width="180">REGDATE</th>
		</tr>
		
		<c:choose>
			<c:when test="${empty list}">
				<tr>
					<td colspan="4">
						게시글이 없습니다.
					</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${list}" var="board">
					<tr>
						<td align="center">${board.boardNo}</td>
						<td align="left"><a href="/board/read?boardNo=${board.boardNo}">${board.title}</a></td>
						<td align="right">${board.writer}</td>
						<td align="center">${board.regDate}</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
	</form:form>
</body>
</html>