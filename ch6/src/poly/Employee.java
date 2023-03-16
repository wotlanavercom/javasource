package poly;

public class Employee {
	private String name;
	private String position;
	
	public void work() {
		System.out.println(name+" "+position+" 이(가) 말한다");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
