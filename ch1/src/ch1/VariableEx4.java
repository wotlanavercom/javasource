package ch1;


/*리터럴
 * 대입되는 값(상수)
 *
 * 정수형 : long
 */

public class VariableEx4 {

	public static void main(String[] args) {
		//접미사 ; L, f, d
	    long big = 100_000_000_000L;
	    float f = 0.14159f;
	    double d = 0.141592d; //d는 필순는 아님
	    
	    //접두사 ; 0(8진수), 0x(16진수), 0b(2진수)
	    int octNum = 010; //8진수 10 ==> 10진수로 출력
	    int hexNum = 0x10;//16진수 10
	    int binNum = 0b10;//2진수 10
	    System.out.println(octNum);
	    System.out.println(hexNum);
	    System.out.println(binNum);
	    
	    //타입이 달라도 저장범위가 넓은 타입에 좋은 타입의 값을 저장하는 것은 허용된
	    //'A' : 2byte
	    //int : 4byte
	    int i = 'A';
	    System.out.println(i);
	    
	    //byte b = 128;
	    
	    
	    //"" : 문자열
	    //String : 참조타입
	    String name = "hong";
	    
	    //① name 값 가져오기
	    //② 문자 77 을 연결하기
	    //③ 연결한 값을 name 담기
	    name = name + " 77"; 
	    System.out.println(name);
	    
	    String num = 7+7+"7"; //14 + "7"
	    System.out.println(num); //147
	    		
	    		
	    //printf() : 형식화된 출력
	    //%d : 10진 정수의 형식 출력
	    //%c : 문자
	    //%s : 문자열
	    //%f : 부동소수점
	    int age = 25;
	    System.out.println("age="+age);
	    System.out.printf("age=%10d\n",age); //10==>10칸만큼 공간비움
	    
	    char ch1='a';
	    String str1 = "abcd";
	    double d1 = 3.141592;
	    System.out.printf("ch1=%10c\n",ch1);
	    System.out.printf("str1=%s\n",str1);
	    System.out.printf("str1=%-10s\n",str1);
	    System.out.printf("str1=%10s\n",str1);
	    System.out.printf("double=%10.3f\n",d1); //.3==>소수점 3자리까지
	    		
	    		
	    		
	    		
	    		
	    		
	    	
	    
	}


}
