package action;

import javax.servlet.http.HttpServletRequest;

public interface BookAction {
	public BookActionForward execute(HttpServletRequest request) throws Exception;

}
