package ch6;

public class Member {
	String userid;//아이디 userid ea)hong123
	String password;//비밀번호 password ex)hong123@!
	String confirmPassword;//비밀번호 확인 confirmpassword ex)hong123@!
	String hp;//전화번호 hp ex)01012341234
	String addresss;//주소 addresss ex)서울
	
	
	public Member(String userid, String password, String confirmPassword, String hp) {
		super();
		this.userid = userid;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.hp = hp;
	}

	public Member(String userid, String password, String confirmPassword, String hp, String addresss) {
		super();
		this.userid = userid;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.hp = hp;
		this.addresss = addresss;
	}


	boolean passwordAndConfirmPasswordEquals(){
		//문자열 비교 == 사용하면 안됨
		//equals()
		return password.equals(confirmPassword);
	}

}
