package ch5;

import java.util.Scanner;

public class ArrayEx10 {

	public static void main(String[] args) {
		//사용자한테 답변을 받을 수 있도록 코드 작성
		//답과 비교할 때 equals 써서 true 인 경우 정답입니다.
		//                      false 인 경우 틀렸습니다. 정답은 ~~~ 입니다.
		Scanner sc = new Scanner(System.in);
		
		String words[][]= {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q.%d %s 의 뜻은?\n",i+1,words[i][0]);  //d(숫자), s(문자)
			
			System.out.println("답변 : ");
			
			String answer = sc.nextLine();
			
			
			//정답과 답변 비교
			if(answer.equals(words[i][1])) {
				System.out.println("정답입니다.");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s 입니다.\n",words[i][1]);
			}
			
		}
	
	}

}
