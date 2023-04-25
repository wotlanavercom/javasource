<%@page import="java.util.List"%>
<%@page import="book.persistence.BookDAO"%>
<%@page import="book.domain.BookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	//insert.jsp 에서 사용자 입력값 가져오기
	/* int code = Integer.parseInt(request.getParameter("code"));
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	int price = Integer.parseInt(request.getParameter("price"));
	String description = request.getParameter("description");
	
	BookDTO insertDto = new BookDTO(code, title, writer, price, description); */
	
	BookDTO insertDto = new BookDTO();
	insertDto.setCode(Integer.parseInt(request.getParameter("code")));
	insertDto.setTitle(request.getParameter("title"));
	insertDto.setWriter(request.getParameter("writer"));
	insertDto.setPrice(Integer.parseInt(request.getParameter("price")));
	insertDto.setDescription(request.getParameter("description"));
	
	//db작업
	BookDAO dao = new BookDAO();
		
	//페이지 이동 => 목록
	
	if (dao.insert(insertDto)) {
		response.sendRedirect("listPro.jsp");
	}else{
		response.sendRedirect("insert.jsp");
	}
	


%>