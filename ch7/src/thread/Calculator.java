package thread;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	//동기화메소드
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000); //2초
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}

}
