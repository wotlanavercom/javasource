package inter;

public class Mysql implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Mysql DB select");

	}

	@Override
	public void inssert() {
		System.out.println("Mysql DB insert");

	}

	@Override
	public void update() {
		System.out.println("Mysql DB update");

	}

	@Override
	public void delete() {
		System.out.println("Mysql DB delete");

	}

}
