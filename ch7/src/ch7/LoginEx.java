package ch7;

import java.util.Scanner;

/* Exception 클래스를 상속받아서 NotExistIdException, WrongPasswordException 작성
 * 
 */
public class LoginEx {

	public static void main(String[] args) {
		//사용자로부터 아이디와 비밀번호를 입력받아 login 메소드 호출하기
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력");
		String id = sc.nextLine();
		System.out.println("비밀번호 입력");
		String pwd = sc.nextLine();
		
		
		try {
			login(id,pwd);
		} catch (NotExistIdException | WrongPasswordException e) {			
			e.printStackTrace();
		}

	}
	
	public static void login(String id, String pwd) throws NotExistIdException, WrongPasswordException {
		//id가 blue 와 일치하지 않다면 NotExistIdException 발생
		if (!id.equals("blue")) {
			throw new NotExistIdException("아이디를 확인해 주세요");
		} 
		//pwd가 1234와 일치하지 않는다면 WrongPasswordException 발생
		if (!pwd.equals("12345")) {
			throw new WrongPasswordException("비밀번호를 확인해 주세요");
		} 
	}
	

}
