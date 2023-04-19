<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<main>
	<h1>LOGIN</h1>
	<form action="loginprocess.jsp" method="post">
		<div class="mb-3 row">
			<label for="inputId" class="col-sm-2 col-form-label">UserId</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputId" name="inputId">
			</div>
		</div>
		<div class="mb-3 row">
			<label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
			<div class="col-sm-10">
				<input type="password" class="form-control" id="inputPassword" name="inputPassword">
			</div>
		</div>
		<div class="mb-3">
			<div class="col-sm-12">
				<input type="submit" class="btn btn-primary" value="로그인">
			</div>
		</div>
	</form>
</main>
<%@include file="footer.jsp"%>
