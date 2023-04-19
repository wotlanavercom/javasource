<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//모든 세션 제거
	session.invalidate();
	//원래 있던 곳으로 이동
	response.sendRedirect("sessionTest1.jsp");
%>