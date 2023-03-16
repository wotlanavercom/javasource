package shop;

import java.util.Iterator;
import java.util.Scanner;

public class MyShop2 implements IShop{
	
	//쇼핑몰 이름
	private String title;
	//User 정보 저장 배열
	User[] users = new User[2];  
	//Product 정보를 저장 배열
	Product products[] = new Product[4];
	//구매한 제품을 저장 배열(cart)
	Product carts[] = new Product[10];
	
	//선택된 user 저장
	private int selUser;
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void setTitle(String title) {
		this.title = title;		
	}

	@Override
	public void genUser() {
		//User 2명 생성 후 배열에 저장
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("성춘향", PayType.CASH);
		
	}

	@Override
	public void genProduct() {		
		//Product 4개 생성 후 배열에 저장(CellPhone 2개,SmarTv 2개) 생성후
		products[0] = new CellPhone("아이폰",10000,"skt");
		products[1] = new CellPhone("폴드",20000,"kt");
		products[2] = new SmarTv("삼성",30000,"p-1204");
		products[3] = new SmarTv("엘지",40000,"p-2204");
	}

	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정선택");
		System.out.println("===============================");
		
		for (int i = 0; i < users.length; i++) {
			System.out.printf("[%d]%s(%s)\n",i,users[i].getName(),users[i].getPayType());
		}
		System.out.println("[X] 종   료");
		System.out.print("선택 : ");
		String sel = sc.nextLine();
		System.out.println("## "+sel+" 선택##");
		
		//0,1 => ProductList() 호출
		//다른걸 입력시 => 메뉴를 확인해 주세요
		switch (sel) {
		case "x": case "X":
			System.exit(0);//프로그램 종료
			break;
		case "0": case "1":
			selUser = Integer.parseInt(sel);
			ProductList();
		default:
			System.out.println("메뉴를 확인해 주세요\n");
			start();
			break;
		}
		
	}
	public void ProductList() {
		System.out.println();
		System.out.println(title + "상품 목록 - 상품 선택");
		System.out.println("============================");
		for (int i = 0; i < products.length; i++) {
			System.out.printf("[%d]",i);
			products[i].printDetail();
			products[i].printExtra();
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.println("선택 : ");
		String sel = sc.nextLine();
		// 상품선택시 0~3 => cart 제품 추가, productList() 호출
		// h =>start 메소드 호출, c => checkOut() 호출
				
		
		switch (sel) {
		case "0":case "1":case "2":case "3":
			for (int i = 0; i < carts.length; i++) {
				if(carts[i] == null) {
					//Integer.parseInt("0") ==> 0
					carts[i] = products[Integer.parseInt(sel)];
					break;				
				}
			}
			ProductList();
			break;
		case "h":case "H":
			start();
			break;
		case "c":case "C":
			checkOut();
			break;
		default:
			System.out.println("입력값을 확인해 주세요");
			ProductList();
			break;
		}						
	}
	
	public void checkOut() {
		System.out.println(title+" : 체크아웃");
		System.out.println("===============================");
		int sum = 0;
		for (int i = 0; i < carts.length; i++) {
			if (carts[i] != null) {
				System.out.printf("[%d] %s(%d)\n",i,carts[i].getName(),carts[i].getPrice());
				sum += carts[i].getPrice();				
			}
		}
		System.out.println("===============================");		
		System.out.println("결제방법 : "+users[selUser].getPayType());
		System.out.println("결제금액 : "+sum);
		System.out.println("[p]이전, [q] 결제완료");
		System.out.println("선택 : ");
		String sel = sc.nextLine();
		
		//p 일 때 productList() 호출
		//q 일 때 결제가 완료되었습니다. 프로그램 종료
		//잘못입력 시 checkOut 호출
		switch (sel) {
		case "p":case "P":
			ProductList();
			break;
		case "q":case "Q":
			System.out.println("결제가 완료되었습니다.");
			System.exit(0);
			break;
		default:
			checkOut();
			break;
		}
		
	}

}
