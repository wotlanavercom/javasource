package ch6;

public class CardEx {

	public static void main(String[] args) {
		
		//공통 속성 지정
		Card.width = 50;
		Card.height = 80;
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.height = "+Card.height);
		
		
		Card card1 = new Card();
		card1.kind = "Heart";
		card1.numbur = 7;
	
		
		Card card2 = new Card();
		card2.kind = "Spade";
		card2.numbur = 4;
		
		System.out.printf("card1 %s, number=%d, 크기는 (%d, %d)\n",card1.kind,card1.numbur,Card.width,Card.height);
		System.out.printf("card2 %s, number=%d, 크기는 (%d, %d)\n",card2.kind,card2.numbur,Card.width,Card.height);
		
		//전체 카드의 크기 변경
		System.out.println();
		Card.width = 60;
		Card.height = 90;
		System.out.printf("card1 %s, number=%d, 크기는 (%d, %d)\n",card1.kind,card1.numbur,Card.width,Card.height);
		System.out.printf("card2 %s, number=%d, 크기는 (%d, %d)\n",card2.kind,card2.numbur,Card.width,Card.height);

	}

}
