package ch4;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class ForEx3 {

	public static void main(String[] args) {
		//팩토리얼
		//4! = 4*3*2*1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("팩토리얼 수를 입력해주세요");
		int num = Integer.parseInt(sc.nextLine());
		
		int fact=1;
		
		for (int i = num; i >=1; i--) {
			fact = fact*i;
		}
			System.out.printf("%d! = %d",num,fact);	
		
	}

}
