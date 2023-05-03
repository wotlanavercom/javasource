package board.service;

import board.domain.BoardDTO;
import board.persistence.BoardDAO;

public class BoardReadService {
	public BoardDTO read(int bno) {
		
		BoardDAO dao = new BoardDAO();		
		
		return dao.getRow(bno);
	}
}
