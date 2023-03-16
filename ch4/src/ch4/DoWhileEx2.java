package ch4;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {
		//1~100 사이의 임의의 숫자를 저장
		//사용자는 임의의 숫자를 맞추는 게임
		//임의의 숫자를 맞출때까지 사용자로부터 입력받기
		
		int answer = (int)(Math.random()*100)+1;
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		do {
			System.out.print("1~100 사이의 정수를 입력하세요");
			input = Integer.parseInt(sc.nextLine());
			
			if (input > answer) {
				System.out.println("더 작은 수를 입력하세요");
			}else if(input < answer){
				System.out.println("더 큰수를 입력하세요");
			}
				
		} while (input!=answer);
		
		System.out.println("정답!");
		

	}

}
