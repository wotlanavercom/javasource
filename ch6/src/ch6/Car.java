package ch6;

public class Car {
	//속성(property):멤버변수
	//제조사,모델, 색상,최대속도....
	String company;
	String model;
	String color;
	int maxSpeed;  //2개의 단어를 작성할땐 뒤에 단어에 대문자 사용  max/Speed
	
	
	
	//기능(function):메소드
	//전진한다,후진한다
	void forward() {
		System.out.println("전진한다.");
	}
	void backward() {
		System.out.println("후진한다.");
	}

}
