package thread;

//싱글 쓰레드 : -, | 출력하는 작업을 두개의 쓰레드가 연속적으로 처리
//두 쓰레드가 번갈아가면서 작업을 처리하기 때문에 쓰레드간 작업전환시간 소요
public class ThreadEx4 {
	
	static long start = 0;	

	public static void main(String[] args) {
		
		BarPrint t1 = new BarPrint();
		t1.start();
		
		start = System.currentTimeMillis();
		
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		long end = System.currentTimeMillis();
		
		System.out.println("소요시간 1 "+(end-start));
		
		
		
	}

}
