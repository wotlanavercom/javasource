package inter;
/*
 *  인터페이스
 *  추상화 클래스
 *  추상 클래스보다 추상화 정도가 높음 => 일반메서드, 멤버변수 가질 수 없음
 *  기본 설계도
 *  
 *  모든 멤버변수는 public static final(생략 가능) 임 ==>상수
 *  모든 메서드는 public abstract 임(생략가능) ==>추상메서드
 *  단, static 메서드와 디폴트 메서드는 사용가능(jdk8버전부터 가능)
 */

public interface Account {
	int x=0,y=0; //모든 멤버변수는 public static final(생략 가능) 임
	//void stop() {} //Abstract methods do not specify a body
	//모든 메서드는 public abstract 임(생략가능)
	void stop();
	
	//단, static 메서드와 디폴트 메서드는 사용가능(jdk8버전부터 가능)
	static void print() {}
	default void add() {}
	
	

}
