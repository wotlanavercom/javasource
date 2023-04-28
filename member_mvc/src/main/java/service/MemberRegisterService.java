package service;

import domain.MemberDTO;
import persistence.MemberDAO;

public class MemberRegisterService {
	
	public boolean memberInsert(MemberDTO dto) {
				
		return new MemberDAO().insert(dto);
	}
}
