<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<h2><spring:message code="board.header.list"/></h2>

<!-- 검색 폼을 만든다. -->
<form:form modelAttribute="pgrq" method="get" action="list${pgrq.toUriStringByPage(1)}">
	<form:select path="searchType" items="${searchTypeCodeValueList}" itemValue="value" itemLabel="label"/>
	<form:input path="keyword"/>
	<button id="searchBtn"><spring:message code="action.search"/></button>
</form:form>

<sec:authorize access="hasRole('ROLE_MEMBER')">
	<a href="register"><spring:message code="action.new"/></a>
</sec:authorize>

<table border="1">
	<tr>
		<th align="center" width="80"><spring:message code="board.no"/></th>
		<th align="center" width="320"><spring:message code="board.title"/></th>
		<th align="center" width="100"><spring:message code="board.writer"/></th>
		<th align="center" width="180"><spring:message code="board.regdate"/></th>
	</tr>
	<c:choose>
		<c:when test="${empty list}">
			<tr>
				<td colspan="4">
				<spring:message code="common.listEmpty"/>
				</td>
			</tr>
		</c:when>
		<c:otherwise>
			<c:forEach items="${list}" var="board">
				<tr>
					<td align="center">${board.boardNo}</td>
					<%-- <td align="left"><a href="/board/read?boardNo=${board.boardNo}">${board.title}</a></td> --%>
					<%-- 게시글 상세보기할때 페이징 요청 정보를 매개변수로 전달한다. --%>
					<td align="left"><a href="/board/read${pgrq.toUriString(pgrq.page)}&boardNo=${board.boardNo}"><c:out value="${board.title}"/></a></td>
					<td align="right">${board.writer}</td>
					<td align="center"><fmt:formatDate value="${board.regDate}" pattern="yyyy-MM-dd HH:mm"/></td>
				</tr>
			</c:forEach>
		</c:otherwise>
	</c:choose>
</table>
<div>
	<c:if test="${pagination.prev}">
		<a href="${pagination.startPage -1}">&laquo;</a>
	</c:if>
	
	<c:forEach begin="${pagination.startPage}" end="${pagination.endPage}" var="idx">
		<a href="/board/list${pagination.makeQuery(idx)}">${idx}</a>
	</c:forEach>
	
	<c:if test="${pagination.next && pagination.endPage > 0}">
		<a href="${pagination.endPage + 1}">&raquo;</a>
	</c:if>
</div>

<script>
	var result = "${msg}";
	
	if(result === "SUCCESS"){
		alert("<spring:message code='common.processSuccess'/>");
	}
</script>