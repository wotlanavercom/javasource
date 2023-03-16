package ch4;

public class WhileEx4 {

	public static void main(String[] args) {
		//wille, Math.random() 사용
		//두개의 주사위를 던져 나오는 값을 (값1,값2) 형태로 출력하고
		//값의 합이 5가 아니면 계속 주사위를 던지고, 5인 경우 실행 종료
		
		while (true) {
			int dice1=(int)(Math.random()*6)+1;
			int dice2=(int)(Math.random()*6)+1;
			System.out.printf("(%d, %d)\n",dice1,dice2);
		
			if (dice1+dice2==5) break;										
		}
		
//		for, if 수행할문장이 하나라면 블럭을 생략할 수 있음 
		
//		if(true)
//			System.out.println("true");
		
//		if (조건) {
//			//수행할문장
//		}
//	
//		if(true)
//			System.out.println("true");
	
		
	}


}
