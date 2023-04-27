package service;

import org.apache.jasper.tagplugins.jstl.core.Remove;

import persistence.BookDAO;

public class BookDeleteService {
	public boolean remove(int code){
		//return new BookDAO().delete(code);  밑에 두줄 한줄로
		
		BookDAO dao = new BookDAO();
		return dao.delete(code);
	}

}
