package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class FileOutputEx1 {

	public static void main(String[] args) {
		// 키보드에서 입력을 받아들여 파일에 쓰기
		// 조건 : 키보드에서 q 가 입력되기 전까지 계속 받아들이도록 한다.
		//		 Scanner, FileWriter/BuffereWriter 사용
			
	
		String content = null; //사용자가 입력 내용 저장 변수
		
		try(Scanner sc = new Scanner(System.in);
			FileWriter fw = new FileWriter("c:\\temp\\output3.txt");
			BufferedWriter bw = new BufferedWriter(fw)) {
			
			System.out.println("파일에 저장할 데이터를 입력해 주세요");
			System.out.println("입력을 중단하려면 q 를 입력해 주세요");
			
			do {
				
				System.out.println(">>  ");
				content = sc.nextLine(); //사용자 입력을 저장
				
				if(!content.equals("q")) {
					bw.write(content);
					bw.newLine();					
				}
				
			} while (!content.equals("q"));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
