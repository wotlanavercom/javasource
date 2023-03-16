package inheritance; //패키지명은 소문자

//클래스 관계
//상속관계(is-a) : Circle is a point 원은 점이다
//             ex)한가지만 가지고 있는다(Car)
//포함관계(has-a) : Circle has a point 원은 점은 가지고 있다
//             ex)여러가지 포함(Car,도어,엔진)


//Car
//엔진 클래스
//도어(문) 클래스


//포함관계 : 한클래스의 멤버 변수로 다른 클래스 타입의 참조변수를 선언
public class Circle {
//	int x;  //x좌표
//	int y;  //y좌표
	point p =new point();  // 포함관계
	
	int r;  //반지름

}


//패키지 : 클래스(인터페이스) 묶음 ==> 폴더
//클래스 이름
//패키지명.클래스
//ch6.Account
//exam.Account
//inheritance.Account