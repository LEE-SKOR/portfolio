<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% request.setCharacterEncoding("utf-8"); 
String[] pgm = request.getParameterValues("pgm");
String[] play = request.getParameterValues("play");
String pgmstr = "";
String playstr = "";
	if(pgm!=null){
		for(int i=0; i<pgm.length; i++){
			pgmstr+=pgm[i]+" ";
		}
	}
	if(play!=null){
		for(int i=0; i<play.length; i++){
			playstr+=play[i]+" ";
		}
	}
%>
</head>
<body>
성명 :<%=request.getParameter("name") %><br>
성별 :<%=request.getParameter("gender") %><br>
생일 :<%=request.getParameter("year") %>-
	<%=request.getParameter("month") %>-
	<%=request.getParameter("day") %>
	<%=request.getParameter("yy") %>
	<br>
주소 :<%=request.getParameter("addr") %><br>
전화번호 :<%=request.getParameter("phone") %>-
		<%=request.getParameter("phone1") %>-
		<%=request.getParameter("phone2") %>
		<br>
프로그램 :<%=pgmstr %><br>
여행지 :<%=playstr%><br>
메모 :<%=request.getParameter("memo") %><br>

</body>
</html>