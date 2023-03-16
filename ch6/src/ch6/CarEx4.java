package ch6;

import java.util.Scanner;

public class CarEx4 {

	public static void main(String[] args) {
		//입력받은 값으로 Car3 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		
		
		
//		//입력
//		System.out.println("회사명 >> ");
//		String company = sc.nextLine();
//		System.out.println("모델명 >> ");
//		String model = sc.nextLine();
//		System.out.println("색상명 >> ");
//		String color = sc.nextLine();
//		System.out.println("최대속도 >> ");
//		int maxSpeed = Integer.parseInt(sc.nextLine());
//		
//		// 입력 값으로 인스턴스 생성
//		Car3 car = new Car3(company,model,color,maxSpeed);
//		
//		//확인용
//		System.out.println(car);
//		
		
		//입력값으로 Car3 인스턴스를 3개 생성
		//배열선언, 생성
		Car3 cars[] = new Car3[3];
		//초기화
		for (int i = 0; i < cars.length; i++) {
			System.out.println("회사명 >> ");
			String company = sc.nextLine();
			System.out.println("모델명 >> ");
			String model = sc.nextLine();
			System.out.println("색상명 >> ");
			String color = sc.nextLine();
			System.out.println("최대속도 >> ");
			int maxSpeed = Integer.parseInt(sc.nextLine());
			
			// 입력 값으로 인스턴스 생성
			cars[i] = new Car3(company,model,color,maxSpeed);
			
		}
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		for(Car3 car:cars) {
			System.out.println(car);
		}

	}

}
