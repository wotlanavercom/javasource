<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="include/header.jsp"%>
<main>
	<h2>Board List</h2>
	<form class="row g-3 justify-content-center" action='<c:url value="/list.do"/>'>
<div class="col-auto">
	<select class="form-select" name="criteria">
		<option value="n" <c:out value="${pageDTO.criteria == null?'selected':'' }"/>>검색기준선택</option>
		<option value="title" <c:out value="${pageDTO.criteria == 'title'?'selected':'' }"/>>title</option>
		<option value="name" <c:out value="${pageDTO.criteria == 'name'?'selected':'' }"/>>name</option>
		<option value="content" <c:out value="${pageDTO.criteria == 'content'?'selected':'' }"/>>content</option>
	</select>
</div>
<div class="col-md-5">
	<input type="text" class="form-control" placeholder="검색어" name="keyword" value="${pageDTO.keyword}"/>
</div>
<div class="col-auto">
	<button type="submit" class="btn btn-secondary">검색</button>
</div>
</form>
	<table class="table">
  <thead>
    <tr>
      <th scope="col">번호</th>
      <th scope="col">제목</th>
      <th scope="col">작성자</th>
      <th scope="col">작성일</th>
      <th scope="col">조회수</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="dto" items="${list}">
    <tr>
      <th scope="row">${dto.bno}</th>      
      <td>
      <c:if test="${dto.reLev != 0}">
      	<c:forEach begin="0" end="${dto.reLev*1}">
      		&nbsp;
      	</c:forEach>
      	<span class="material-symbols-outlined">
			subdirectory_arrow_right
		</span>
      </c:if>
      <a href='<c:url value="/cntUpdate.do?bno=${dto.bno}"/>'>${dto.title}</a></td>
      <td>${dto.name}</td>
      <td>${dto.regDate}</td>
      <td>${dto.cnt}</td>
    </tr>
    </c:forEach>    
  </tbody>
</table>
</main>
<<script src='<c:url value="/js/list.js"/>'></script>
<%@ include file="include/footer.jsp"%>