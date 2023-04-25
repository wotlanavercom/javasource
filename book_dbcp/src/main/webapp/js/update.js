/**
 * 
 */
document.querySelector(".btn-primary").addEventListener("click", () => {
	location.href="listPro.jsp";
})



document.querySelector(".btn-danger").addEventListener("click", () => {
	location.href="removePro.jsp?code="+code;
})