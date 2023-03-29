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
		//num1 가져오기
		int num1 = Integer.parseInt(request.getParameter("num1"));
		//num2 가져오기		
		int num2 = Integer.parseInt(request.getParameter("num2"));
	%>
	<h4><%=num1 %> + <%=num2 %> = <%=num1+num2 %></h4>
</body>
</html>