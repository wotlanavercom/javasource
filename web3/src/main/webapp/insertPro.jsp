<%@page import="user.persistence.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//사용자를 위한 페이지가 아님 ==> 개발자를 위한 페이지
	//백엔드 작업
	
	request.setCharacterEncoding("utf-8");
	
	//form 에서 데이터 가져오기
	String name = request.getParameter("name");
	String birthYear = request.getParameter("birthYear");
	String addr = request.getParameter("addr");
	String mobile = request.getParameter("mobile");
	
	UserDAO dao = new UserDAO();
	boolean flag = dao.insert(name, birthYear, addr, mobile);
	
	//페이지 이동(사용자가 볼 수 있는 페이지)
	String path = "";
	if(flag){
		path = "list.jsp";
	}else{
		path = "insert.jsp"; //insert 실패
	}
	response.sendRedirect(path);
%>