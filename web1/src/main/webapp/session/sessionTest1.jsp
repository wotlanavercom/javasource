<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
<%-- session 정보는 서버 쪽에 저장 --%>
	<h1>세션 확인 : <%=session.getAttribute("name") %></h1>
	<h1>세션 테스트</h1>
	<button type="button" class="btn btn-primary">세션 값 저장</button>
	<button type="button" class="btn btn-success">세션 값 삭제</button>
	<button type="button" class="btn btn-danger">세션 값 초기화</button>
	<script src="session.js"></script>
</body>
</html>