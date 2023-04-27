package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class MemberLogoutAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		//get/post ==>X
		//service 필요업음(DB작업 없음)
		
		//session 해제
		HttpSession session = request.getSession();
		session.removeAttribute("loginDto"); //or session.invalidate();
		
		//ActionForward : index.jsp		
		return new ActionForward(true, "index.jsp");
	}

}
