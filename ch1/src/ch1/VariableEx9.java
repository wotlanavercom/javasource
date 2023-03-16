package ch1;

//변수의 범위
//변수 : 지역변수, 인스턴스 변수, 클래스 변수
//    : 모든 변수는 유효범위 존재
//
public class VariableEx9 {
	public static void main(String[] args) {
		int i=4;
		
		//i 의 유효범위? : main 메소드 안에서만 가능 ==>중괄호안에서만 {}
		
		{
			int j=5;
			//j 유효범위
			System.out.println(j);
		}
		/*
		 * cannot be resolved to a variable
		 * System.out.println(j);
		 */
		System.out.println(i);
	}


}
