package ch1;

//형변환 : 강제형변환(casting), 자동형변환(작은=>큰)
//       boolean을 제외한 나머지 7개의 기본형은 서로 형변환 가능
//정수형 ==> 실수형
//실수형 ==> 정수형
//자동형변환
//byte => short, char => int => long => float => double
public class VariableEx8 {
	public static void main(String[] args) {
		int i = 91234567;
		float f = (float)i;
		//큰 타입을 작은 타입에 담을 때는 오류가 남 ==>변경 타입을 앞에 꼭 써야 함(casting)
		int i2 = (int)f;
		System.out.printf("i=%d\n",i);
		System.out.printf("f=%f i2=%d\n",f,i2);
				
	   
	    //자동형변환 : 변경 타입 생략 가능
	    byte byteValue = 10;
	    int intVal = byteValue;
	    System.out.printf("intVal = %d\n",intVal);
	    
	    char charVal = 'a';
	    intVal = charVal;	
	    System.out.printf("intVal = %d\n",intVal);		
	    System.out.printf("charVal = %c\n",charVal);		
	    	
	    
	    double d = 5.5;
	    double result = intVal +d;
	    System.out.printf("result = %f\n",result);
	    
	    // \n : 엔터, \t : tab
	    System.out.println("abc\tdef");
	    System.out.println("abc\\def");
	    System.out.println("c:\\");
	}


}
