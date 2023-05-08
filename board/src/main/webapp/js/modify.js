/**
 * 
 */
document.querySelector(".btn-success").addEventListener("click",()=>{
	//location.href="list.do";
	modifyForm.action = "list.do";
	modifyForm.submit();
})

//삭제버튼 클릭 시 modifyForm 전송
//action=delete.do
	const modifyForm = document.querySelector("#modifyForm");
document.querySelector(".btn-danger").addEventListener("click",()=>{
	//password 입력여부 확인
	const password = document.querySelector("#inputPassword");
	
	if(password.value == ""){
		alert("비밀번호를 입력해 주세요");
		password.focue();
		return;
	}
	//사용자가 입력한 비밀번호를 가져와서
	//id password value 값으로 세팅
	document.querySelector("#password").value = password.value;
	
		
	modifyForm.action = "delete.do";
	modifyForm.method = "post";
	console.log(modifyForm);
	modifyForm.submit();
	
})
