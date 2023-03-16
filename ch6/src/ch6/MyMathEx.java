package ch6;

public class MyMathEx {

	public static void main(String[] args) {
		
		//Math.random();
		
		
		//static 메소드 호출
		//클래스명.메소드명()
		System.out.println(MyMath.add(200L, 300L));
		System.out.println(MyMath.subtract(200L, 300L));
		System.out.println(MyMath.multiply(200L, 300L));
		System.out.println(MyMath.divide(200L, 300L));
		
		
		//인스턴스 메소드 호출
		MyMath math = new MyMath();
		math.a = 200L;
		math.b = 100L;
		System.out.println(math.add());
		System.out.println(math.subtract());
		System.out.println(math.multiply());
		System.out.println(math.divide());

	}

}
