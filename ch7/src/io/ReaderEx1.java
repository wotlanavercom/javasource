package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class ReaderEx1 {

	public static void main(String[] args) {
		//Reader, Writer : 문자기반
		
		Reader reader = null;
		Writer writer = null;
		try {
			//인코딩 : utf-8
			reader = new FileReader("c:\\temp\\file1.txt");
			
			//append : true => 기존파일에 덧붇이기
			writer = new FileWriter("c:\\temp\\output1.txt",true);
			
			//ms949 : 위도우즈용
			//reader = new FileReader("c:\\temp\\file1.txt",Charset.forName("ms949"));
			
			//파일출력
			int data = 0;
			while((data = reader.read())!=-1) {
				writer.write(data);
			}
			
			//화면출력
//			int data = 0;
//			while((data = reader.read())!=-1) {
//				System.out.print((char)data);
//			}
			
		} catch (Exception e) {			
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
