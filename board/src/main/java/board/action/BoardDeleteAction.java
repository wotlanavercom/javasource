package board.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardDeleteService;
import board.util.BoardUploadUtils;

public class BoardDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		
				
		int bno = Integer.parseInt(request.getParameter("bno"));
		String password = request.getParameter("password");
		
		
		BoardDeleteService service = new BoardDeleteService();
		
		
		String path = "";
		if(service.remove(bno, password)) {
			path = "list.do";
		}else {
			path = "modify.do?bno="+bno;
		}
		return new ActionForward(true, path);
	}

}
