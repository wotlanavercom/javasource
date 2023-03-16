package lang;

public class Card {
	String Kind;
	int number;
	
	public Card() {
		this("SPADE", 1);
	}

	public Card(String kind, int number) {
		super();
		this.Kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Card [Kind=" + Kind + ", number=" + number + "]";
	}
	
//	@Override
//	public String toString() {		
//		return "Kind : "+Kind+", number : "+number;
//	}
//	

}
