package thread;

//Thread 작성
public class BigLetters extends Thread {
	@Override
	public void run() {
		//같이 수행할 코드 작성
		// a~z
		
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
		
	}

}
