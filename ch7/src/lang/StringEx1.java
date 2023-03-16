//main() 메소드를 가지고 있는 클래스
//main() 메소드가 없는 클래스 : 다른 클래스에서 사용할 용도

//콘솔 프로그램 작성시 => 화면 출력, 입력...main() 메소드가 있는 클래스가 필요함
package lang;
/* String 클래스
 * - 변경이 불가능한 (immutable) 클래스
 * -equals() : 값 비교
 * -equalsIgnoreCase() : 대소문자 구별하지 말고 값 비교
 */
public class StringEx1 {

	public static void main(String[] args) {
		//String 클래스의 동작 구현
		//문자열을 다루는 일이 많기 때문에 new 를 사용하지 않고도 인스턴스를 생성할 수 있도록 되어 있음
		//문자열 만들기 1) 문자열 리터럴 지정 2) new 사용하는 방식
		//문자열 비교시는 무조건 equals사용!!(==사용하지 말것!)
		String str2 = "Hello"; //문자열 리터럴 지정 : 문자열 재사용 함
		String str4 = "Hello";
		String str = new String("안녕하세요");  //2) new 사용하는 방식
		String str3 = new String("안녕하세요");
		//str2 = str2+str;
		
		//문자열 비교
		//String 클래스에 equals 오버라이딩(값 비교)되어 있음
		System.out.println(str2.equals(str));
		System.out.println(str2.equalsIgnoreCase(str));
		System.out.println(str == str3);//문자열 비교시는 ==사용하지 말 것 / ==은 주소비교
		
		System.out.println(str2 == str4);//true
		

	}

}
