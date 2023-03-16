package ch6;

// 클래스 구성요소
// 멤버변수, 메서드, 생성자 필수는 아님

public class Calc1 {
	// +, -, *, /
	// + : 두 개의 숫자를 받아서 더하기 한 후 결과를 보내기
	int add(int num1, int num2) {
//		int sum = num1+num2;
//		return sum;
		
		return num1+num2;
	}
	// - : 두 개의 숫자를 받아서 빼기 한 후 결과를 보내기
	int subtract(int num1,int num2) {
		return num1 - num2;
	}
	// * : 두 개의 숫자를 받아서 곱하기 한 후 결과를 보내기
	int multiple(int num1,int num2) {
		return num1 * num2;
	}
	// / : 두 개의 숫자를 받아서 나누기 한 후 결과를 보내기
	int divide(int num1,int num2) {
		return num1 / num2;
	}
	
	
	

}
