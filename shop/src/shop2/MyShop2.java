package shop2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class MyShop2 implements IShop{
	
	//쇼핑몰 이름
	private String title;
		
	//선택된 user 저장
	private int selUser;
	
	//UserDAO 객체 생성
	UserDAO userDAO = new UserDAO();
	ProductDAO productDAO = new ProductDAO();
	OrderDAO orderDAO = new OrderDAO();
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void setTitle(String title) {
		this.title = title;		
	}

	@Override
	public void genUser() {
		
		// user 정보 입력받아서 suser 테이블에 저장
		System.out.println("***** User 입력 *****");
		//userId, name, payNo 를 입력받기
		System.out.println("userId 입력 >> ");
		int userId = Integer.parseInt(sc.nextLine());
		System.out.println("name 입력 >> ");
		String name = sc.nextLine();
		System.out.println("payNo 입력 >> ");
		int payNo = Integer.parseInt(sc.nextLine());
		
		
		System.out.println(userDAO.insert(userId, name, payNo)?"user 추가 성공":"user 추가 실패");
		

	}
	
	public void userList() {
		System.out.println("***** User 목록 *****");
		System.out.println("userId\tname\tpayNo");
		System.out.println("-----------------------------------");
		List<UserDTO> list = userDAO.getList();
		
		for (UserDTO userDTO : list) {
			System.out.print(userDTO.getUserId()+"\t");
			System.out.print(userDTO.getName()+"\t");
			System.out.print(userDTO.getPayNo()+"\n");
		}	
		

		
	}		

	@Override
	public void genProduct() {	
		//상품 정보 입력받아서 테이블 저장
		System.out.println("***** 상품 입력*****");
		System.out.println("productId >> ");
		int productId = Integer.parseInt(sc.nextLine());
		System.out.println("pname >> ");
		String pname = sc.nextLine();
		System.out.println("price >> ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.println("content >> ");
		String content = sc.nextLine();
		
		ProductDTO dto = new ProductDTO(productId,pname,price,content);
		//상품정보 입력받기 => productDTO에 담기
		System.out.println(productDAO.insert(dto)?"상품추가 성공":"상품추가 실패");
				
	}

	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정선택");
		System.out.println("===============================");
		
		//전체 user 정보 출력
		List<UserDTO> list = userDAO.getList();
		
		for (UserDTO userDTO : list) {
			System.out.print(userDTO.getUserId()+"\t");
			System.out.print(userDTO.getName()+"\t");
//			System.out.print(userDTO.getPayNo()+"\t");
			System.out.print(userDTO.getType()+"\n");
		}	
		
		
		System.out.println("[X] 종   료");
		System.out.print("선택 : ");
		String sel = sc.nextLine();
		System.out.println("## "+sel+" 선택##");
		System.out.println();
		
		//0,1 => ProductList() 호출
		//다른걸 입력시 => 메뉴를 확인해 주세요
		switch (sel) {
		case "x": case "X":
			System.exit(0);//프로그램 종료
			break;
		case "1000": case "1001": case "9999":
			selUser = Integer.parseInt(sel);
			ProductList();
			break;
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
		//product 데이터베이스 상품 출력
		//product_id, pname, price, content
		List<ProductDTO> list = productDAO.getList();
		
		for (ProductDTO productDTO : list) {
			System.out.print(productDTO.getProductId()+"\t");
			System.out.print(productDTO.getPname()+"\t");
			System.out.print(productDTO.getPrice()+"\t");
			System.out.print(productDTO.getContent()+"\n");
			
		}
		
		
		
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.println("선택 : ");
		// 상품선택시 0~3 => cart 제품 추가, productList() 호출
		// h =>start 메소드 호출, c => checkOut() 호출
		
		String sel = sc.nextLine();
		
		
		switch (sel) {
		case "1":case "2":case "3":case "4":   
			
			orderDAO.insert(selUser, Integer.parseInt(sel));						
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
		
		int total = 0;
		List<OrderDTO> list = orderDAO.carts(selUser);		
		
		System.out.println("아이디    이름    결제방법    제품번호    제품명    가격     상세내용    주문일자");
		for (OrderDTO orderDTO : list) {
			//아이디, 이름 => OrderDTO 안 UserDTO
			System.out.print(orderDTO.getUserDTO().getUserId()+"\t");
			System.out.print(orderDTO.getUserDTO().getName()+"\t");
			System.out.print(orderDTO.getUserDTO().getType()+"\t");
			//제품 => OrderDTO 안 ProductDTO
			System.out.print(orderDTO.getProductDTO().getProductId()+"\t");
			System.out.print(orderDTO.getProductDTO().getPname()+"\t");
			System.out.print(orderDTO.getProductDTO().getPrice()+"\t");
			System.out.print(orderDTO.getProductDTO().getContent()+"\t");
			//주문일자 =>OrderDTO
			System.out.print(orderDTO.getOrderDate()+"\n");
			
			total += orderDTO.getProductDTO().getPrice();
		}
		
		
		
		System.out.println("===============================");		
//		System.out.println("결제방법 : "+users[selUser].getPayType());
		System.out.println("결제금액 : "+total);
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
