<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
	<h1>User List</h1>
	
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
	
%>	
	
    <tr>
      <th scope="row"><%= %></th>
      <td><a href="get.jsp?no=<%= %>"><%= %></a></td>
      <td><%= %></td>
      <td><%= %></td>
      <td><%= %></td>
    </tr>    

<%
	
%>
  </tbody>
</table>
<%@include file="include/footer.jsp" %>