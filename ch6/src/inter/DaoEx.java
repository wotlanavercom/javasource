package inter;

public class DaoEx {

	public static void main(String[] args) {
		//OracleDao oracleDao = new OracleDao();
		DataAccessObject oracle =new OracleDao();
		dbWork(oracle);
		
		//Mysql mysql = new Mysql();
		DataAccessObject mysql = new Mysql();
		dbWork(mysql);
		//dbwork2(oracle);
		

	}
	
	static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.inssert();
		dao.update();
		dao.delete();
	}
//	static void dbWok2(OracleDao oracle) {
//		oracle.select();
//		oracle.inssert();
//		oracle.update();
//		oracle.delete();
//	}
	

}
