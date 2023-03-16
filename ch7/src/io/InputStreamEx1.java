package io;

import java.io.IOException;
import java.io.InputStream;

/*
 * I/O(Input/Output)
 * Input : 키보드
 * Output : 화면
 * 
 * 스트림(Stream) :한쪽에서 다른 쪽으로 데이터를 전달하기 위해, 두 대상을 연결하고 데이터를
 * 				 전송할 수 있는 것
 *  1) 바이트 기반 스트림 : 바이트 단위로 데이터를 전송
 *  				   FileInputStream, FileOutputStream...
 *  2) 문자 기반 스트림 :  문자 단위로 데이터 전송
 *  				   FileReader, FileWriter.....
 */

public class InputStreamEx1 {

	public static void main(String[] args) {
		//input : 키보드
//		InputStream in = System.in;
//		
//		//입력이 들어오면 읽어오기
//		try {
//			//read() : 한 바이트만(1byte) 읽어옴(읽어올 바이트가 없으면 -1리턴)
//			//         한글은(2~3byte) 깨짐
//			int input = 0;
//			while((input = in.read())!=-1){				
//				System.out.println((char)input);
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				in.close();//Input닫기
//			} catch (IOException e) {				
//				e.printStackTrace();
//			}
//		}
		
		
		//try-with-resource : Closable을 구현한 클래스여야 함
		//()안에 생성된 객체는 알아서 닫아주게 됨
		try(InputStream in = System.in) {
			int input = 0;
			while((input = in.read())!=-1){				
				System.out.println((char)input);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
