package poly;

public class EmployeeEx2 {

	public static void main(String[] args) {
//		Employee employee = new Employee();
//		employee.setName("홍길동");
//		employee.setPosition("사원");
//		workprint(employee);
		
		
		//메소드가 오버라이딩 되었다면 오버라이딩 된 메소드가 실행
		Ceo employee2 = new Ceo();
		employee2.setName("김동호");
		employee2.setPosition("CEO");
		workprint(employee2);
		
		Adminstrator employee3 = new Adminstrator();
		employee3.setName("정우성");
		employee3.setPosition("Admin");
		workprint(employee3);
		
		PartTime employee4 = new PartTime();
		employee4.setName("성춘향");
		employee4.setPosition("파트타임");
		workprint(employee4);
		
	

	}
	//Employee employee = new employee2
	//Employee employee = new employee3
	static void workprint(Employee employee) {
		employee.work();
	}

}
