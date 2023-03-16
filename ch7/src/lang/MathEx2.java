package lang;

import static java.lang.Math.*; //import 를 static 으로 처리  /(java.lang.)클래스명(Math.)메소드명(*)모두다
//Math 클래스 : 기본적인 수학계산에 유용한 메서드로 구성
//생성자가 없음 => new가 안됨(인스턴스 생성 불가) ==> 모든 메서드, 필드들이 static 임
public class MathEx2 {

	public static void main(String[] args) {
		//Math math = new Math(); X
		
		System.out.println(E);
		System.out.println(PI);
		
		//반올림, 올림, 버림
		double val = 90.7552;
		System.out.println("round("+val+") = "+round(val));
		
		val *= 100;
		System.out.println("round("+val+") = "+round(val));
		
		System.out.println("round("+val+")/100 = "+round(val)/100);
		System.out.println("round("+val+")/100.0 = "+round(val)/100.0);
		System.out.println();
		
		//실수 : %f, %3.1f : 출력시 전체 자릿수는 3자리, 소수점은 첫째자리까지
		//ceil() : 올림
		System.out.printf("ceil(%3.1f = %3.1f\n",1.1,ceil(1.1));
		//floor() : 버림
		System.out.printf("floor(%3.1f = %3.1f\n",1.1,floor(1.5));
		
		//max()		
		System.out.printf("max(%d,%d) = %d",5,3,max(5, 3));
		System.out.printf("min(%d,%d) = %d",5,3,min(5, 3));
		
		

	}

}
