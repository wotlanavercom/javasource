<%@page import="user.domain.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
<div class="container">
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp">MyShop</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="login.jsp">Login</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Item
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="shoes.jsp">신발</a></li>
            <li><a class="dropdown-item" href="shirts.jsp">티셔츠</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="pants.jsp">바지</a></li>
          </ul>
        </li>        
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
<%
	//세션에 로그인정보가 담겨있는지 확인
	LoginDTO loginDto = (LoginDTO)session.getAttribute("loginDto");
	//out.print("<h3>"+loginDto+"</h3>");
	if(loginDto != null){
%>
<%-- 로그인 정보가 존재한다면 보여질 영역 --%>
<div class="alert alert-success" role="alert">
  <%=loginDto.getUserId() %>님 반갑습니다!!
</div>
<%
	}
%>
