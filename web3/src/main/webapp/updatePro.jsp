<%@page import="user.persistence.UserDAO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//form 내용 가져오기
	request.setCharacterEncoding("utf-8");

	int no = Integer.parseInt(request.getParameter("no"));
	String addr = request.getParameter("newaddr");
	String mobile = request.getParameter("newmobile");

	UserDAO dao = new UserDAO();
	
	
	String path = "";
	if(dao.update(no, addr, mobile)){
	//update 성공 시 페이지 이동
		path = "getPro.jsp?no="+no;
	}else{
		path = "modifyPro.jsp?no="+no;
	}
	response.sendRedirect(path);
	
			
			
	
			

%>