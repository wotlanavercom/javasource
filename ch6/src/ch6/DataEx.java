package ch6;
/*
 * 기본형 : 소문자(int, float, double...){소문자로 시작}
 * 참조형 : 대문자(Data, String, 배열 int[]){대문자로 시작}
 * 
 * 매개변수
 * method(매개변수)
 * 기본형 매개변수 ==> 값만 복사
 * 참조형 매개변수 ==> 주소가 복사됨
 */
public class DataEx {

	public static void main(String[] args) {
		Data data = new Data();
		
		//초기화
		data.x =10;									  //1
		System.out.println("main() : x = "+data.x);   //2
		
		//값만 넘어감
		change(data.x);								  //3
		System.out.println("After change(data.x)");   //5
		System.out.println("main() : x = "+data.x);   //6
		
		//주소가 넘어감
		change2(data);                                //7
		System.out.println("After change2(data.x)");  //9
		System.out.println("main() : x = "+data.x);   //10
	}
	
	//기본형 매개변수 : 값만 받게 됨
	//int x : x가 가지고 있는 값만 넘김
	static void change(int x) {
		x = 1000;                                     //4(실행후 제거)
		System.out.println("change() : x ="+x);       //4.5
	}
	
	//참조형 매개변수 : 값을 읽고 수정 가능
	static void change2(Data d) {
		d.x = 1000;                                   //8
		System.out.println("change() : x ="+d.x);     //8.5
	}

}
