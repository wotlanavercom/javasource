package action;

import javax.servlet.http.HttpServletRequest;

import domain.BookDTO;
import service.BookUpdateService;

public class BookUpdateAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		// get or post 넘어오는 내용 가져오기
		int code = Integer.parseInt(request.getParameter("code"));
		int price = Integer.parseInt(request.getParameter("price"));
		
		//service를 통해 데이터베이스 작업
		BookUpdateService service = new BookUpdateService();
		boolean updateFlag = service.updateBook(code, price);
		
		
		
		//ActionForward
		String path = "";
		if(updateFlag) {
			path = "list.do";
		}else {
			path = "modify.do?code="+code;
		}
		return new BookActionForward(true, path);
	}

}
