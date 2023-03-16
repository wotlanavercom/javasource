package ch3;

import java.util.Scanner;

public class SwithchEx1 {

	public static void main(String[] args) {
		
//	switch (key) {
//	case value:
//		
//		break;
//
//	default:
//		break;
//	}	
//		int jumsu=70;
//		//지역변수 초기화 후 사용
//		char grade=' '; // char : 문자 한개
//		if(jumsu>=90) {
//			grade='A';
//		}else if(jumsu>=80) {
//			grade='B';
//		}else if(jumsu>=70) {
//			grade='C';	
//		}else if(jumsu>=60) {
//			grade='D';
//		}else if(jumsu>=50) {
//			grade='E';
//		}else { //0~49
//			grade='F';
//		}
		
		
//		int asd=11;
//		switch (asd) {
//		case 3:case 4:case 5:
//			System.out.println("봄");
//			
//			break;
//		case 6:case 7:case 8:
//			System.out.println("여름");
//			break;
//		case 9:case 10:case 11:
//			System.out.println("가을");
//			break;
//		case 12:case 1:case 2:
//			System.out.println("겨울");
//
//		default:
//			break;
//		}
//		
		
//		int month=4;
//		
//		switch (month) {
//		case 3: //month==3
//		case 4:	
//		case 5:	
//			System.out.println("현재 계절은 봄");
//			break;  //break가 속해있는 과정 빠져 나온다(다음 결과 값까지 나옴)
//		case 6:case 7:case 8:
//			System.out.println("현재 계절은 여름");
//			break;
//		case 9:case 10:case 11:
//			System.out.println("현재 계절은 가을");
//			break;
//		case 12:case 1:case 2:
//			System.out.println("현재 계절은 겨울");	
//			break;
//		}
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int month=Integer.parseInt(sc.nextLine());
		if (month==3||month==4||month==5){
			System.out.println("현재 계절은 봄");
		}else if(month==6||month==7||month==8){
			System.out.println("현재 계절은 여름");
		}else if(month==9||month==10||month==11){
			System.out.println("현재 계절은 가을");		
		}else if(month==12||month==1||month==2) {
			System.out.println("현재 계절은 겨울");	
		}
		
		
		
	

		
		
	}
	
}
