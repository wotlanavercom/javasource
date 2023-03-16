package ch6;

public class Square {
	//사각형 넓이 구하기
	
	//속성 -한변
	int rkfh;
	int tpfh;
	
	
	public Square(int rkfh, int tpfh) {
		super();
		this.rkfh = rkfh;
		this.tpfh = tpfh;
	}
	//넓이
	
	
	int getArea() {
		return rkfh * tpfh;
	}




}
