package thread;

/*
 * 프로세스 : 실행 중인 프로그램
 * 프로세스 안에는 최소한 하나 이상의 쓰레드가 존재(둘 이상의 쓰레드를 가진 프로세스를 멀티 쓰레드 프로세스)
 * 
 * 멀티 쓰레딩 장점
 * - cpu 사용률을 향상시킨다.
 * - 자원을 보다 효율적으로 사용할수 있다.
 * - 사용자에 대한 응답성이 향상된다.
 * - 작업이 분리되어 코드가 간결해진다.
 * 
 * 멀티 쓰레딩 고려할 부분
 * - 동기화 : synchronized => 한 쓰레드가 징행중인 작업을 다른 쓰레드가 간섭하지 못하게 막음
 * - 교착상태
 * 
 * 쓰레드 구현
 * 1)Thread 클래스 상속
 * 2)Runnable 인터페이스 구현
 */
public class ThreadEx1 {

	public static void main(String[] args) {
		
		//멀티쓰레드도 동작할 인스턴스 생성
		SmallLetters t1 = new SmallLetters();
		t1.start();
		
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
		

	}

}
