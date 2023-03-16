package ch3;

public class SwithchEx2 {

	public static void main(String[] args) {
		
		
//		char qwe='b';
//		switch (qwe) {
//		case 'a':case 'A':
//			System.out.println("우수");
//			break;
//		case 'b':case 'B':
//			System.out.println("일반");
//			break;
//
//		default:
//			System.out.println("손님");			
//			break;
//		}
//		
		
		
		
		
		
		
		
		
		char grade='B';
		switch (grade) {
		case 'A': case 'a': //grade=='a' or grade=='A'
			System.out.println("우수회원");
			break;
		case 'B': case 'b': 
			System.out.println("일반회원");
			break;
		default:
			System.out.println("손님");
			break;
		}
		
//		if (grade=='a'||grade=='A') {
//			System.out.println("우수회원");
//		}else if(grade=='b'||grade=='B') {
//			System.out.println("일반회원");
//		}
//		System.out.println("손님");
		
		String position="과장";
		switch (position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":	
			System.out.println("500만원");
		default:
			System.out.println("300만원");
			break;
		}
		
		
		
		
	}
	
}
