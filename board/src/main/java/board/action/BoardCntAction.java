package board.action;

import javax.servlet.http.HttpServletRequest;

import board.service.BoardCntService;

public class BoardCntAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		BoardCntService service = new BoardCntService();
		service.cntUpdate(bno);
		
		String path = "read.do?bno="+bno;
		
		return new ActionForward(true, path);
	}

}
