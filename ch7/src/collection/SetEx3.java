package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {

	public static void main(String[] args) {
		// Person 객체를 Set 구조에 담기
		Set<Person> set = new HashSet<>();
		//사용자 정의 객체는 중복 저장을 허용함
		//허용하지 않으려면?
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);

	}

}
