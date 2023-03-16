package ch1;

import java.util.Scanner;

public class VariableEx6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//사용자로부터 두개의 피연산자를 입력받기
		System.out.print("첫 번째 수 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 수 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		//사칙연산 결과 출력
		
		System.out.println("num1-num2="+(num1-num2));
		System.out.println("num1+num2="+(num1+num2));
		System.out.println("num1*num2="+(num1*num2));
		System.out.println("num1/num2="+(num1/num2));
	
	    		
	    		
		System.out.printf("num1-num2=%d\n",(num1-num2));
		System.out.printf("num1+num2=%d\n",(num1+num2));
		System.out.printf("num1*num2=%d\n",(num1*num2));
		System.out.printf("num1/num2=%d\n"+ "",(num1/num2));
						
	    		
	    		
	    	
	    
	}


}
