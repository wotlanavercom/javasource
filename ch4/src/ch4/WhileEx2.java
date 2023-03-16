package ch4;

public class WhileEx2 {

	public static void main(String[] args) {
		//구구단 출력
		//6단
		int i=1;
		while (i<10) {
			System.out.printf("6 * %d = %d\n",i,(6*i));
			i++;
		}
		
		int sum=0,j=0;
		
		while (true) {
			if(sum > 100) break;
			++j;
			sum+=j;
		}
		System.out.println("j="+j);
		System.out.println("sum="+sum);

	}

}
