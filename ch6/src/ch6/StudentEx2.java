package ch6;

public class StudentEx2 {

	public static void main(String[] args) {
		Student2 stuArr[] = new Student2[5];
		
		//기본값 확인 ==> null
		System.out.println(stuArr[0]);
		
		//초기화
		stuArr[0]=new Student2("홍길동", 1, 1, 45, 55, 65);
		stuArr[1]=new Student2("성춘향", 1, 2, 65, 75, 85);
		stuArr[2]=new Student2("서유기", 1, 3, 35, 75, 85);
		stuArr[3]=new Student2("김미남", 1, 4, 67, 77, 87);
		stuArr[4]=new Student2("이서진", 1, 5, 68, 69, 65);
		
		//홍길동 학생의 정보 출력
//		System.out.println("이름 : "+stuArr[0].name);
//		System.out.println("반 : "+stuArr[0].ban);
//		System.out.println("번호 : "+stuArr[0].no);
//		System.out.println("국어 : "+stuArr[0].kor);
//		System.out.println("영어 : "+stuArr[0].eng);
//		System.out.println("수학 : "+stuArr[0].math);
		
		//전체 학생의 정보 출력
		for (int i = 0; i < stuArr.length; i++) {
			System.out.println("이름 : "+stuArr[i].name);
			System.out.println("반 : "+stuArr[i].ban);
			System.out.println("번호 : "+stuArr[i].no);
			System.out.println("국어 : "+stuArr[i].kor);
			System.out.println("영어 : "+stuArr[i].eng);
			System.out.println("수학 : "+stuArr[i].math);
			System.out.println("총점 : "+stuArr[i].getTotal());
			System.out.println("평균 : "+stuArr[i].getAverage());
		}
	

	}

}
