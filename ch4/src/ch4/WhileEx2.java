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
		
		int add=0;
		for (int j2 = 1; j2 < 10; j2++) {
			add = 6*j2;
			System.out.printf("6 * %d = %d\n",j2,(6*j2));
		}

	}

}
