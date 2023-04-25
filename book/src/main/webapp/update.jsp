<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>
<h1>도서 정보 수정</h1>
<form action="updatePro.jsp" method="post">
	<div class="mb-3">
		<label for="code" class="form-label">code</label>
		<input type="text" class="form-control" id="code" name="code" value="${dto.code}" readonly>
	</div>
	<div class="mb-3">
		<label for="title" class="form-label">title</label>
		<input type="text" class="form-control" id="title" name="title" value="${dto.title}" readonly>
	</div>
	<div class="mb-3">
		<label for="writer" class="form-label">writer</label>
		<input type="text" class="form-control" id="writer" name="writer" value="${dto.writer}" readonly>
	</div>
	<div class="mb-3">
		<label for="price" class="form-label">price</label>
		<input type="text" class="form-control" id="price" name="price" value="${dto.price}" >
	</div>
	<div class="mb-3">
		<label for="description" class="form-label">description</label>
		<textarea class="form-control" id="description" name="description" readonly>${dto.description}</textarea>
	</div>
	<button type="button" class="btn btn-primary">목록으로</button>
	<button type="submit" class="btn btn-success">수정</button>	
	<button type="button" class="btn btn-danger">삭제</button>	
</form>
<script>
	const code = ${dto.code};
</script>
<script src="/js/update.js"></script>
<%@include file="include/footer.jsp"%>
