package ch1;

/*자바
 * 클래스 기본 : 클래스 이름은 대문자로 시작
 * 결과 출력 : main 메소드 필수
 * 
 */

public class Hello {

	public static void main(String[] args) {
		
		//syso =>ctrl+space : 자동완성
		System.out.println("Hello");
		System.out.println("안녕하세요");
		System.out.println("123456");
		
		System.out.print("123456");
		System.out.print("123456");
		
		int x=5,y=0,z=0;
		
		y=x++;
		z=--x;
		System.out.println(x+","+y+","+z);
	
	}

}
