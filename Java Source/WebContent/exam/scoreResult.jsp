<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	int kor = Integer.parseInt(request.getParameter("kor"));
	int eng = Integer.parseInt(request.getParameter("eng"));
	int math = Integer.parseInt(request.getParameter("math"));
	int tot = kor+eng+math;
	int avg = tot/3;
	String grade ="";
	switch(avg/10){
	case 10 :
	case 9 : grade = "A 학점";break;
	case 8 : grade = "B 학점";break;
	case 7 : grade = "C 학점";break;
	default : grade = "F 학점";
	}
	
	/*if (avg>=90){
		grade = "A 학점";
	}else if (avg>=80){
		grade = "B 학점";
	}else if (avg>=70){
		grade = "C 학점";
	}else{
		grade = "D 학점";
	}*/
%>
<body>
이름 : <%=name %><br>
국어 : <%=kor %><br>
영어 : <%=eng %><br>
수학 : <%=math %><br>
<hr>
총점 : <%=tot %><br>
평균 : <%=avg %><br>
학점 : <%=grade%>
		
</body>
</html>