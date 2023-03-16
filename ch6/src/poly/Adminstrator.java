package poly;

public class Adminstrator extends Employee {
	@Override
	public void work() {
		System.out.println(super.getName()+" "+super.getPosition()+"이(가) 업무를 봅니다.");
	}

}
