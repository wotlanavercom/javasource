package exam;

public class IpTv extends ColorTv {
	
	private String ipAddr;
	
	public IpTv(int size, int color, String ipAddr) {		
		super(size,color);
		this.ipAddr = ipAddr;
		
	}
	@Override
	void printProperty() {
		//나의 IpTv는 32인치,2048컬러,주소는 192.1.1.2 입니다
		System.out.println("나의 IpTv는 "+super.getSize()+"인치, "+
								getColor()+"컬러,주소는 "+ipAddr+"입니다");
	}

}
