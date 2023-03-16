package ch5;

import java.util.Iterator;

public class ArrayEx9 {

	public static void main(String[] args) {
		int score[][]= {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50},
		};
		
		//과목별 총점
		int korTotal=0, engTotal=0, mathTotal=0;
		
		System.out.println("번호    국어   영어   수학   총점    평균");
		System.out.println("=====================================");
		
		
		for (int i = 0; i < score.length; i++) {
			int sum=0; //개인별 총점
			
			
			//번호
			System.out.printf("%3d",i+1);
			
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j]; //총점
				//점수
				System.out.printf("%6d",score[i][j]);
			}
			
			//국어점수 총점
//		score[0][0]+score[1][0]+score[2][0]+score3][0]+score[4][0];
			korTotal += score[i][0];
			
			//영어점수 총점
			engTotal += score[i][1];
			
			//수학점수 총점
			mathTotal += score[i][2];		
			
			
			//평균 = sum/3.0
			float avg = sum / (float)score[i].length;
			
			System.out.printf("%6d %6.1f\n",sum,avg);
		}
		
		System.out.println("=====================================");
		System.out.printf("총점:%6d %5d %5d\n",korTotal,engTotal,mathTotal);
	
	}

}
