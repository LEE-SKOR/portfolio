<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src = "../js/jquery-3.5.1.min.js"></script>
<script>
$(function(){
	$("#zipBtn").click(function(){
		window.open("zipCheck.jsp","","width=800 height=500");
	})//zipBtn
});
</script>
</head>
<body>
<a href = "list.jsp">전체보기</a><br>
<form action = "insertPro.jsp" method = "post" name = "frm">
<table border = "1">
	<tr>
		<td colspan = "2">주소록 등록하기</td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input type = "text" name = "name" id = "name"></td>
	</tr>
	<tr>
		<td>우편번호</td>
		<td><input type = "text" name = "zipcode" id = "zipcode">
		<input type = "button" value = "검색" id = "zipBtn"></td>
	</tr>
	<tr>
		<td>주소</td>
		<td><input type = "text" size = "55" name = "addr" id = "addr"></td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td><input type = "text" name = "tel" id = "tel"></td>
	</tr>
	<tr>
		<td colspan = "3" align = "center"><input type = "submit" value = "등록">
		<input type = "reset" value = "취소"></td>
</table>
</form>
</body>
</html>