package abstr;
//추상클래스를 상속받는 자손 클래스는 무조건
//추상 메소드를 반드시 구현해야 함
public class ManuCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 주행 중입니다.");
		System.out.println("사람이 핸들을 조작합니다.");

	}

	@Override
	public void stop() {
		System.out.println("브레이크를 밟아서 멈춥니다.");

	}

}
