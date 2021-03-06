<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Headers 매핑</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
/* 	$(document).ready(function() {
		$("#postBtn").on("click", function() {
			var boardNo = $("#boardNo");
			var title = $("#title");
			var content = $("#content");
			var writer = $("#writer");
			
			var boardNoVal = boardNo.val();
			var titleVal = title.val();
			var contentVal = content.val();
			var writerVal = writer.val();
			
			var boardObject = {
					boardNo : boardNoVal,
					title : titleVal,
					content : contentVal,
					writer : writerVal
			};
			
			$.ajax({
				type:"post",
				url:"/board/" + boardNoVal,
				data:JSON.stringify(boardObject),
				contentType:"application/json; charset=utf-8",
				success:function(result){
					console.log("result:" + result);
					if(result === "SUCCESS"){
						alert("SUCCESS");
					}
				}
			});
		});
		
		$("#putXmlBtn").on("click", function() {
			var boardNo = $("#boardNo");
			var title = $("#title");
			var content = $("#content");
			var writer = $("#writer");
			
			var boardNoVal = boardNo.val();
			var titleVal = title.val();
			var contentVal = content.val();
			var writerVal = writer.val();
			
			var xmlData = "<Board>";
			xmlData += "<boardNo>0</boardNo>";
			xmlData += "<title>title1</title>";
			xmlData += "<content>content1</content>";
			xmlData += "<writer>writer1</writer>";
			xmlData += "<regDate>2018-12-10</regDate>";
			xmlData += "</Board>";
			
			$.ajax({
				type:"put",
				url:"/board/" + boardNoVal,
				data:xmlData,
				contentType:"application/xml; charset=utf-8",
				success:function(result){
					console.log("result:"+result);
					if(result === "SUCCESS"){
						alert("SUCCESS");
					}
				}
			});
		});
		
		$("#putJsonBtn").on("click", function() {
			var boardNo = $("#boardNo");
			var title = $("#title");
			var content = $("#content");
			var writer = $("#writer");
			
			var boardNoVal = boardNo.val();
			var titleVal = title.val();
			var contentVal = content.val();
			var writerVal = writer.val();
			
			var boardObject = {
					boardNo : boardNoVal,
					title : titleVal,
					content : contentVal,
					writer : writerVal
			};
			
			$.ajax({
				type:"put",
				url:"/board/" + boardNoVal,
				data:JSON.stringify(boardObject),
				contentType:"application/json; charset=utf-8",
				success:function(result){
					console.log("result:"+result);
					if(result === "SUCCESS"){
						alert("SUCCESS");
					}
				}
			});
		});
		
	}); */
	$(document).ready(function() {
		$("#getBtn").on("click", function() {
			var boardNo = $("#boardNo");
			var boardNoVal = boardNo.val();
			
			console.log(boardNoVal);
			
			$.get("/board/" + boardNoVal, function(data) {
				console.log(data);
				
				alert(JSON.stringify(data));
			});
		});
		
		$("#getJsonBtn").on("click", function() {
			var boardNo = $("#boardNo");
			var boardNoVal = boardNo.val();
				
			console.log(boardNoVal);
			
			$.ajax({
				type:"get",
				url:"/board/"+boardNoVal,
				headers:{
					"Accept":"application/json"
				},
				success:function(result){
					console.log("result:"+result);
					
					alert(JSON.stringify(result));
				}
			});
		});
		
		$("#getXmlBtn").on("click", function() {
			var boardNo = $("#boardNo");
			var boardNoVal = boardNo.val();
				
			console.log(boardNoVal);
			
			$.ajax({
				type:"get",
				url:"/board/"+boardNoVal,
				headers:{
					"Accept":"application/xml"
				},
				success:function(result){
					console.log("result:"+result);
					
					alert(xmlToString(result));
				}
			});
		});
	});
	
	function xmlToString(xmlData) {
		var xmlString;
		
		if(window.ActiveXObject){
			xmlString = xmlData.xml;
		} else {
			xmlString = (new XMLSerializer()).serializeToString(xmlData);
		}
		
		return xmlString;
	}
</script>
<body>
	<h1>Ajax Home</h1>
	
	<form>
		boardNo : <input type="text" name="boardNo" id="boardNo" value=""><br>
		title : <input type="text" name="title" id="title" value=""><br>
		content : <input type="text" name="content" id="content" value=""><br>
		writer : <input type="text" name="writer" id="writer" value=""><br>
	</form>
	<div>
		<button id="getBtn">읽기</button>
		<button id="getJsonBtn">읽기(json)</button>
		<button id="getXmlBtn">읽기(xml)</button>
	</div>
</body>
</html>