package lang;

public class Person {
	long id;

	public Person(long id) {
		super();
		this.id = id;
	}
	@Override 
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return this.id == ((Person)obj).id;
		}else {
			return false;
		}
		
	}
		
	@Override
	public String toString() {
		return "Person [id=" + id + "]";
	}

}
