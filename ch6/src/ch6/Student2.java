package ch6;

public class Student2 {
	//학생이름 name ex)홍길동
	String name;
	//반 ban ex)1
	int ban;
	//번호 no ex)1
	int no;
	//국어점수 kor ex)78
	int kor;
	//영어점수 eng ex)65
	int eng;
	//수학점수 math ea)65
	int math;
	
	public Student2(String name, int ban, int no) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	
	public Student2(String name, int ban, int no, int kor, int eng, int math) {		
		this(name,ban,no);		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal(){
		return this.kor+this.eng+this.math;
		
		//점수 총계
	}
	double getAverage(){
		//평균
		return getTotal() / 3.0;
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}


//	String info(){
//		
//		//국어+영어+수학
//		int sum = this.kor+this.eng+this.math;
//		double avg = (double)sum / 3;
//		
//		return this.name+","+this.ban+","+this.no+","+
//		this.kor+","+this.eng+","+this.math+","+sum+","+avg;
//	}

}
