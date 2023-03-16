package thread;

public class User extends Thread {
	private Calculator cal;
	
	public User(Calculator cal) {
		super();
		this.cal = cal;
		setName("User1"); //부모거 소환
	}
	
	
	@Override
	public void run() {
		cal.setMemory(100);
	}


}
