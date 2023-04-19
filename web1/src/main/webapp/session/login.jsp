<%@page import="user.domain.LoginDTO"%>
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
	String userId = request.getParameter("userid");
	String password = request.getParameter("password");
	
	//session 값을 담을 때 개별로 담는 형태
	//					DTO 객체 사용
	/* session.setAttribute("id", userId);
	session.setAttribute("pwd", password); 
	
	LoginDTO loginDTO = new LoginDTO(userId,password);
	session.setAttribute("loginDTO", loginDTO);
	
	*/
	session.setAttribute("loginDTO", new LoginDTO(userId,password));
	
%>
<h4>아이디 : <%=userId %></h4>
<h4>비밀번호 : <%=password %></h4>
<h4><a href="request2.jsp">이동</a></h4>
	
</body>
</html>