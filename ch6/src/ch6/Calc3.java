package ch6;
/*
 * 한 클래스 안에서 다른 메소드 호출할 수 있음(객체 생성 필요없음)
 * 호출 시 메소드 타입에 맞춰서 호출(같은 클래스 안에서는 이름만 쓰면 됨)
 */

public class Calc3 {
	int plus(int x, int y) {
		return x+y;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		return sum/2;
	}
	
	void execute() {
		println("실행결과 : "+avg(7,10));
	}
	
	void println(String message) {
		System.out.println(message);
	}

}
