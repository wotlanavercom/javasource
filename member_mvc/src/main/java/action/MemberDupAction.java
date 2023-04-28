package action;

import javax.servlet.http.HttpServletRequest;

import service.MemberDupService;

public class MemberDupAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		//post 가져오기
		String userid = request.getParameter("userid");
		
		MemberDupService service = new MemberDupService();
		boolean dupFlag = service.dupId(userid);
		//true 아이디 사용가능
		if (dupFlag) {
			request.setAttribute("dupId", "true");
		}else {
			request.setAttribute("dupId", "false");
		}

		return new ActionForward(false, "checkId.jsp");
	}

}
