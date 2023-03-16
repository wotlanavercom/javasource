package inheritance.code;

public class StaticTest {
	static int width = 200;
	static int height = 120;
	
	static {
		// static 초기화 블럭
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}
	
	static int max(int a, int b) {
		return a > b ? a : b;
	}

}
