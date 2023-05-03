package board.action;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardReadService;

public class BoardModifyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		BoardReadService service = new BoardReadService();
		BoardDTO dto = service.read(bno);
		
		request.setAttribute("dto", dto);
		return new ActionForward(false,"modifyForm.jsp");
	}

}
