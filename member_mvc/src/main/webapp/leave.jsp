<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>
<h1>회원탈퇴</h1>
<main class="form-signin w-100 m-auto">
	<form method="post" action='<c:url value="/leave.do"/>'>		
		
		<div class="form-floating">
			<input type="text" class="form-control" id="floatingInput" placeholder="userid" name="userid" value="${loginDto.userid}">
			<label for="floatingInput">UserId</label>
		</div>
		<div class="form-floating">
			<input type="password" class="form-control" id="floatingPassword" placeholder="password" name="password">
			<label for="floatingPassword">Password</label>
		</div>

		
		<button class="w-100 btn btn-lg btn-danger" type="submit">회원탈퇴</button>
		
	</form>
</main>
<%@include file="include/footer.jsp"%>
