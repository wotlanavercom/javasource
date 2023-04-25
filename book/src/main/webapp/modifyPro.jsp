<%@page import="book.domain.BookDTO"%>
<%@page import="book.persistence.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int code = Integer.parseInt(request.getParameter("code"));

	//수정
	//1) 수정할 내용을 화면에 보여주기
	//	 ①넘어온 code 에 맞는 데이터 가져오기
	BookDAO dao = new BookDAO();
	BookDTO dto = dao.getRow(code);
	//	 ② 가져온 내용 화면에 보여주기=>update.jsp
	request.setAttribute("dto", dto);
	pageContext.forward("update.jsp");
	
	//2) 내용 수정
	//3) 업데이트



%>