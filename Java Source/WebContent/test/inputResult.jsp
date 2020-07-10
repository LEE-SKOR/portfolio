<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% 
	request.setCharacterEncoding("utf-8");
	String[] hobby = request.getParameterValues("hobby");
%>
<jsp:useBean id="student" class="com.exam.StudentBean"></jsp:useBean>
<jsp:setProperty property="*" name="student"/>
<%
	String[] h = student.getHobby();
	String strHobby = "";
	for(int i=0; i<h.length; i++){
		strHobby += h[i]+" ";
	}
%>
</head>
<body>
이름 : <jsp:getProperty property="name" name="student"/><br>
<hr>
이름 : <%=student.getName() %><br>
학번 : <%=student.getStudentID() %><br>
성별 : <%=student.getGender() %><br>
전공 : <%=student.getMajor() %><br>
<%
	String str ="";
	if(hobby!=null){
	for(int i=0; i<hobby.length; i++){
		str+=hobby[i]+" ";
	}
}
%>
취미 : <%=str %>	

</body>
</html>