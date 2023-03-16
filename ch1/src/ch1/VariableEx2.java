package ch1;

public class VariableEx2 {

	public static void main(String[] args) {
		//변수 : 단 하나의 값만 저장할 수 있는 메모리 공간
		//타입 변수명 = 값;  ==> int num = 1;
		//메모리에 어떤 값을 저장할 것인가? 에 따라 타입 결정됨
		//문자 : 문자( '가' - char (2byte)), 문자열("가나다라")
		//숫자 : 정수 - byte(1byte), short(2byte), int(4byte), long(8byte)
		//    : 실수 - float(4byte), double(8byte)
		//논리 : 참(true), 거짓(false)
		
		//자바 문장의 끝은 세미콜론으로 끝나야 함
		//Type mismatch: cannot convert from int to byte
		//byte : -128 ~ 127
		
		//변수의 선언(int a;)과 초기화(a=10;)
		
		int a=10, b=5;
		
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	
		//실수형을 담을 때 기본으로 인식하는 타입은 double임
		//정밀도 차이
		double d1 = 0.12345678909;
	    float f1 = 0.1234567890f; //리터럴에 붙는 문자는 대소문자 구별 안함
	    
	    System.out.println("d1 = "+d1);
	    System.out.println("f1 = "+f1);
	    
	    boolean b1 = true;
	    	
	    System.out.println(b1);
	    
	    String b2="true";
	    System.out.println(b2);
	    
	    //빈문자열도 프로그래밍언어에서는 문자임
	    char ch1='a';
	    System.out.println(ch1);
	    System.out.println(ch1+1);//a : 97, A:65 ==> 유니코드
	    
	    //기본타입
	    //문자 : char
	    //숫자 : 정수 (byte, short, int, long)
	    //    : 실수 (float, double)
	    //논리 : boolean
	}


}
