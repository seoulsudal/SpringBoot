<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>@ModelAttribute 애너테이션</title>
</head>
<body>
	<h1>데이터 전달 화면</h1>
	
	<form action="/registerModelForm01" method="post">
		userId : <input type="text" name="userId" value="hong01"><br>
		password : <input type="text" name="password" value="1234"><br>
		<input type="submit" value="registerModelForm01">
	</form>
	
	<form action="/registerModelForm02" method="post">
		userId : <input type="text" name="userId" value="hong02"><br>
		password : <input type="text" name="password" value="1234"><br>
		<input type="submit" value="registerModelForm02">
	</form>
	
	<form action="/registerModelForm03" method="post">
		userId : <input type="text" name="userId" value="hong03"><br>
		password : <input type="text" name="password" value="1234"><br>
		<input type="submit" value="registerModelForm03">
	</form>
	
	<form action="/registerModelForm04" method="post">
		userId : <input type="text" name="userId" value="hong04"><br>
		password : <input type="text" name="password" value="1234"><br>
		<input type="submit" value="registerModelForm04">
	</form>
	
</body>
</html>