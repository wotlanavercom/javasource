package ch7;

public class ExceptionEx7 {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException | MemoryException e) {			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			deleteTempFiles();
		}

	}
	static void startInstall() throws SpaceException, MemoryException {//날리기
		if (!enoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		
		if (!enougMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
	}
	static boolean enoughSpace() {
		return false;		
	}
	static boolean enougMemory() {
		return true;
	}
	static void copyFiles() {}
	static void deleteTempFiles() {}

}
