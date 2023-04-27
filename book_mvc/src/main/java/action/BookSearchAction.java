package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import domain.BookDTO;
import domain.SearchDTO;
import service.BookSearchService;

public class BookSearchAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {

		//get
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");
		
		BookSearchService service = new BookSearchService();
		List<BookDTO> list = service.list(criteria, keyword);
		
		SearchDTO searchDTO = new SearchDTO(criteria, keyword);
//		request.setAttribute("criteria", criteria);
//		request.setAttribute("keyword", keyword);
		
		request.setAttribute("searchDTO", searchDTO);
		request.setAttribute("list", list);
		
		return new BookActionForward(false, "list.jsp");
	}

}
