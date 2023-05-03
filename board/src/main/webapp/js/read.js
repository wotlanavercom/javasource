/**
 * 
 */
document.querySelector(".btn-success").addEventListener("click",()=>{
	location.href="list.do";
})

const form = document.querySelector("form");

form.addEventListener("submit",(e) => {
	//수정 클릭 시 submit 기능 중지
	e.preventDefault();
	
	//readForm 을 가져와서 readForm 전송
	const readForm = document.querySelector("#readForm");
	
	//modify.do
	readForm.action = "modify.do";
	
	readForm.submit();
})