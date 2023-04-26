/**
 * form submit 되기 전 유효성 검증
 * 
 * 1) 내용은 비어 있지 않아야 함(단, description 은 내용 없어도 됨)
 * 2) 코드는 무조건 4자리 입력되었는지 확인
 * 3) 가격은 숫자로 입력되었는지 확인
 * 
 * 
 * 1,2,3 만족 시 form submit하기
 */
document.querySelector(".btn-success").addEventListener("click",()=>location.href=path);

const form = document.querySelector("form");

form.addEventListener("submit",(e)=>{
const code = document.querySelector("#code");
const title = document.querySelector("#title");
const writer = document.querySelector("#writer");
const price = document.querySelector("#price");
	
	e.preventDefault();
	
	if(code.value === "" || code.value.length !== 4 || isNaN(code.value)){
		alert("코드를 확인해 주세요");
		code.select();
		return;
	}else if(title.value == ""){
		alert("도서명을 확인해 주세요");
		title.select();
		return;
	}else if(writer.value == ""){
		alert("저자명을 확인해 주세요");
		writer.select();
		return;
	}else if(price.value == ""){
		alert("가격을을 확인해 주세요");
		price.select();
		return;
	}
	form.submit();
})


//const code = document.querySelector("#code");
//const title = document.querySelector("#title");
//const writer = document.querySelector("#writer");
//const price = document.querySelector("#price");
//const description = document.querySelector("#description");

//document.querySelector(".btn-primary").addEventListener("click",(e)=>{
//	e.preventDefault();
	
//	if(code.value == "" && title.value == "" && writer.value == "" && price == ""){
//		alert("입력 값 확인")
//	}else{
		
//	}
//})

//		if(code.input.length() == 4){
			
//		}