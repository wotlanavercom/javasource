package action;

import javax.servlet.http.HttpServletRequest;

import domain.BookDTO;
import persistence.BookDAO;
import service.BookDeleteService;

public class BookDeleteAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		// get or post 넘어오는 내용 가져오기
		int code = Integer.parseInt(request.getParameter("code"));
		
		//service를 통해 데이터베이스 작업		
		BookDeleteService service = new BookDeleteService();
		boolean deleteFlag = service.remove(code);		
		
		//ActionForward
		String path = "";
		if (deleteFlag) {
			path = "list.do";
		}
		return new BookActionForward(true, path);
	}

}
