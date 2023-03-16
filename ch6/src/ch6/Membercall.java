package ch6;
/*변수와 메서드에 static 이 붙으면 같은 static 끼리는 문제가 없음
 * static이 붙지 않은 변수나 메서드를 호출하려면 인스턴스 생성 후 가능
 * 
 */
public class Membercall {
	//인스턴스 변수
	int iv=10;
	//static(클래스) 변수
	static int cv=20;
	
	//인스턴스 변수 = 클래스 변수
	int iv2 = cv;
	//클래스변수 = 인스턴스 변수
	//인스턴스 변수의 값을 클래스 변수에 대입 불가
//	static int cv2 = iv;  ==>new 이후에만 가늠
	
	static void staticMethod1() {
		System.out.println(cv);
		//System.out.println(iv); ==>new 이후에만 가늠
		//instanceMethod1();  ==>new 이후에만 가늠
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		//iv와 instanceMethod1()은 생성되는 시기가 같음
		System.out.println(iv);
	}

}
