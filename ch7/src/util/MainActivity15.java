package util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity15 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n");
		System.out.println("[Program Start]");
		System.out.println("\n");

		
		/* [요약 설명]
		 * 1. Timestamp 값은 현재 시간을 milliseconds 단위로 변환하여 보여줍니다
		 * 2. 인풋 타임 스탬프 형식 : 1646295046677
		 * */

		
		// [현재 날짜 및 시간 데이터 얻어오기]
		Long nowDate = System.currentTimeMillis();
		
		
		// [SQL 타임 스탬프 사용해 현재 및 날짜 데이터 변환 실시]
		Timestamp timeStamp = new Timestamp(nowDate);
		
		
		// [결과 출력 실시]
		String strStamp = String.valueOf(timeStamp.getTime());
		System.out.println("\n");
		System.out.println("[timeStamp] : " + strStamp);
		System.out.println("[length] : " + strStamp.length());
		System.out.println("\n");
		
		
		// [타임 스탬프 값을 다시 날짜 및 시간 데이터로 변환 실시]
		Date date = new Date(Long.parseLong(strStamp)); // [타임 스탬프 값 문자열 형 변환]
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd kk:mm:ss"); // [Date 형식으로 변경 : 24 시간 포맷 형태]
		System.out.println("\n");
		System.out.println("[date] : " + String.valueOf(sdf.format(date)));
		System.out.println("\n");
        
        
	} // [메인 종료]
    
} // [클래스 종료]