package ch5;

import java.util.Arrays;

/* 기본타입-byte,,char,short,int,long,float,double,boolean
 * 참조타입-String(클래스),배열,       
 * 
 */



import java.util.Iterator;

public class ArrayEx2 {

	public static void main(String[] args) {
		int score[]=new int[5];
		
		for (int i = 0; i < score.length; i++) {
			score[i] =i*10;
		}
		
		System.out.println(score);    //주소 값
		System.out.println(Arrays.toString(score));  //주소에가서 값을 알려줌(확인용)
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		System.out.println();
		//향상된 for문
		for(int i:score) {
			System.out.println(i);
		}
		
		
		int iArr2[] = new int[10];
		//1~10의 임의의 숫자를 생성해서 배열에 저장
	
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1;
		}
		//출력
		System.out.println(Arrays.toString(iArr2));
		
		
		char chArr[]= {'a','y','d','논','다'};
		System.out.println(chArr);
		
		String strArr[]= {"abc","efg"};
		System.out.println(strArr);

	}

}
