package ch6;

public class MethodEx1 {
//	반환타입 메서드이름(타입 변수명...) {
//		메서드 호출 시 수행될 코드
//
//}
	
	void add1(){
		
	}
	
	void add2(){
		return;
	}
	
	int add3() {
		//돌아갈 때 int 값 가지고 돌아감
		return 0;
	}
	
	String add4() {
		//돌아갈 때 string 값 가지고 돌아감
		return"";
	}
	
	double add5() {
		return 0.0;
	}
	
	char add6() {
		return 'a';
	}
	
	int[] add7() {
		return new int[] {10,11,12};
	}
	
	//매개변수가 있는 메소드
	void add8(int a,int b) {
		//a와 b에 값이 있어야 함 ==> 메소드 호출 시 처리
		//매개변수를 이용한 어떤 작업을 주로 함
		System.out.println(a+b);
	}
	
	//외부에서 a와 b의 값을 받아서 결과를 리턴
	int add9(int a,int b) {
		//a와 b에 값이 있어야 함 ==> 메소드 호출 시 처리
		//매개변수를 이용한 어떤 작업을 주로 함
		//a+b 를 한 후 리턴
		return a+b;
	}
	
	double add10(int a,double b) {
		
		return a+b;
	}
}	
