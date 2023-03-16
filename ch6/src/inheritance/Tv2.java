package inheritance;
// 클래스 작성시 부모를 지정하지 않으면 최상위 부모는 Object 클래스가 존재함

//this() : 생성자에서 내가 가지고 있는 다른 생성자를 호출 시, -Student 참고
//this.변수명 : 매개변수와 이름이 같을 때 구별하기 위해

//super : 부모
//super() : 생성자에서 부모 생성자를 호출 시, 
//super.변수명 : 부모가 가지고 있는 인스턴스 변수를 사용할 때
public class Tv2 {
	boolean power;
	int channel;
	
	
	
//	public Tv2() {
//		super();//부모의 기본생성자 호출
//      }	
	
	
	public Tv2(boolean power, int channel) {
		super();
		this.power = power;
		this.channel = channel;
	}
	
	
	void power() {
		power = !power;		
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}

}
