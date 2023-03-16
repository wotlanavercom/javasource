package ch6;

public class Time {
	// 속성 - 시, 분, 초
	
	
	private int hour;
	private int minute;
	private int second;
	
	
	//멤버변수가 private 키워드를 사용하게 되면 외부에서 접근 불가 
	//==>메소드를 통해서만 클래스 속성의 값을 얻거나 변경할 수 있도록 제공해야 함
	//==>getter/setter 이용
	
	// 메소드에서 return 을 만나면 수행할 구문이 있더라도 메소드는 종료
	public void setHour(int hour) {
		// 0~23 사이라면 시간 변경
		if(hour < 0 || hour >23)
			return;
		this.hour = hour;
	}
	
	public int getHour() {
		return hour;
	}	
	
	public void setMinute(int minute) {
		//0~59 사이로 값이 넘어 올때만 minute 값을 변경
		if(minute < 0 || minute > 59)
			return;
		//0~59 사이일때만 실행					
		this.minute = minute;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setSecond(int second) {
		if(second < 0 || second > 59)
			return;
		this.second = second;
		
	}
	
	public int getSecond() {
		return second;
	}

}
