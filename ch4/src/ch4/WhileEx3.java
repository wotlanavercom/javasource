package ch4;

import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {
		// 사용자로부터 숫자를 입력받기
		// 숫자의 각 자리릐 합 구하기
		// 12345 ==> 5+4+3+2+1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		int num = Integer.parseInt(sc.nextLine());
		int sum = 0;		
		while (num!=0) {
			sum += num % 10;
			System.out.printf("sum=%3d num=%d\n",sum,num);
			
			num = num/10;
		}	
		System.out.println("각 자리수의 합"+sum);
	}

}
