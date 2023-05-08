/**
 * 
 */
//readForm 을 가져와서 readForm 전송
const readForm = document.querySelector("#readForm");
	
document.querySelector(".btn-success").addEventListener("click",()=>{
	readForm.action = "list.do";
	readForm.submit();
})

//답변 클릭시
document.querySelector(".btn-secondary").addEventListener("click",()=>{
	readForm.action = "replyView.do";
	readForm.submit();
})


const form = document.querySelector("form");

form.addEventListener("submit",(e) => {
	//수정 클릭 시 submit 기능 중지
	e.preventDefault();
	
	
	//modify.do
	readForm.action = "modify.do";
	
	readForm.submit();
})

