/**
 * 기존비밀번호, 새비밀번호, 새비밀번호확인 내용 비어 있지 않도록 확인
 * 새비밀번호와 새비밀번호확인 동일한가?
 */
const form = document.querySelector("form");

form.addEventListener("submit",(e) => {
	e.preventDefault();
	
	const current = document.querySelector("#floatingPassword1");
	const newpwd = document.querySelector("#floatingPassword2");
	const confirm = document.querySelector("#floatingPassword3");
	
	if(current.value === ""){
		alert("비밀번호 입력해 주세요");
		current.select();
		return;
	}else if(newpwd.value === ""){
		alert("새 비밀번호 입력해 주세요");
		newpwd.select();
		return;
	}else if(confirm.value === ""){
		alert("새 비밀번호를 다시 입력해 주세요");
		confirm.select();
		return;
		
	}
	if(newpwd.value !== confirm.value){
		alert("새빌밀번호가 동일한지 확인해 주세요")
		confirm.select();
		return;
	}
	form.submit();
})