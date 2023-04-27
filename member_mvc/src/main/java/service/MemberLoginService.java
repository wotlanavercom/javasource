package service;

import domain.MemberDTO;
import persistence.MemberDAO;

public class MemberLoginService {
	public MemberDTO login(String userid, String password) {
		MemberDAO dao = new MemberDAO();
		return dao.islogin(userid, password);
	}
}
