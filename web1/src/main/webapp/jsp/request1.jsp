<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- name.html 에서 보낸 이름 가져오기 : 사용자의 요청 처리
	
		HttpServletRequest 객체가 필요함 => jsp 에서는 해당 객체가 이미 선언이 되어 있음
		
		HttpServletRequest request;
		
		request 로 가져올 수 있는 것들?
		1) 사용자가 보낸 데이터 ★중요!!많이 사용★ :getParameter(이름), getParameterValues(이름)
		2) 사용자가 사용한 브라우저 정보
		3) ip 주소, 사용한 프로토콜 정보....
 	 --%>
 	 <%request.setCharacterEncoding("utf-8"); %>
 	 <ul>
 	 	<li>사용자 이름 : <%=request.getParameter("name") %></li>
 	 	<li>서버 이름 : <%=request.getServerName() %></li>
 	 	<li>서버 포트 : <%=request.getServerPort() %></li>
 	 	<li>사용자 주소 : <%=request.getRemoteAddr() %></li>
 	 	<li>요청 메소드 : <%=request.getMethod() %></li>
 	 	<li>요청 프로토콜 : <%=request.getProtocol() %></li>
 	 </ul>
</body>
</html>