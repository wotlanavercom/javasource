<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
	세션 과 쿠키
	세션 : 서버쪽에 저장 (객체 상태로 저장 가능)
	쿠키 : 클라이언트 쪽에 저장 (객체로 저장 불가)
	      만료기간 지정, 저장할 수 있는 양이 정해져 있음
	웹 스토리지 : 브라우저에 저장(스크립트에서 할 수 있음)
			  영구저장 가능, 쿠키보다는 큰 데이터 저장
	로컬 스토리지
	세션 스토리지
 --%>
 <%
 	//서버에서 클라이언트한테 응답시 특정 값을 붙여서 보냄
 
 	response.addCookie(new Cookie("name","John"));
 	response.addCookie(new Cookie("gender","Male"));
 	response.addCookie(new Cookie("age","30"));
 	response.addCookie(new Cookie("addr","Seoul"));
 %>
 <h3>쿠키 데이터가 저장되었습니다</h3>
 <a href="getCookie1.jsp">쿠키 확인하러 가기</a>
</body>
</html>