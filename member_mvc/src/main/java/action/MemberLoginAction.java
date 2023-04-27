package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domain.MemberDTO;
import service.MemberLoginService;

public class MemberLoginAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		
		//post 가져오기
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
		//service
		MemberLoginService service = new MemberLoginService();
		MemberDTO loginDto = service.login(userid, password);
		
		String path = "";
		if (loginDto != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginDto", loginDto);
			path = "index.jsp";
		}else {
			path = "login.jsp";
		}
		
		//ActionForward
		return new ActionForward(true, path);
	}

}
