package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import domain.BookDTO;
import service.BookInsertService;
import service.BookListService;

public class BookInsertAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		//get or post 넘어오는 내용가져오기
		int code = Integer.parseInt(request.getParameter("code"));
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		int price = Integer.parseInt(request.getParameter("price"));
		String description = request.getParameter("description");
		
		BookDTO insertDto = new BookDTO(code, title, writer, price, description);
		
		//service를 통해 데이터베이스 작업
		BookInsertService service = new BookInsertService();
		boolean insertFlag = service.insertBook(insertDto);
		
		String path = "";
		if(insertFlag) {
			path = "list.do"; // or /book_mvc/list.do
		}else {
			path = "insert.jsp";
		}
		
		//ActionForward
		return new BookActionForward(true, path);
	}

}
