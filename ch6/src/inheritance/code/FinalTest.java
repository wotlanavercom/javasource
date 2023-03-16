package inheritance.code;

//final이 클레스에 붙으면 '상속금지'
public final class FinalTest {
	
	final int MAX_SIZE=10;  //상수
	
	//static과 final은 위치 바껴도 상관없음(final static)
	static final int MIN_SIZ=0;  //공유(공통)상수
	
	//final이 메서드에 붙으면 '오버라이딩 금지'
	final void getMaxSize() {
		final int LV = MAX_SIZE; //상수
		
		
	}

}
