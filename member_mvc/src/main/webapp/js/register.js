/**
 * 폼 모든 요소가 비어있는지 확인
 */

const form = document.querySelector("form");

form.addEventListener("submit",(e)=>{
	if(!form.checkValidity()){
		e.preventDefault();
		e.stopPropagation();
	}
	form.classList.add("was-validated");
})

//중복 아이디 확인 코드
document.querySelector(".btn-danger").addEventListener('click',()=>{
	//사용자가 입력한 userid 가져오기
	const userid = document.querySelector('#userid').value;
	
	fetch("dupId.do",{
		method:"post",
		body: new URLSearchParams({userid:userid})
	})
	.then((response)=>response.text())
	.then((result) => {
		console.log(result);
		if(result.trim() === "true"){
			alert("아이디를 사용할 수 있습니다");
		}else{
			alert("아이디를 사용할 수 없습니다");
		}
	});
})



/*function validatePassword(password) {
  const regex = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[~!@#$%^&*()_+|<>?:{}])[A-Za-z\d~!@#$%^&*()_+|<>?:{}]{,12}$/;
  return regex.test(password);
}

function validateUserid(userid) {
  const regex = /^(?=.*[a-zA-Z])(?=.*\d)[A-Za-z\d]{,15}$/;
  return regex.test(userid);
}



 const form = document.querySelector("form");
 
 form.addEventListener("submit",(e)=>{
	 e.preventDefault();
	 
	 const userid = document.querySelector("#userid");
	 const password = document.querySelector("#password");
	 const name = document.querySelector("#name");
	 const man = document.querySelector("#man");
	 const woman = document.querySelector("#woman");
	 const email = document.querySelector("#email");
	 
	 if(!validateUserid(userid.value === "")){
		 alert("아이디는 영어, 숫자를 모두 포함하고 최대 12자 이하이어야 합니다.");
		 userid.select();
		 return;
	 }else if(!validatePassword(password.value === "")){
	 	alert("비밀번호는 영어, 숫자를 모두 포함하고 최대 15자 이하이어야 합니다.");
		 password.select();
		 return;
	 }else if(name.value === ""){
	 	alert("이름를 입력해 주세요");
		 name.select();
		 return;
	 }else if(!man.checked && !woman.checked){
	 	alert("성별을 체크해 주세요");
		 gender.select();
		 return;
	 }else if(email.value === ""){
	 	alert("이메일을 입력해 주세요");
		 email.select();
		 return;
	 }
	 form.submit();
 })
 */
 