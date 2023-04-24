<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <h4>아이디 : <%=request.getParameter("userid") %></h4>
<h4>비밀번호 : <%=request.getParameter("psddword") %></h4> --%>

<h4>아이디 : <%=request.getAttribute("userid") %></h4>
<h4>비밀번호 : <%=request.getAttribute("password") %></h4>
<h2>EL 사용 시</h2>
<h4>아이디 : ${userid}</h4>
<h4>비밀번호 : ${password}</h4>

</body>
</html>