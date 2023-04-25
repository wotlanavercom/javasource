/**
 * 
 */
document.querySelector(".btn-primary").addEventListener("click", () => {
	location.href="listPro.jsp";
})



document.querySelector(".btn-success").addEventListener("click", () => {
	location.href="modifyPro.jsp?code="+code;
})