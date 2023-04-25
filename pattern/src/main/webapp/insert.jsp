<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- form 전송 시 서블릿으로 전송 --%>
<form action='<c:url value="/insert.do"/>' method="post">
	<div>
		<label for="name">이름</label>
		<input type="text" name="name" id="name" />
	</div>
	<div>
		<button>보내기</button>
	</div>
</form>
</body>
</html>