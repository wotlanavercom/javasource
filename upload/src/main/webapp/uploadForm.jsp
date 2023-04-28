<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
	form 안에 type=file 요소가 포한되었다면, enctype 설정해야 함
	==> enctype="multipart/form-data"
	
	enctype="application/x-www-form-urlencoded"

 --%>
	<form action="upload.jsp" method="post" enctype="multipart/form-data">
		<div>
			<lable for="name">name</lable>
			<input type="text" name="name" id="name" />
		</div>
		<div>
			<lable for="file1">file1</lable>
			<input type="file" name="file1" id="file1" />
		</div>
		<div>
			<button type="submit">전송</button>
		</div>
	</form>
</body>
</html>