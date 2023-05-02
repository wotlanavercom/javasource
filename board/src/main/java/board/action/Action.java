package board.action;

import javax.servlet.http.HttpServletRequest;

public interface Action {
	public ActionForward execute(HttpServletRequest request) throws Exception;

}
