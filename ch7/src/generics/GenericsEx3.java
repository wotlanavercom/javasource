package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class GenericsEx3 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 1, 1));
		list.add(new Student("성춘향", 1, 2));
		list.add(new Student("자바왕", 1, 3));
		list.add(new Student("자바짱", 1, 4));
		
		//List, set, Map 구조에서 요소에 접근하는 통일된 방법
		Iterator<Student> it = list.iterator();
		
		while (it.hasNext()) {
			//Student student = (Student) it.next(); =>예전방식
			Student student = it.next();
			System.out.println(student.getName());
		}
		
		HashMap<String, Student> map = new HashMap<>();
		map.put("stu1",new Student("홍길동", 1, 1));
		map.put("stu2",new Student("홍길동", 1, 2));
		map.put("stu3",new Student("홍길동", 1, 3));
		

	}

}
