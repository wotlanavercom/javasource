package service;

import persistence.SampleDAO;

public class InsertService {
	
	//자유롭게 메소드 생성
	public boolean insertArticle() {
		
		boolean isArticle = false;
		
		//DAO 호출
		SampleDAO dao = new SampleDAO();
		isArticle = dao.insert();
		
		return isArticle;
	}
}
