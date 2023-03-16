package thread;

public class UserMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		User user1 = new User(cal);
		User2 user2 = new User2(cal);
		
		user1.start();
		user2.start();

	}

}
