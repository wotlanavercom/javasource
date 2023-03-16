package ch5;

import java.util.Iterator;

public class ArrayEx3 {

	public static void main(String[] args) {
		// [] : 1차원 배열
		// [][] : 2차원 배열(행,열)
		//[]위치는 타입 다음에와도 되고 배열명 다음에 와도됨 ==>int[] score
		int score[]= {100,88,100,100,90}; 
		
		
//		int sum1=0;
//		float avg=0f;
//		for (int i = 0; i < score.length; i++) {
//			sum1+=score[i];
//			
//		}
//		avg =sum1 / (float)score.length;
//		System.out.println("총합 : "+sum1);
//		System.out.println("평균 : "+avg);
		
//		
//		int sum1=0;
//		float avg=0f;
//		
//		for (int i = 0; i < score.length; i++) {
//			sum1+=score[i];
//		}
//		avg=sum1/(float)score.length;
//		System.out.println("총합 : "+sum1);
//		System.out.println("평균 : "+avg);
		
		
		
		//배열 총합과 평균
		int sum=0;
		float average=0f;
		
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];		
		}
		average =sum / (float)score.length;
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+average);

	}

}
