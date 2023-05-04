<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp"%>
<main>
	<h2>Board Reply</h2>
	<form action='<c:url value="/reply.do"/>' method="post" enctype="multipart/form-data">
  <div class="row mb-3">
    <label for="inputName" class="col-sm-2 col-form-label">작성자</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputName" name="name" required>
    </div>
  </div>
  <div class="row mb-3">
    <label for="inputTitle" class="col-sm-2 col-form-label">제목</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputTitle" name="title" required>
    </div>
  </div>
  <div class="row mb-3">
    <label for="inputContent" class="col-sm-2 col-form-label">내용</label>
    <div class="col-sm-10">
    	<textarea rows="10" class="form-control" id="inputContent" name="content" required></textarea>      
    </div>
  </div>  
  <div class="row mb-3">
    <label for="inputAttach" class="col-sm-2 col-form-label">파일첨부</label>
    <div class="col-sm-10">
      <input type="file" class="form-control" id="inputAttach" name="attach">
    </div>
  </div>
  <div class="row mb-3">
    <label for="inputPassword3" class="col-sm-2 col-form-label">비밀번호</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="inputPassword3" name="password" required>
    </div>
  </div> 
  <%-- 댓글 작성 시 원본글의 re_ref, re-lev, re_seq 를 가지고 들어기야 함 --%>   
  <input type="hidden" name="bno" value="${dto.bno}" />
  <input type="hidden" name="re_ref" value="${dto.reRef}" />
  <input type="hidden" name="re_lev" value="${dto.reLev}" />
  <input type="hidden" name="re_seq" value="${dto.reSeq}" />
  
  <button type="submit" class="btn btn-primary">댓글등록</button>
  <button type="reset" class="btn btn-danger">다시작성</button>
  <button type="button" class="btn btn-success">목록보기</button>
</form>
</main>
<script src='<c:url value="/js/write.js"/>'></script>
<%@ include file="include/footer.jsp"%>