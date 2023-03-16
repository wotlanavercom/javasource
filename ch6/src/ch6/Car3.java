package ch6;

public class Car3 {
	//속성(property):멤버변수
	//제조사,모델, 색상,최대속도....
	String company;
	String model;
	String color;
	int maxSpeed;
		
	//생성자 오버로딩
	
	public Car3() {//기본(default) 생성자
		super();		
	}
			
	
	public Car3(String company, String model, String color) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
	}


	//매개변수가 있는 생성자
	//오른쪽 클릭-> [source]-> Generate Constructor using fields...  밑에 하는법
	public Car3(String company, String model, String color, int maxSpeed) {
//		super();
//		this.company = company;
//		this.model = model;
//		this.color = color;
		this(company,model,color);
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public String toString() {
		return "Car3 [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}


	//기능(function):메소드
	//전진한다,후진한다
	void forward() {
		System.out.println("전진한다.");
	}
	void backward() {
		System.out.println("후진한다.");
	}

}

//클래스 구성요소
//1.멤버변수 - 속성
//2.메소드 - 기능
//3.생성자 - 인스턴스 초기화 담당
//  1)매개변수가 없는 생성자(기본생성자)
//  2)매개변수가 있는 생성자
