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
public class OperatorEx1 {

	public static void main(String[] args) {
		// ++,-- : 전위, 후위에 위치
		// 전위 : 값이 참조되기 전에 증가시킴  j = ++i;
		// 후위 : 값이 참조된 후 증가시킴     j = i++;
//		int i=5;
//		i++; //i=i+1;
//		System.out.println(i);
//		
//		i=5;
//		++i; //i=i+1;
//		System.out.println(i);
		
		
		int i=5, j=0;
		j=i++; // ① j=i; ② i=i+1;
		System.out.println("j=i++실행후 i="+ i + ", j = "+j);
		
		
		i=5;
		j=0;
		j=++i; // ① i=i+1; ② i=i+1;
		System.out.println("j=++i실행후 i="+ i + ", j = "+j);
		
		// ! : true==>false, false==>true
		// 피연산자가 boolean 값을 가질때만 사용
		// !true, !false, !3(x)
		boolean play=true;
		System.out.println("play="+play);
		System.out.println("!play="+!play);

	}

}
