package board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.domain.PageDTO;
import board.service.BoardListService;
import board.service.BoardTotalService;

public class BoardListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		//criteris, keyword 값 가져오기(전체 리스트를 요청하는 경우 값은 없음)
		
		//criteris, keyword 값 가져오기(검색 리스트를 요청하는 경우 값은 있음)
		
		//검색기준과 검색어 가져오기
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");	
		
		//페이지 나누기 정보 가져오기
		int page = 1;		
		if(request.getParameter("page") !=null) {
			page = Integer.parseInt(request.getParameter("page"));			
		}
		
		int amount = 30;
		if(request.getParameter("amount") != null) {
			amount = Integer.parseInt(request.getParameter("amount"));			
		}
		
		PageDTO pageDTO = new PageDTO(criteria, keyword, page, amount);
		
		//전체게시물 가져오기
		BoardTotalService totSer = new BoardTotalService();
		int total = totSer.getTotalRow(pageDTO);
		
		//service
		BoardListService service = new BoardListService();
		List<BoardDTO> list = service.getList(pageDTO);
		
		//페이지 나누기 정보와 검색정보 담아주기
		pageDTO = new PageDTO(criteria, keyword, page, amount, total);
		
		request.setAttribute("list", list);
		request.setAttribute("pageDTO", pageDTO);
		
		//ActionForward : listForm.jsp		
		return new ActionForward(false, "listForm.jsp");
	}

}
