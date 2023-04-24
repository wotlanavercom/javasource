/**목록으로 클릭 시 : List.jsp
 * 수정 클릭 시 : form 안에 no값 가져오기
 * 			   modify.jsp 이동
 * 			   modify.jsp?no=가져온값
 * 
 * 삭제 클릭 시 : form 안에 no값 가져오기
 * 			   remove.jsp?no=가져오기
 */

 const list = document.querySelector(".btn-primary");
 const modify = document.querySelector(".btn-success");
 const remove = document.querySelector(".btn-danger");
 
 //form 안에 hidden 이용 시
 //const no = document.querySelector("#no").value;
 
 list.addEventListener("click",() => {
	 location.href = "listPro.jsp"
 });
 modify.addEventListener("click",() => {
	 location.href = "modifyPro.jsp?no=" +no
 });
 remove.addEventListener("click",() => {
	 location.href = "removePro.jsp?no=" +no
 });