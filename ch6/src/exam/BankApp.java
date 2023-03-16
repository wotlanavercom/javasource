package exam;

import java.util.Scanner;
//private : 외부 클래스에서 호출 불가==> 내부에서만 사용하겠음
public class BankApp {
	//인스턴스 변수 초기화
	private static Account[] accountArray = new Account[10];//Account 객체 배열 10개 선언,생성
	private static Scanner scanner = new Scanner(System.in);//사용자 입력
	
	public static void main(String[] args) {
		boolean run=true;
		while (run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5.종료 ");
			System.out.println("-------------------------------------------------------");			
			System.out.println("선택 >>");
			
			//sc.nextInt(); String 타입으로 입력값을 처리
			//scanner.nextInt(); int 타입으로 입력값을 처리
			int selectNo = Integer.parseInt(scanner.nextLine());//1 엔터
			
			switch (selectNo) {
				case 1:					
					createAccount();
					break;
				case 2:
					accountList();			
				break;
				case 3:
					despoit();
					break;
				case 4:
					withdraw();
					break;
				case 5:
					//while문 종료
					run = false;
					break;
			default:
				break;
			}

		}//while문 종료
	}//main 종료
	private static void createAccount() {
		//계좌생성
		//account 인스턴스를 생성하기 값을 입력받기
		System.out.println("계좌번호 >> ");
		String ano = scanner.nextLine();
		
		System.out.println("예금주 >> ");
		String owner = scanner.nextLine();
		
		System.out.println("잔액 >> ");
		int balance = Integer.parseInt(scanner.nextLine());
		// for문을 돌려 i에 해당하는 배열 초기값이 null 이면 수행
		//한번만 수행되고 빠져 나오도록 해야 함
		for (int j = 0; j < accountArray.length; j++) {
			if(accountArray[j]==null) {
				accountArray[j] = new Account(ano, owner, balance);
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
		
	}
	
	private static void accountList() {
		//accountArray 에 있는 내용 ==> 생성된 계좌 정보 출력
		//null이 아닌 경우만 출력
		
		System.out.println();
		System.out.println("계좌목록");
		System.out.println("-----------------------");
		for (int j = 0; j < accountArray.length; j++) {						
			if (accountArray[j] != null) {
				System.out.printf("%s\t%s\t%d\n",
						accountArray[j].getAno(),
						accountArray[j].getOwner(),
						accountArray[j].getBalance());
			}
			
		}
	}
	private static void despoit() {
		//예금하다 - 계좌번호, 예금액 입력받기
		System.out.println("계좌번호 >> ");
		String ano = scanner.nextLine();
		System.out.println("예금액 입력 >>");
		int amount = Integer.parseInt(scanner.nextLine());
		//accountArray에서 일치하는 계좌(null이 아닌 계좌만)를 찾아 잔액 = 잔액 + 예금액
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if(accountArray[i].getAno().equals(ano)) {
					//accountArray[i].balance =accountArray[i].getBalance()+amount;
					accountArray[i].setBalance(accountArray[i].getBalance()+amount);
					System.out.printf("잔액 = %d",accountArray[i].getBalance());
					System.out.println();
				}
				
			}
		}
		
	
			}
	private static void withdraw() {
		//출금하다 - 계좌번호, 예금액 입력받기
				System.out.println("계좌번호 >> ");
				String ano = scanner.nextLine();
				System.out.println("출금액 입력 >>");
				int amount = Integer.parseInt(scanner.nextLine());
				//accountArray에서 일치하는 계좌(null이 아닌 계좌만)를 찾아 잔액 = 잔액 - 예금액
				for (int i = 0; i < accountArray.length; i++) {
					if (accountArray[i] != null) {
						if(accountArray[i].getAno().equals(ano)) {
							//accountArray[i].balance =accountArray[i].getBalance()-amount;
							accountArray[i].setBalance(accountArray[i].getBalance()-amount);
						}
						
					}
				}
	
		}
	
}