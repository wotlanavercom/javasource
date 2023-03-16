package thread;

import javax.swing.JOptionPane;

//두 쓰레드가 서로 다른 자원을 사용하는 작업의 경우에는
//멀티쓰레드 프로세스가 더 효율적임

public class MultiThread2 {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadEx6 t1 = new ThreadEx6();
		//실행 대기열에 저장되어 자신의 차례가 올때까지 기다림
		t1.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력하신 값은 "+input+"입니다.");
		
		

	}

}
