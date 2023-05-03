package board.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardUpdateService;
import board.util.BoardUploadUtils;

public class BoardUpdateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		
		BoardUploadUtils utils = new BoardUploadUtils();
		Map<String, String> formDate = utils.uploadFile(request);
		
		BoardDTO dto = new BoardDTO();
		dto.setBno(Integer.parseInt(formDate.get("bno")));
		dto.setTitle(formDate.get("title"));
		dto.setContent(formDate.get("content"));
		dto.setPassword(formDate.get("password"));
		if(formDate.containsKey("attach")) {
			dto.setAttach(formDate.get("attach"));
		}
		
		BoardUpdateService service = new BoardUpdateService();
		
		String path = "";
		if(service.update(dto)) {
			path = "read.do?bno="+dto.getBno();
		}else {
			path = "modify.do?bno="+dto.getBno();
		}
		return new ActionForward(true, path);
	}

}
