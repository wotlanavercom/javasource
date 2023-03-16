package inter;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracle DB select");

	}

	@Override
	public void inssert() {
		System.out.println("Oracle DB insert");

	}

	@Override
	public void update() {
		System.out.println("Oracle DB update");

	}

	@Override
	public void delete() {
		System.out.println("Oracle DB delete");

	}

}
