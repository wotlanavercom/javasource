package thread;

public class ThreadEx2 {

	public static void main(String[] args) {
		
		Thread t1 = new BigLetters(); //BigLetters t1 = new BigLetters(); 상관없음
		SmallLetters t2 = new SmallLetters();
		
//		Runnable r = new NumPrint();
//		Thread t3 = new Thread(r);
		//위에 두줄 한줄로 바꾼거
		Thread t3 = new Thread(new NumPrint());
		
		t1.start();
		t2.start();
		t3.start();

	}

}
