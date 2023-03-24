package database2;

//클래스간 데이터 전달을 위해 사용하는 객체
//~~~DTO(date Transfer Object) : 객체간 데이터 전달 
//								DB 결과를 다른 객체로 넘길때 주로 사용
//								사용자 입력 결과를 DAO 클래스로 넘길 때도 사용
//~~~VO(Value Object)
//~~~DAO : DataBase 작업을 담당하는 클래스임

//Mine + DAO + DTO 콘솔

//db 데이터 내용을 전송하는 용도로 주로 사용
//table 컬럼과 동일하게 작성
//getter/setter 메소드, 생성자, toString() 작성

public class DeptDTO {
	private int deptno;
	private String dname;
	private String loc;
	
	//생성자
	public DeptDTO() {
		super();
		
	}

	public DeptDTO(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	//toString
	@Override
	public String toString() {
		return "DeptDTO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

	//get/set
	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	

}
