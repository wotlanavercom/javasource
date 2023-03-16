package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
 * 보조 스트림
 * 스트림 기능 보완
 * BufferedReader~~,Data~~,....
 * 
 * 텍스트 + 이미지 + 동영상
 * FileInputStream + BufferedInputStream : 버퍼를 이용한 입력 성능 향상
 * FileOutputStream + BufferedOutputStream : 버퍼를 이용한 출력 성능 향상
 * 
 * 텍스트
 * FileReader + BufferedReader : 버퍼를 이용한 입력 성능 향상
 * FileWriter + BufferedWriter : 버퍼를 이용한 출력 성능 향상
 */

public class FileInputEx4 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("c:\\temp\\output2.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
				
			for (int i = '1'; i <= '9'; i++) {
				bos.write(i);
			}	
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
