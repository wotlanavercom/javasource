package ch4;

import java.util.Iterator;

//반복문
//어떤 작업이 반복적으로 수행되도록 할 때 사용
//종류 : for(주로 사용됨), while, do-while

public class ForEx1 {

	public static void main(String[] args) {
		// ① int i =0; 초기화
		// ② i < 10 조건식(false 일때 반복문 종류)
		// ③ 조건식이 true 일 때 블럭안으로 진입 : 출력문 실행
		// ④ i++ 증감식 i=1
		// ⑤ i < 10
		// ⑥ 조건식이 true 일 때 블럭안으로 진입 : 출려문 실행
		// 이런식으로 조건식이 거짓이 될때까지 반복하게 됨
		for (int i = 0; i < 10; i++) {
			System.out.print(i+"  ");
		}
//		System.out.println(i);
		
		System.out.println();
		for (int i = 10; i >= 1; i--) {
			System.out.print(i+"  ");
		}
		
		
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+"  ");
		}
		
		
		// i+=2
		
		
		int sum=10;
		sum=sum+3; // sum=+3;
		
		System.out.println();
		for (int i = 1; i <= 10; i+=2) {
			System.out.print(i+"  ");
		}
		
		System.out.println();
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Hello");
		}
		
		System.out.println();
		for (int i = 1; i <= 100; i++) {
			System.out.print(i+"  ");
		}
		
		System.out.println();
		for (int i = 1; i <= 100; i+=2) {
			System.out.print(i+"  ");
		}
		
		//1~10까지 덧셈 결과 출력
//		int sum = 1+2+3+4+5+
		
		System.out.println();
		
		int sum1=0;
		for (int i = 1; i <= 10; i++) {
			sum1 = sum1+i; //sum+=i;
		}	
		System.out.println("1~10 합"+sum1);

	}

}
