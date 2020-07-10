<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input</title>
<script>
function check(){
	//alert(document.getElementsByName("hobby").length);
	if(document.getElementById("name").value==""){
		alert("이름을 입력하세요");
		return;
	}
	if(document.getElementById("studentID").value==""){
		alert("학번을 입력하세요");
		return;
	}
	var obj = document.getElementsByName("hobby");
	var checkCnt = false;
	for(i=0; i<obj.length;i++){
		if(obj[i].checked){
			checkCnt=true;
		}
	}
	if(checkCnt==false){
		alert("취미를 선택해주세요");
		return;
	}
	document.getElementsByName("hobby")
	
	frm.submit();
}
</script>
</head>
<body>
<form action = "inputResult.jsp" method = "post" name = "frm">
이름 : <input type = "text" name = "name" id = "name"><br>
학번 : <input type = "text" name = "studentID" id = "studentID"><br>
성별 : 
		<input type = "radio" name = "gender" value = "Male" checked> 남자
	  	<input type = "radio" name = "gender" value = "Female"> 여자<br>
	  	
<!--   	<input type = "radio" name = "gender" value = "Male" checked> 남자
	  	<label for ="Male">남자</label>
	  	<input type = "radio" name = "gender" value = "Female"> 여자
	  	<label for ="Female">여자</label> <br> -->
전공 : <select name="major"> 
     <option value="전공선택" selected>전공선택</option>
     <option value="국문학과">국문학과</option>
     <option value="체육학과">체육학과</option>
     <option value="연극영화과">연극영화과</option>
     <option value="유아교육과">유야교육과</option>
     <option value="경영학과">경영학과</option>
     </select><br>
취미 :<br>
<input type = "checkbox" name = "hobby" value ="운동"> 운동
<input type = "checkbox" name = "hobby" value ="운동1"> 운동1
<input type = "checkbox" name = "hobby" value ="운동2"> 운동2
<input type = "checkbox" name = "hobby" value ="운동3"> 운동3
<input type = "checkbox" name = "hobby" value ="운동4"> 운동4<br>

<input type = "button" value = "보내기" onclick="check()">
<input type = "reset" value = "취소">
</form>
</body>
</html>