package poly;

public class Ceo extends Employee {
	@Override
	public void work() {
		System.out.println(super.getName()+" "+super.getPosition()+"주어진 시간동안 일을 합니다.");
	}

}
