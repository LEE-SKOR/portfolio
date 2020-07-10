<%@page import="com.address.Address"%>
<%@page import="com.address.AddressDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	request.setCharacterEncoding("utf-8");
	int num = Integer.parseInt(request.getParameter("num"));
	AddressDAO dao = AddressDAO.getInstance();
	Address address = dao.addrDetail(num);

%>
</head>
<body>
<form action = "updatePro.jsp" method = "post" name = "frm">
<input type = "hidden" name = "num" value = <%=num %>>
<table>
	<tr>
		<td colspan = "2">주소록 등록하기<br></td>
	</tr>
	<tr>
		<td>이름</td>
		<td> <input type = "text" name = "name" value = "<%=address.getName()%>"></td>
	</tr>
	<tr>
		<td>우편번호</td>
		<td> <input type = "text" name = "zipcode" value = "<%=address.getZipcode()%>"><input type = "button" value = "검색"></td>
	</tr>
	<tr>
		<td>주소</td>
		<td> <input type = "text" size = 55 name = "addr" value = "<%=address.getAddr()%>"></td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td><input type = "text" name = "tel"  value = "<%=address.getTel()%>"></td>
	</tr>
	<tr>
			<td><input type = "submit" value ="수정"><input type = "button" value = "삭제"><input type = "reset" value = "취소"></td>
	</tr>
</table>
</form>
</body>
</html>