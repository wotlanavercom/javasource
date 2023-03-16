package ch6;

public class Register {
	String userid;  //아이디
	String password;//비밀번호
	String mobile;  //핸드폰(필수 요소 아님)
	public Register(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	public Register(String userid, String password, String mobile) {
		super();
		this.userid = userid;
		this.password = password;
		this.mobile = mobile;
	}

}
