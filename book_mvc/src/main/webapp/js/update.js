/**
 * 
 */
document.querySelector(".btn-primary").addEventListener("click", () => {
	location.href=listPath;
})



document.querySelector(".btn-danger").addEventListener("click", () => {
	location.href=removePath+"?code="+code;
})