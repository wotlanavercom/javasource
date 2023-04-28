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
		}else if (cmd.equals("/register.do")) {
			action = new MemberRegisterAction();
		}else if (cmd.equals("/change.do")) {
			action = new MemberChangeAction();
		}else if (cmd.equals("/leave.do")) {
			action = new MemberLeaveAction();
		}else if (cmd.equals("/dupId.do")) {
			action = new MemberDupAction();
		}
		
		
		return action;
	}

}
