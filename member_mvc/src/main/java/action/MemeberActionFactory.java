package action;

public class MemeberActionFactory {
	private static MemeberActionFactory maf;
	private MemeberActionFactory() {}
	public static MemeberActionFactory getInstance() {
		if(maf == null) {
			maf = new MemeberActionFactory();
		}
		return maf;
	}
	public Action action(String cmd) {
		Action action = null;
		
		if(cmd.equals("/login.do")) {
			action = new MemberLoginAction();
		}else if (cmd.equals("/logout.do")) {
			action = new MemberLogoutAction();
		}else if (cmd.equals("")) {
			
		}
		
		
		return action;
	}

}
