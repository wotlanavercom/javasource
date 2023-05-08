package board.service;

import java.util.List;

import board.domain.BoardDTO;
import board.domain.PageDTO;
import board.persistence.BoardDAO;

public class BoardTotalService {
	
	public int getTotalRow(PageDTO pageDTO){
		
		//저체 게시물 가져오기
		BoardDAO dao = new BoardDAO();
		int total = dao.totalRows(pageDTO);
		
		
		return total;
	}

}
