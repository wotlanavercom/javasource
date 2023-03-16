package exam;

//패키지 : 관련된 클래스, 인터페이스, 추상클래스 모아놓은것
//import : 다른 패키지에 있는거 불러올때 사용

import java.util.Scanner;

public class CalcEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Num1 : ");
		int num1 = Integer.parseInt(sc.nextLine());		
		System.out.println("Input Num2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("Input operator : ");
		String op = sc.nextLine();
		
		Calc calc = null;
		switch (op) {
		case "+":
			calc = new Add();
			break;
		case "-":
			calc = new Sub();
			break;
		case "*":
			calc = new Mul();
			break;
		case "/":
			calc = new Div();
			break;

		
		}
		calc.setValue(num1, num2);	
		System.out.println("결과 "+ calc.calaulate());

	}

}

