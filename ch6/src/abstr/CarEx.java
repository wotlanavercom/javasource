package abstr;

public class CarEx {

	public static void main(String[] args) {
		//다형성
		//car로 접근할 수 있는 범위
		//부모가 가지고 있는 멤버들만 가능
		//단, 오버라이딩 된 메소드가 있다면 자식의 메소드가 실행
		Car car = new AiCar();
		car.run();
		
		System.out.println("=====================");
		car = new ManuCar();
		car.run();

	}

}
