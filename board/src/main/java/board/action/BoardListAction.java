package board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.domain.PageDTO;
import board.service.BoardListService;

public class BoardListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		//criteris, keyword 값 가져오기(전체 리스트를 요청하는 경우 값은 없음)
		
		//criteris, keyword 값 가져오기(검색 리스트를 요청하는 경우 값은 있음)
		
		//검색기준과 검색어 가져오기
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");	
		
		//페이지 나누기 정보 가져오기
		int page = Integer.parseInt(request.getParameter("page"));
		if(page == 0) {
			page = 1;			
		}
		
		int amount = Integer.parseInt(request.getParameter("amount"));
		if(amount == 0) {
			amount = 30;			
		}
		
		PageDTO pageDTO = new PageDTO(criteria, keyword, page, amount);
		
		//service
		BoardListService service = new BoardListService();
		List<BoardDTO> list = service.getlist(pageDTO);
		
		request.setAttribute("list", list);
		request.setAttribute("pageDTO", pageDTO);
		
		//ActionForward : listForm.jsp		
		return new ActionForward(false, "listForm.jsp");
	}

}
