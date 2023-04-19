<%@page import="user.domain.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//login.jsp 에서 사용자 입력값 가져오기
	String userId = request.getParameter("inputId");
	String password = request.getParameter("inputPassword");
	
	
	//DB작업(사용자가 입력한 아이디와 비밀번호가 회원데이터에 있는지 확인)
	
	
	//DB작업 결과에 따라 페이지 이동(성공 시 index.jsp, 실패 시 login.jsp)
	//성공 시 회원의 로그인 정보를 session 에 저장한 후 운직여야 함
	LoginDTO loginDto = new LoginDTO(userId, password);
	session.setAttribute("loginDto", loginDto);
	
	//움직이기
	response.sendRedirect("index.jsp");

%>