package ch6;

public class AccountEx2 {

	public static void main(String[] args) {
		Account account = new Account("110-10-10000", "홍길동", 1000);
		Account account1 = new Account("110-10-10003", "성춘향", 200000);
		
		//홍길동 계좌 입/출금 기능 사용 ==>메소드 호출
		System.out.println(account.owner);
		System.out.println("=========================");
		System.out.println("현재 잔액 : "+account.deposit(500000));
		System.out.println("현재 잔액 : "+account.withdraw(230000));
		
		
		System.out.println();
		//성춘향 계좌 입/출금
		System.out.println(account1.owner);
		System.out.println("==================");
		System.out.println("현재 잔액 : "+account1.deposit(300000));
		System.out.println("현재 잔액 : "+account1.withdraw(120000));

	}

}
