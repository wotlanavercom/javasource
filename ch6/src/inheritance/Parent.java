package inheritance;
/* 상속
 * 기존의 클래스를 재사용하여 새로운 클래스를 작성
 * 상속 장점
 * 1) 적은 양의 코드로 새로운 클래스를 작성할 수 있음
 * 2) 코드를 공통적으로 관리하기 때문에 추가 및 변경이 용이함
 * 
 * extends : 상속 표현
 * 
 * 상속대상
 * 1) 자손 클래스는 조상 클래스의 모든 멤버를 상속받음(단, 생성자와 초기화블럭은 상속 안됨)
 * 2) 자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많음
 * 
 * 단일상속 허용
 */

public class Parent {
	int age;

}

class Child extends Parent{
	void play() {
		System.out.println("play!!!");
	}
}
