package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);
		
		// sort(List<T> list) : List 인터페이스가 처리가능한 객체가 넘어와야 함
		// ArrayList, LinkedList, Stack, Queue, Vector(List 인터페이스가 처리가능한 객체들)
		
		// set => list
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		System.out.println("정리 후 "+list);

	}

}
