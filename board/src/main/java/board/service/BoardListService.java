package board.service;

import java.util.List;

import board.domain.BoardDTO;
import board.domain.PageDTO;
import board.persistence.BoardDAO;

public class BoardListService {
	
	public List<BoardDTO> getlist(PageDTO pageDTO){
		return new BoardDAO().getRows(pageDTO);
	}

}
