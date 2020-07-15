<%@page import="com.address.Address"%>
<%@page import="com.address.AddressDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div.divCss{
	text-align:right;
	background-color:silver;
	padding-right:20px;
}
a:haver{text-decoration:none;}
a:link{text-decoration:none;}
a:visited {text-decoration:none;}

td,th{text-align : center}
</style>
</head>
<script src = "https://code.jquery.com/jquery-3.5.1.min.js"></script>
<%
	request.setCharacterEncoding("utf-8");
	String word = "";
	String field = "";
	if(request.getParameter("word")!=null){
		field = request.getParameter("field");
		word = request.getParameter("word");	
	}
	AddressDAO dao = AddressDAO.getInstance();
	ArrayList<Address> arr = dao.addrList(field,word);
	int count = dao.getCount(field, word);
%>
<body>
<div class = "divCss">
	<a href = "insert.jsp"> 추가하기</a>
</div>
<table class="table table-striped table-dark">
        <thead>
          <tr>
            <th>번호</th>
            <th>이름</th>
            <th>전화번호</th>
            <th>주소</th>
          </tr>
        </thead>
	<tbody>
<%
for(int i=0; i<arr.size(); i++){
%>
	<tr>
		<td scope = "row"><%=arr.get(i).getNum() %></td>
		<td><a href="detail.jsp?num=<%=arr.get(i).getNum() %>"><%=arr.get(i).getName() %></a></td>
		<td><%=arr.get(i).getTel() %></td>
		<td><%=arr.get(i).getAddr() %></td>
	</tr>
<%
}
%>		
</tbody>
</table>
</body>
</html>