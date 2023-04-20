<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//cart.html 에서 사용자가 선택한 자동차 가져오기
	String product = request.getParameter("product");

	//session 에 ArrayList 사용
	//자동차를 추가하기 전에 이미 생성된 List session 이 존재하는지 확인
	ArrayList<String> products = (ArrayList<String>)session.getAttribute("products");
	
	//존재한다면 해당 session 에 선택한 자동차 추가
	if(products == null){
		products = new ArrayList<>();
		products.add(product);
		session.setAttribute("products",products);
	}else{
	//존재하지 않는다면 새로운 List 를 만들어서 session 추가
	products.add(product);
	}
	
	//가져온 자동차 정보를 session 에 저장
	//session.setAttribute("product", product);
	
%>
	<h3>장바구니 저장</h3>
	<!-- 이동할 수 있는 페이지 제공 --> 	
	<h4><a href="cartlist.jsp">장바구니 보기</a></h4>
</body>
</html>