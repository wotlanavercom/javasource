package inheritance;

public class BonusPointAccountEx {

	public static void main(String[] args) {
		BonusPointAccount bonusPointAccount = new BonusPointAccount("110-22", "홍길동", 0, 0);
		
		//예금액
		int amount = 100000;
		bonusPointAccount.deposit(amount);
		// 예금액 : 10000
		System.out.println("예금액 : "+amount);
		// 현재보너스 포인드 : 10점
		System.out.println("현재 보너스 포인트 : "+bonusPointAccount.getBalance());

	}

}
