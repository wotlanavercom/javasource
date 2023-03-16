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
 */
public class ExceptionEx2 {

	public static void main(String[] args) {
		// java.lang 패키지의 ArithmeticException 클래스
		
		// java.lang.ArithmeticException: / by zero
		
		
		try {
			System.out.println(3/1);			
		} catch (RuntimeException e) {//왼쪽은 부모, 오른쪽은 자식 형태
			//e.printStackTrace();// 개발시 자주 쓰는 코드 형태임(예외가 발생하는 구문을 추적해서 출력)
//			System.out.println("0으로 나눌 수 없습니다."); //개발자가 원하는 구문 출력
			System.out.println(e.getMessage()); //예외발생시 자바가 제공하는 기본메세지 출력
		} finally {
			System.out.println("반드시 실행");
		}


	}

}
