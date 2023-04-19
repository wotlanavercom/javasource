<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- 
    	jsp 지시어 : <%@   ~~~~ %>
    	1) page
    	   ① language
    	   ② contentType
    	   ③ pageEncoding
    	   ④ import
    	   ⑤ isErrorPage / errorPage
    	     isErrorPage="false" 로 설정되어 있음 : 에러가 났을 때 보여줄 페이지로
    	   	 설정하려면 true 로 변경
    	   	 errorPage="에러가 났을 때 보여줄 페이지 지정
    	2) include : 페이지를 따로 생성한 후 하나로 합쳐서 서비스
    				 페이지를 모두 합친 후에 컴파일 하게 됨
    				 _jspService() 메소드 안에 선언이 되기 때문에
    				 중복된 변수명은 사용 불가
    	3) taglib
     --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date d = new Date();
%>
<%=sdf.format(d) %>
</body>
</html>