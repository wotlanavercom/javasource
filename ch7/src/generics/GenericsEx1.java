package generics;

import java.util.ArrayList;

/*
 * Generics
 * 컴파일 시 타입을 체크 해 주는 기능
 * 
 * 장점
 * 1)타입 안전성 제공
 * 2)타입 체크와 형 변환을 생략 할 수 있으므로 코드의 간결성 유지
 * 
 * <E>, <T>, <K,V>, <? extends T>, <? super T>, <?>
 */
public class GenericsEx1 {

	public static void main(String[] args) {
		//ArrayList 안에는 String 타입만 추가 가능
		ArrayList<String> list = new ArrayList<>();
		
		//list.add(1);
		
		Box1  box1 = new Box1();
		box1.setItem("홍길동");
		
		String item = (String) box1.getItem();
		System.out.println(item);
		
		box1.setItem(1);
		Integer i = (Integer) box1.getItem();
		System.out.println(i);
				
		Box2<String> box2 = new Box2<>();
		box2.setItem("성춘향");
		item = box2.getItem();
		System.out.println("generices 적용 후 "+item);
		
		Box2<Integer> box3 = new Box2<>();
		box3.setItem(23);
		i = box3.getItem();
		System.out.println("generices 적용 후"+i);

	}

}
