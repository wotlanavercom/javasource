package board.service;

import board.domain.BoardDTO;
import board.persistence.BoardDAO;

public class BoardReplyService {
	
	public boolean reply(BoardDTO replyDto) {
		return new BoardDAO().reply(replyDto);
	}

}
