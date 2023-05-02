package board.action;

public class BoardActionFactory {
	
	private static BoardActionFactory baf;
	private BoardActionFactory() {};
	
	public static BoardActionFactory getInstance() {
		if(baf == null) {
			baf = new BoardActionFactory();
		}
		return baf;
	}
	public Action action(String cmd) {
		Action action = null;
		
		if(cmd.equals("/write.do")) {
			action = new BoardWriteAction();
		}else if (cmd.equals("/list.do")) {
			action = new BoardListAction();
		}
		return action;
	}

}
