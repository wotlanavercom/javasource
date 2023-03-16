package ch3;

import java.util.Scanner;

//조건문
//조건식과 실행될 하나의 문장 또는 블럭으로 구성된
//종류 : if(주로 사용), switch
//
//
//1. if
//1)if
//2)if~else
//3)if~else if

public class IfEx2 {
	public static void main(String[] args) {
		
		// 조건 : true/false 판별되어야 함
		//i==0, i>0, i!=10... i%2==0
		/*
		 * if (조건) { //블럭실행여부는 조건이 true 일때만 }
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력");
		int score=Integer.parseInt(sc.nextLine());
				if(score>=60) {
					System.out.println("합격");
				}
				if (score<=60) {
					System.out.println("불합격");
				}
		int num = 0;
		
		//num값이 0이라면 num=0 출력하기
		if(num==0) {
			System.out.println("num=0");
		}
		//num값이 0이 아니라면 num=0 출력하기
		if(num!=0) {
			System.out.println("num!=0");
		}
		
		//score가 60이상이면 합격 출력
		int score1=88;
		if(score1>=60) {
			System.out.println("합격");
		}
		
		
		/*if (조건) {
			//true 일때
		}else {
			//false일때
		}
		
		//성적 90이상일때 A, 성적이 80이상일때 B, 70 C.....
		if (조건1) {
			//조건1 true 일때
		}else (조건2){
			//조건2 true일때
*/		
		
		
		int jumsu=70;
		//지역변수 초기화 후 사용
		char grade=' '; // char : 문자 한개
		if(jumsu>=90) {
			grade='A';
		}else if(jumsu>=80) {
			grade='B';
		}else if(jumsu>=70) {
			grade='C';	
		}else if(jumsu>=60) {
			grade='D';
		}else if(jumsu>=50) {
			grade='E';
		}
		System.out.printf("점수 : %d, 등급 : %c\n", jumsu, grade);
		}
	}



