package board.action;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardReadService;

public class BoardReadAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		//get
		int bno = Integer.parseInt(request.getParameter("bno"));
		//service
		BoardReadService service = new BoardReadService();
		BoardDTO dto = service.read(bno);
		
		request.setAttribute("dto", dto);
		
		//readForm.jsp
		return new ActionForward(false, "readForm.jsp");
	}

}
