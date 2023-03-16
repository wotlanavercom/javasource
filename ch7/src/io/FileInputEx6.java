package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

public class FileInputEx6 {

	public static void main(String[] args) {
		//copy ( C:\\temp\\file1.tet => C:\\temp\\file2.tet)	

			
		try(FileInputStream fis =  new FileInputStream("C:\\temp\\iu.mp4");) {
			FileOutputStream fos = new FileOutputStream("C:\\temp\\iucopy.mp4");
			int data = 0;
			
			long start = System.currentTimeMillis(); //시작시간
			
			while((data=fis.read())!=-1) {
				
			}
			
			long end = System.currentTimeMillis(); //종료시간
			System.out.println("InputStream / OutputStream 걸린 시간 "+(end-start)+"ms"); 
			
			//FileNotFoundException 은 IOException 이 처리 가능
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		//BufferedInputStream bis = new FileInputStream("C:\\temp\\iu.mp4");
		//BufferedOutputStream bos = new FileOutputStream("C:\\temp\\iucopy.mp4");
		//밑에 4줄을 위에 2줄로 요약 할수 있음
		try(FileInputStream fis = new FileInputStream("C:\\temp\\iu.mp4"); 
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("C:\\temp\\iucopy.mp4");
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			int data = 0;
			
			byte b[] = new byte[8192];
			
			long start = System.currentTimeMillis(); //시작시간
			
			while((data=fis.read(b))!=-1) {
				bos.write(b);
			}
			
			long end = System.currentTimeMillis(); //종료시간
			System.out.println("InputStream+Buffered+byte / OutputStream+Buffered+byte 걸린 시간 "+(end-start)+"ms"); 
			
			//FileNotFoundException 은 IOException 이 처리 가능
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		
		
		

	}

}
