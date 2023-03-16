package io;

import java.io.File;
import java.io.IOException;

public class FileEx4 {

	public static void main(String[] args) throws IOException {
		
		File temp = new File("c:\\temp");
		File dir = new File("c:\\temp\\dir");
		File file1 = new File(temp,"file1.txt");
		File file2 = new File(dir,"file2.txt");
		File file3 = new File("c:\\temp\\file3.txt");
		
		//mkdir(한개만 만들때), mkdirs(여러개 한꺼번에 만들때) : 디렉토리 생성
//		if(!temp.exists()) {
//			temp.mkdir();
//		}
		
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
		//createNewFile() : 파일 생성
		if(!file1.exists()) file1.createNewFile();
		if(!file2.exists()) file2.createNewFile();
		if(!file3.exists()) file3.createNewFile();

	}

}
