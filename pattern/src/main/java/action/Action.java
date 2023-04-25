package action;

import javax.servlet.http.HttpServletRequest;

public interface Action {
	public void execute(HttpServletRequest request) throws Exception; 
		
	
}
