package board.action;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import board.service.BoardCntService;

public class BoardCntAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		//페이지 나누기 정보
		String criteria = request.getParameter("criteria");
		String keyword = URLEncoder.encode(request.getParameter("keyword"),"utf-8");
		String page = request.getParameter("page");
		String amount = request.getParameter("amount");
		
		
		BoardCntService service = new BoardCntService();
		service.cntUpdate(bno);
		
		String path = "read.do?bno="+bno+"&criteria="+criteria+"&keyword="+keyword+"&page="+page+"&amount="+amount;
		
		return new ActionForward(true, path);
	}

}
