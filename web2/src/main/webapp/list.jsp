<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
	<h1>User List</h1>
<%
	//DB 연동 ==> JDBC 사용
	//1. 드라이버 로드
	Class.forName("oracle.jdbc.OracleDriver");
	//2. 커넥션 생성
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "javadb";
	String password = "12345";	
	Connection con = DriverManager.getConnection(url, user, password);
	
	//3. SQL 쿼리문 실행 - 1) 전체 조회
	String sql = "select * from usertbl";
	PreparedStatement pstmt = con.prepareStatement(sql);
	
	ResultSet rs = pstmt.executeQuery();  //쿼리문 실행한 후 결과 전송
%>	
<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">이름</th>
      <th scope="col">태어난해</th>
      <th scope="col">주소</th>
      <th scope="col">핸드폰</th>
    </tr>
  </thead>
  <tbody>
	
<%
	while(rs.next()){
%>	
	
    <tr>
      <th scope="row"><%=rs.getInt("no") %></th>
      <td><a href="get.jsp?no=<%=rs.getInt("no") %>"><%=rs.getString("username") %></a></td>
      <td><%=rs.getInt("birthyear") %></td>
      <td><%=rs.getString("addr") %></td>
      <td><%=rs.getString("mobile") %></td>
    </tr>    

<%
	}
%>
  </tbody>
</table>
<%@include file="include/footer.jsp" %>