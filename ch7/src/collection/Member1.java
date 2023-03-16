package collection;

public class Member1 {
	private String name;

	public Member1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;//출력 결과 =>"[name=" + name + "]" ==>name
	}
	

}
