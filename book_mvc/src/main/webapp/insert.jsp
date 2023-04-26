<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>

<h1>도서 정보 입력</h1>
<form action='<c:url value="/insert.do" />' method="post">
	<div class="mb-3">
		<label for="code" class="form-label">code</label>
		<input type="text" class="form-control" id="code" name="code" placeholder="도서코드">
	</div>
	<div class="mb-3">
		<label for="title" class="form-label">title</label>
		<input type="text" class="form-control" id="title" name="title" placeholder="도서명">
	</div>
	<div class="mb-3">
		<label for="writer" class="form-label">writer</label>
		<input type="text" class="form-control" id="writer" name="writer" placeholder="저자명">
	</div>
	<div class="mb-3">
		<label for="price" class="form-label">price</label>
		<input type="text" class="form-control" id="price" name="price" placeholder="도서가격">
	</div>
	<div class="mb-3">
		<label for="description" class="form-label">description</label>
		<textarea class="form-control" id="description" name="description" placeholder="상세정보"></textarea>
	</div>
	<button type="submit" class="btn btn-primary">저장</button>
	<button type="button" class="btn btn-success">목록으로</button>
</form>
<script>
	const path = '<c:url value="/list.do"/>'; 
</script>
<script src='<c:url value = "/js/insert.js"/>'></script>
<%@include file="include/footer.jsp"%>


