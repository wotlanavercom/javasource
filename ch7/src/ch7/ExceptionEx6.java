package ch7;

/* 컴파일에러 : 컴파일 시에 발생하는 에러(코드작성 하자마자 빨간줄 나는것)
 * 런타임에러 : 실행 시에 발생하는 에러(실행시 에러나는 것)
 * 논리적에러 : 실행은 되지만, 의도와 다르게 동작하는 것(코드작성시 잘못 작성하여 결과값이 다르게 나오는것)
 * 
 * 에러(error) : 코드에 의해서 수습될 수 없는 심각한 오류 ex) 메모리 부족,스택오버플로우
 * 예외(exception) : 코드에 의해서 수습될 수 있는 미약한 오류
 * 
 * Exception
 * 1)Exception 클래스들 : 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
 * 2)RuntimeException 클래스들 : 프로그래머의 실수로 발생하는 예외
 *   - 배열 범위 벗어나기, NullpointerException, ClassCastException......
 *   
 *   Exception 처리
 *   try ~ catch
 *   예외던지기 : main 메소드를 호출하는 곳에서 처리
 */
public class ExceptionEx6 {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			//예외와 상관없이 항상 수행되어야 하는 구문
			System.out.println("반드시 실행");
		}
		
		try {
			
		} finally {
			//예외와 상관없이 항상 수행되어야 하는 구문
		}
	

	}

}
