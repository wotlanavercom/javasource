<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//form 요소 가져오기
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	String op = request.getParameter("op");
	
	// +, -, *, /
	int result = 0;
	switch(op){
	case"+":
		result = num1+num2;
		break;
	case"-":
		result = num1-num2;
		break;
	case"*":
		result = num1*num2;
		break;
	case"/":
		result = num1/num2;
		break;
	
	}
%>

<%=num1%> <%=op%> <%=num2%> = <%=result %>

</body>
</html>