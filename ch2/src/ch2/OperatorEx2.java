package ch2;

/*연산자
 * 1) 단항연산자
 * +(양수), -(음수), ++, -- ~ !
 * 2) 이항연산자
 *    산술 : +, -, *, /, %, <<. >>, >>>    (+, -, *, /, % 5가지 많이씀)
 *    비교 : >, <, >=, <=, ==, !=   ( == 은 값이 같은지 물어보는것, != 는 값이 같지 않다면)
 *    논리 : &&(and), ||(or), ^(xor), &(and), |(or)    (&&, ||, ^ 3가지 많이씀)
 * 3) 삼항연산자 : ? :
 * 4) 대입연산자 : =    ex) a=4;
 * 
 * 
 * 연산자 우선순위
 */
public class OperatorEx2 {

	public static void main(String[] args) {
		int num1=10;
		int num2=10;
		//비교연산자 : 결과값은 boolean 의 형태로 나옴
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1>=num2);
		System.out.println(num1<=num2);
		
		boolean result = num1 ==num2;
		System.out.println(result);
		
		//A:65, a:97
		char ch1='A';
		char ch2='B';
		System.out.println("ch1==ch2= "+(ch1==ch2));
		System.out.println("ch1!=ch2= "+(ch1!=ch2));
		System.out.println("ch1>=ch2= "+(ch1>=ch2));
		System.out.println("ch1<=ch2= "+(ch1<=ch2));
		
		//정밀도
		double d1=0.4;
		float f1=0.4f;
		System.out.println("d1==f1="+(d1==f1));
		System.out.println("d1!=f1="+(d1!=f1));
		System.out.println("d1>=f1="+(d1>=f1));
		System.out.println("d1<=f1="+(d1<=f1));

	}

}
