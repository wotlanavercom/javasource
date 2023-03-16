package ch6;

public class StudentEx {

	public static void main(String[] args) {
				
		
		Student stu = new Student("홍길동",1,1,100,60,76);		
						
		
		String msg = stu.info();
		System.out.println(msg);
		//msg 출력 시
		
		//홍길동,1,1,100,60,76,점수합계,평균
		System.out.println(stu); //ch6.Student@5aaa6d82
		
		
		//Student2 객체 생성
		Student2 stu2 = new Student2 ("성춘향",2,1,78,89,65);
		System.out.println("이름 : "+stu2.name);
		System.out.println("총점 : "+stu2.getTotal());
		System.out.println("vudrbs : "+stu2.getAverage());
		//이름 : 성춘향
		//총점 : 236
		//평균 : 78.1223
		System.out.println(stu2); //ch6.Student2@6f75e721

	}

}
