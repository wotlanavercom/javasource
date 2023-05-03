package board.service;

import board.persistence.BoardDAO;

public class BoardCntService {
	public boolean cntUpdate(int bno) {
		return new BoardDAO().readcnt(bno);
	}

}
