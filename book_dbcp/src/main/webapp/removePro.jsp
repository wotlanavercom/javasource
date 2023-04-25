<%@page import="book.persistence.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//코드가져오기
	int code = Integer.parseInt(request.getParameter("code"));
	
	//db작업
	BookDAO dao = new BookDAO();
	
	//성공시 목록으로
	if(dao.delete(code)){
		response.sendRedirect("listPro.jsp");
	}


%>