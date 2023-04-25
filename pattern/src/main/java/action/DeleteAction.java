package action;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

public class DeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request) throws Exception {
		System.out.println("code "+request.getParameter("code"));
		
	}
	
}
