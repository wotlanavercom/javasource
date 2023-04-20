<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<%
	int no = Integer.parseInt(request.getParameter("no"));
	out.print("no"+no);
%>
<h1>회원 상세 조회</h1>
<form action="insertPro.jsp" method="post">
  <div class="mb-3">
    <label for="name" class="form-label">name</label>
    <input type="text" class="form-control" id="name" name="name" readonly>    
  </div>
  <div class="mb-3">
    <label for="birthYear" class="form-label">birthYear</label>
    <input type="text" class="form-control" id="birthYear" name="birthYear" readonly>    
  </div>
  <div class="mb-3">
    <label for="addr" class="form-label">addr</label>
    <input type="text" class="form-control" id="addr" name="addr" readonly>    
  </div>
  <div class="mb-3">
    <label for="mobile" class="form-label">mobile</label>
    <input type="text" class="form-control" id="mobile" name="mobile" readonly>
  </div>  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>	
<%@include file="include/footer.jsp" %>