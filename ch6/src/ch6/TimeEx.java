package ch6;

public class TimeEx {

	public static void main(String[] args) {
		Time time = new Time();
		
		System.out.println("현재상태");
		System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
		
		
		time.setHour(16);
		time.setMinute(37);
		time.setSecond(22);
		
		System.out.println("바꾼 후 상태");
		System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());

	}

}
