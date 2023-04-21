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


	Class.forName("oracle.jdbc.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "javadb";
	String password = "12345";
	Connection con = DriverManager.getConnection(url, user, password);
	
	PreparedStatement pstmt = null;
	String sql = "";
	if(addr != "" && mobile !=""){
	//update usertbl set addr=?, mobile=? where no=?
		sql = "update usertbl set addr=?, mobile=? where no=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, addr);
		pstmt.setString(2, mobile);
		pstmt.setInt(3, no);
	}else{
		if(addr !=""){
	//update usertbl set addr=? where no=?
		sql = "update usertbl set addr=? where no=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, addr);
		pstmt.setInt(2, no);
		}else{
	//update usertbl set mobile=? where no=?
			sql="update usertbl set mobile=? where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mobile);
			pstmt.setInt(2, no);
		}
	}
	int count = pstmt.executeUpdate();
	String path = "";
	if(count > 0){
	//update 성공 시 페이지 이동 get.jsp?no=
		path = "get.jsp?no="+no;
	}else{
		path = "modify.jsp?no="+no;
	}
	response.sendRedirect(path);
	
			
			
	
			

%>