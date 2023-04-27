<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>

<h1>회원 가입</h1>
<form action='<c:url value="/register.do" />' method="post">
	<div class="mb-3">
		<label for=""userid"" class="form-label">아이디</label>
		<input type="text" class="form-control" id="userid" name=""userid"" placeholder="아이디">
	</div>
	<div class="mb-3">
		<label for="password" class="form-label">비밀번호</label>
		<input type="password" class="form-control" id="password" name="password" placeholder="비밀번호">
	</div>
	<div class="mb-3">
		<label for="name" class="form-label">이름</label>
		<input type="text" class="form-control" id="name" name="name" placeholder="이름">
	</div>
	<div class="mb-3">
		<label for="gender" class="form-label">성별</label>
		<input type="radio" name="gender" id="man" value="남" class="form-chech-input" />남
		<input type="radio" name="gender" id="woman" value="여" class="form-chech-input" />여
	</div>
	<div class="mb-3">
		<label for="email" class="form-label">이메일</label>
		<input type="text" class="form-control" id="email" name="email" placeholder="이메일">
	</div>
	<button type="submit" class="btn btn-primary">회원가입</button>
	<button type="button" class="btn btn-success">취소</button>
</form>
<script>
	const path = '<c:url value="/list.do"/>'; 
</script>
<script src='<c:url value = "/js/register.js"/>'></script>
<%@include file="include/footer.jsp"%>


