<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<h1>회원 추가</h1>
<form action="insertPro.jsp" method="post">
  <div class="mb-3">
    <label for="name" class="form-label">name</label>
    <input type="text" class="form-control" id="name" name="name" placeholder="이름">    
  </div>
  <div class="mb-3">
    <label for="birthYear" class="form-label">birthYear</label>
    <input type="text" class="form-control" id="birthYear" name="birthYear" placeholder="태어난해">    
  </div>
  <div class="mb-3">
    <label for="addr" class="form-label">addr</label>
    <input type="text" class="form-control" id="addr" name="addr" placeholder="주소">    
  </div>
  <div class="mb-3">
    <label for="mobile" class="form-label">mobile</label>
    <input type="text" class="form-control" id="mobile" name="mobile" placeholder="- 포함한 핸드폰 번호 입력">
  </div>  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>	
<%@include file="include/footer.jsp" %>