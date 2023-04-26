package service;

import persistence.BookDAO;

public class BookUpdateService {
	
	public boolean updateBook(int code, int price) {
		
//		BookDAO dao = new BookDAO();
//		return dao.update(code, price);
		
		return new BookDAO().update(code, price);
	}
}
