package util;

/* 날짜와 시간
 * 1. java.util.Calendar 클래스
 * 2. java.util.date 클래스
 * 3. java.time.LocalDate, LocalTime, LocaDateTime 클래스 ==> 8버전에서 추가 
 */

import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		// Calendar c = new Calendar(); 추상 클래스이기 때문에 new 못함
		// 추상 클래스, interface는 new를 못하기 때문에 자식 클래스 만들어서 사용
		
		//현재 시스템의 날짜와 시간 정보 리턴
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.println(today.toString());
		
		// get(int field)
		System.out.println("년도 : "+today.get(Calendar.YEAR));
		System.out.println("월(0~11,0=1월) : "+today.get(Calendar.MONTH));
		System.out.println("올 해의 몇 째주 : "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이번달의 몇 째주 : "+today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이번달의 몇 일 : "+today.get(Calendar.DATE));
		System.out.println("이번달의 몇 일 : "+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("올해의 몇 일 : "+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1~7, 1=일요일) : "+today.get(Calendar.DAY_OF_WEEK));
		System.out.println("오전_오후(0=오전_1=오후) : "+today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : "+today.get(Calendar.HOUR));
		System.out.println("시간(0~23) : "+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59) : "+today.get(Calendar.MINUTE));
		System.out.println("초(0~59) : "+today.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999) : "+today.get(Calendar.MILLISECOND));

	}

}
