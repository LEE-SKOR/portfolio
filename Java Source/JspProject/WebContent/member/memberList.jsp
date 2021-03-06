<%@page import="com.member.MemberDAOImpl"%>
<%@page import="com.member.MemberVO"%>
<%@page import="java.util.ArrayList"%>
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

<%
	MemberDAOImpl dao = MemberDAOImpl.getInstance();
	ArrayList<MemberVO> arr = dao.memberList();
%>
</head>
<body>
	<table class="table table-striped">
		<thead>
		<tr>
			<th scope="col">이름</th>
			<th scope="col">아이디</th>
			<th scope="col">전화번호</th>
			<th scope="col">이메일</th>
			<th scope="col">구분</th>
			<th scope="col">삭제</th>
		</tr>
		</thead>
		<tbody>
	<%
		for(MemberVO vo : arr){
			String mode = vo.getAdmin()==0?"일반회원":"관리자";
	%>
		<tr>
			<th scope="row"><%=vo.getName() %></th>
			<td><%=vo.getUserid() %></td>
			<td><%=vo.getPhone() %></td>
			<td><%=vo.getEmail() %></td>
			<td><%=mode %></td>
			<td>삭제</td>
		</tr>
	<%
		}
	%>
		
		</tbody>
	</table>
</body>
</html>