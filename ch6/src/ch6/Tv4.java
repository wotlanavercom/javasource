/*
 * 객체지향언어 - 자바
 * 코드의 재사용성 높다
 * 코드 관리가 용이함
 * 신뢰성 높은 프로그래밍을 가능하게 함
 * 
 * 클래스 : 객체를 정의해 놓은 것
 * 클래스 용도 : 객체를 생성하는 데 사용
 * 
 * 객체 : 실제로 존재하는 것, 사물 or 개념
 */
package ch6;

//private : 외부 접근 불가
//final : 상수(대문자로 표현함)
//The blank final field VOLUME may not have been initialized
//선언하면서 초기화를 한다
public class Tv4 {
	
	private String color; //색상
	private int channel;  //채널
	private boolean power; //전원상태
	
	final int VOLUME = 10;
	
			
	public Tv4() {
		super();
		// TODO Auto-generated constructor stub    //car3
	}


	public Tv4(String color, int channel, boolean power) {
		super();
		this.color = color;
		this.channel = channel;
		this.power = power;
		//this.VOLUME = 15; //The final field Tv4.VOLUME cannot be assigned
	}


	void power() {
		power=!power;
	}
	

	int channelup() {
		channel++;
		return channel;
	}
	
	void channeldown() {
		channel--;
	}


	// getter/setter
	// getter : 변수의 값을 리턴하는 형태
	public String getColor() {  //get~~ 무조건 리턴
		return color;
	}

	// setter : 변수의 값을 변경하는 형태
	public void setColor(String color) {
		this.color = color;
	}


	public int getChannel() {
		return channel;
	}


	public void setChannel(int channel) {
		this.channel = channel;
	}


	public boolean isPower() { //boolean 타입은 get가 아닌 is
		return power;
	}


	public void setPower(boolean power) {
		this.power = power;
	}
	
	
	
	
	

}


