package ch7;

public class MyExceptionEx {
	public static void main(String[] args) {
		try {
			test();
		} catch (MyException e) {			
			e.printStackTrace();
		}

	}
	
	public static void test() throws MyException {
		//강제 예외 발생
		throw new MyException("사용자 정의 예외 발생");
	}

}
