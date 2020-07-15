<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" 
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" 
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" 
	crossorigin="anonymous">
<script>
function zipfinder(){
	window.open("zipCheck.jsp","","width = 700 height = 400");
}
$("#frm").submit();
</script>
</head>
<body>
<a href = "list.jsp"> 전체보기</a><br>
<form action = "insertPro.jsp" method = "post" name = "frm">
<table border = "1">
	<tr>
		<td colspan = "2">주소록 등록하기<br></td>
	</tr>
	<tr>
		<td>이름</td>
		
		<td> <input type = "text" name = "name" id = "name"></td>
	</tr>
	<tr>
		<td>우편번호</td>
		<td> <input type = "text" name = "zipcode" id = "zipcode">
		<input type = "button"  value ="검색" onclick = "zipfinder()" class="btn btn-secondary"></td>
	</tr>
	<tr>
		<td>주소</td>
		<td> <input type = "text" size = 55 name = "addr" id = "addr"></td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td><input type = "text" name = "tel" id = "tel"></td>
	</tr>
	<tr>
			<td colspan = "3" align = "center"><input type = "submit" value ="등록" class="btn btn-success">
			<input type = "reset" value = "취소" class="btn btn-info" ></td>
	</tr>
</table>
</form>
</body>
</html>