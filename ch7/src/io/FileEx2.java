package io;

import java.io.File;

public class FileEx2 {

	public static void main(String[] args) {
		if(args.length !=1) {
			System.out.println("사용법 : java FileEx2 디렉토리명");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		
		if (!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		// listFiles() : 지정된 폴더가 가지고 있는 폴더나 파일 목록 가져오기
		File[] files = f.listFiles();
		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "["+fileName+"]":fileName);
		}

	}

}
