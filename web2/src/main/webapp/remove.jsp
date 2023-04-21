<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//사용자 보는 페이지 아님
	//no 값 가져오기
	int no = Integer.parseInt(request.getParameter("no"));
	//no 에 해당하는 사용자 삭제
	
	Class.forName("oracle.jdbc.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "javadb";
	String password = "12345";
	Connection con = DriverManager.getConnection(url, user, password);
	
	String sql ="delete from usertbl where no=?";
	PreparedStatement pstmt = con.prepareStatement(sql);
	pstmt.setInt(1, no);
	
	int count = pstmt.executeUpdate();
	
	//삭제 결과에 따라 페이지 이동(list.jsp)
	String path ="";
	if(count > 0){
		path = "list.jsp";
	}else{
		path = "get.jsp?no="+no;
	}
	response.sendRedirect(path);

%>