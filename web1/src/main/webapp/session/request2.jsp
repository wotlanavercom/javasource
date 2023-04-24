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
	<h2>request2</h2>
	<%=session.getAttribute("name") %>
	<%-- request1 받은 name 사용 : HttpSession 객체 사용
	
		1)사용할 값을 담는다 : setAttribute("키",담아놓을 값)
		2)필요한 페이지에서 꺼내쓴다 : getAttribute("키")
	 --%>
	 
	 <%
	 	//LoginDTO loginDTO = (LoginDTO)session.getAttribute("loginDTO");
	 
	 	//EL(Expression Language) : jsp에서 데이터를 추출하는 표현식
	 	//							setAttribute() 담아놓은 값을 쉽게 찾아다 쓰기
	 	//							${이름.변수명} : 객체로 담았을 때
	 	//							${이름} : 개별로 담았을 때
	 								
	 %>
	 <h3>로그인 정보</h3>
	 <ul>
	 	<%-- <li>아이디 : <%=session.getAttribute("id")%></li>
	 	<li>비밀번호 : <%=session.getAttribute("pwd")%></li> --%>
	 	<%-- <li>아이디 : <%=loginDTO.getUserId() %></li>
	 	<li>비밀번호 : <%=loginDTO.getPassword() %></li> --%>
	 	<li>아이디 : ${loginDTO.userId}</li>
	 	<li>비밀번호 : ${loginDTO.password}</li>
	 </ul>
</body>
</html>