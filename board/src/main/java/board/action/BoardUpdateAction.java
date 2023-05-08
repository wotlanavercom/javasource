package board.action;

import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.domain.PageDTO;
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
		
		
		String criteria = formDate.get("criteria");
		String keyword =  URLEncoder.encode(formDate.get("keyword"),"utf-8");
		String page = formDate.get("page");
		String amount = formDate.get("amount");
		
		
		BoardUpdateService service = new BoardUpdateService();
		
		String path = "";
		if(service.update(dto)) {
			path = "read.do?bno="+dto.getBno()+"&criteria="+criteria+"&keyword="+keyword+"&page="+page+"&amount="+amount;
		}else {
			path = "modify.do?bno="+dto.getBno()+"&criteria="+criteria+"&keyword="+keyword+"&page="+page+"&amount="+amount;
		}
		return new ActionForward(true, path);
	}

}
