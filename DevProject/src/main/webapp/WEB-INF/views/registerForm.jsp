<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>요청 처리 Register Form</title>
</head>
<body>
	<!-- <a href="register?userId=hong&password=1234">register?userId=hong&amp;password=1234</a><br>
	<a href="register/hong">register/hong</a><br>
	<form action="register01" method="post">
		userId: <input type="text" name="userId" value="hong01"><br>
		password: <input type="text" name="password" value="1234"><br>
		coin: <input type="text" name="coin" value="101"><br>
		<input type="submit" value="register01">
	</form>
	<form action="register02" method="post">
		userId: <input type="text" name="userId" value="hong02"><br>
		password: <input type="text" name="password" value="1234"><br>
		coin: <input type="text" name="coin" value="102"><br>
		<input type="submit" value="register02">
	</form>
	<form action="register03" method="post">
		userId: <input type="text" name="userId" value="hong03"><br>
		password: <input type="text" name="password" value="1234"><br>
		coin: <input type="text" name="coin" value="103"><br>
		<input type="submit" value="register03">
	</form>
	<form action="register04" method="post">
		userId: <input type="text" name="userId" value="hong04"><br>
		password: <input type="text" name="password" value="1234"><br>
		coin: <input type="text" name="coin" value="104"><br>
		<input type="submit" value="register04">
	</form>
	<form action="register05" method="post">
		userId: <input type="text" name="userId" value="hong05"><br>
		password: <input type="text" name="password" value="1234"><br>
		coin: <input type="text" name="coin" value="105"><br>
		<input type="submit" value="register05">
	</form> -->
	
	<!-- <a href="register/hong">register/hong</a><br>
	<a href="register/hong/100"">register/hong/100</a><br>
	<form action="/register01" method="post">
		userId: <input type="text" name="userId" value="hong"><br>
		password: <input type="text" name="password" value="1234"><br>
		coin: <input type="text" name="coin" value="100"><br>
		<input type="submit" value="register01">
	</form>
	<form action="/register02" method="post">
		userId: <input type="text" name="userId" value="hong"><br>
		password: <input type="text" name="password" value="1234"><br>
		coin: <input type="text" name="coin" value="100"><br>
		<input type="submit" value="register02">
	</form> -->
	
	<!-- <form action="/registerbeans01" method="post">
		userId: <input type="text" name="userId" value="hong"><br>
		password: <input type="text" name="password" value="1234"><br>
		coin: <input type="text" name="coin" value="100"><br>
		<input type="submit" value="/registerbeans01">
	</form>
	<form action="/registerbeans02" method="post">
		userId: <input type="text" name="userId" value="hong"><br>
		password: <input type="text" name="password" value="1234"><br>
		coin: <input type="text" name="coin" value="100"><br>
		<input type="submit" value="/registerbeans02">
	</form> -->
	
	<!-- <a href="registerByDate01?userId=hong&dateOfBirth=2000/10/20">registerByDate01?userId=hong&amp;dateOfBirth=2000/10/20</a><br>
	<a href="registerByDate02?userId=hong&dateOfBirth=2000/10/20">registerByDate02?userId=hong&amp;dateOfBirth=2000/10/20</a><br>
	<form action="/registerdate" method="post">
		userId: <input type="text" name="userId" value="hong"><br>
		password: <input type="text" name="password" value="1234"><br>
		dateOfBirth: <input type="text" name="dateOfBirth" value="2000/10/20"><br>
		<input type="submit" value="registerdate">
	</form> -->
	
	<!-- <a href="registerByDateFormat?userId=hong&dateOfBirth=20001020">registerByDateFormat?userId=hong&dateOfBirth=20001020</a><br>
	<a href="registerByDateFormat01?userId=hong&dateOfBirth=2000-10-20">registerByDateFormat01?userId=hong&dateOfBirth=2000-10-20</a><br>
	<a href="registerByDateFormat02?userId=hong&dateOfBirth=2000/10/20">registerByDateFormat02?userId=hong&dateOfBirth=2000/10/20</a><br>
	<a href="registerByDateFormat03?userId=hong&dateOfBirth=20001020">registerByDateFormat03?userId=hong&dateOfBirth=20001020</a><br>
	<form action="/register" method="post">
		userId: <input type="text" name="userId" value="hong"><br>
		password: <input type="text" name="password" value="1234"><br>
		dateOfBirth: <input type="text" name="dateOfBirth" value="20001020"><br>
		<input type="submit" value="register">
	</form> -->
	
	<form action="/registerUserId" method="post">
		userId: <input type="text" name="userId"><br>
		<input type="submit" value="registerUserId">
	</form>
	
	<form action="/registerMemberUserId" method="post">
		userId: <input type="text" name="userId"><br>
		<input type="submit" value="registerMemberUserId">
	</form>
	
	<form action="/registerPassword" method="post">
		password: <input type="text" name="password"><br>
		<input type="submit" value="registerPassword">
	</form>
	
	<form action="/registerRadio" method="post">
		gender: <br>
			 <input type="radio" name="gender" value="male" checked="checked">Male<br>
			 <input type="radio" name="gender" value="female">Female<br>
			 <input type="radio" name="gender" value="other">Other<br>
		<input type="submit" value="registerRadio">
	</form>
	
	<form action="/registerSelect" method="post">
		nationality:
			 <select name="nationality">
			 	<option value=Korea selected="selected">대한민국</option>
			 	<option value="Germany">독일</option>
			 	<option value="Australia">호주</option>
			 	<option value="Canada">캐나다</option>
			 </select><br>
		<input type="submit" value="registerSelect">
	</form>
	
	<form action="/registerMultipleSelect01" method="post">
		cars:
			 <select name="cars" multiple="multiple">
			 	<option value=volvo>Volvo</option>
			 	<option value="saab">Saab</option>
			 	<option value="opel">Opel</option>
			 	<option value="audi">Audi</option>
			 </select><br>
		<input type="submit" value="registerMultipleSelect01">
	</form>
	
	<form action="/registerMultipleSelect02" method="post">
		carArray:
			 <select name="carArray" multiple="multiple">
			 	<option value=volvo>Volvo</option>
			 	<option value="saab">Saab</option>
			 	<option value="opel">Opel</option>
			 	<option value="audi">Audi</option>
			 </select><br>
		<input type="submit" value="registerMultipleSelect02">
	</form>
	
	<form action="/registerMultipleSelect03" method="post">
		carList:
			 <select name="carList" multiple="multiple">
			 	<option value=volvo>Volvo</option>
			 	<option value="saab">Saab</option>
			 	<option value="opel">Opel</option>
			 	<option value="audi">Audi</option>
			 </select><br>
		<input type="submit" value="registerMultipleSelect03">
	</form>
	
	<form action="/registerCheckbox01" method="post">
		hobby: <br>
			 <input type="checkbox" name="hobby" value="Sports">Sports<br>
			 <input type="checkbox" name="hobby" value="Music">Music<br>
			 <input type="checkbox" name="hobby" value="Movie">Movie<br>
		<input type="submit" value="registerCheckbox01">
	</form>
	
	<form action="/registerCheckbox02" method="post">
		hobbyArray: <br>
			 <input type="checkbox" name="hobbyArray" value="Sports">Sports<br>
			 <input type="checkbox" name="hobbyArray" value="Music">Music<br>
			 <input type="checkbox" name="hobbyArray" value="Movie">Movie<br>
		<input type="submit" value="registerCheckbox02">
	</form>
	
	<form action="/registerCheckbox03" method="post">
		developer: <br>
			 <input type="checkbox" name="developer" value="Y"><br>
		<input type="submit" value="registerCheckbox03">
	</form>
	
	<form action="/registerCheckbox04" method="post">
		foreigner: <br>
			 <input type="checkbox" name="foreigner" value="false"><br>
		<input type="submit" value="registerCheckbox04">
	</form>
	
	<form action="/registerAddress" method="post">
		postCode: <input type="text" name="postCode"><br>
		location: <input type="text" name="location"><br>
		<input type="submit" value="registerAddress">
	</form>
	
	<form action="/registerUserAddress" method="post">
		address.postCode: <input type="text" name="address.postCode"><br>
		address.location: <input type="text" name="address.location"><br>
		<input type="submit" value="registerUserAddress">
	</form>
	
	<form action="/registerUserCardList" method="post">
		카드1 - 번호: <input type="text" name="cardList[0].no"><br>
		카드1 - 유효년월: <input type="text" name="cardList[0].validMonth"><br>
		카드2 - 번호: <input type="text" name="cardList[1].no"><br>
		카드2 - 유효년월: <input type="text" name="cardList[1].validMonth"><br>
		<input type="submit" value="registerUserCardList">
	</form>
	
	<form action="/registerTextArea" method="post">
		introduction: <br>
			 <textarea rows="6" cols="50" name="introduction"></textarea><br>
		<input type="submit" value="registerTextArea">
	</form>
	
	<form action="/registerDate01" method="post">
		dateOfBirth: 
			 <input type="text" name="dateOfBirth"><br>
		<input type="submit" value="registerDate01">
	</form>
	
</body>
</html>