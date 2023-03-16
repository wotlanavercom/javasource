package poly;

//Tv 클래스를 상속받은 SmartTv
public class SmartTv extends Tv {
	boolean caption;
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}

}
