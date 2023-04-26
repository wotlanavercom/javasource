package action;

import javax.servlet.http.HttpServletRequest;

import domain.BookDTO;
import service.BookReadService;

public class BookModifyAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		// get or post 넘어오는 내용 가져오기
		int code = Integer.parseInt(request.getParameter("code"));
		
		//service를 통해 데이터베이스 작업
		BookReadService service = new BookReadService();
		BookDTO dto = service.read(code);
		
		request.setAttribute("dto", dto);
		
		//ActionForward
		return new BookActionForward(false, "update.jsp");
	}

}
