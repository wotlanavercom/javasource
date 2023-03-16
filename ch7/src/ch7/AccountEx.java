package ch7;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account("110-11", "홍길동", 100000);
		
		account.withdraw(500000);

	}

}
