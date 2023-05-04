package board.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardReplyService;
import board.util.BoardUploadUtils;

public class BoardReplyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		
		BoardUploadUtils utils = new BoardUploadUtils();
		Map<String, String> formDate = utils.uploadFile(request);
		
		BoardDTO dto = new BoardDTO();
		//답변글 정보
		dto.setName(formDate.get("name"));
		dto.setTitle(formDate.get("title"));
		dto.setContent(formDate.get("content"));
		if(formDate.containsKey("attach")) {
			dto.setAttach(formDate.get("attach"));
		}
		dto.setPassword(formDate.get("password"));
		
		//원본글 정보
		int bno = Integer.parseInt(formDate.get("bno"));
		dto.setReRef(Integer.parseInt(formDate.get("re_ref")));
		dto.setReLev(Integer.parseInt(formDate.get("re_lev")));
		dto.setReSeq(Integer.parseInt(formDate.get("re_seq")));
		
		BoardReplyService service = new BoardReplyService();
		
		String path = "";
		if(service.reply(dto)) {
			path = "list.do";
		}else {
			path = "replyView.do?bno="+bno;
		}
		return new ActionForward(true, path);
	}

}
