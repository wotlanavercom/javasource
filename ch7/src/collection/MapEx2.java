package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("김자바", 90);
		map.put("홍자바", 100);
		map.put("박자바", 95);
		map.put("이자바", 98);
		map.put("최자바", 88);
		map.put("표자바", 89);
		
		// entrySet() : map => Entry => set 구조로 변환
		// Entry : 키와 값의 결합
		Set<Entry<String, Integer>> set = map.entrySet();
		
		//
		Iterator<Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) it.next();
			System.out.println("이름 : "+entry.getKey()+", 점수 : "+entry.getValue());		
			
		}
		
		//keySet()
		Set<String> keys = map.keySet();
		System.out.println("참가자 명단 : "+keys);
		
		
		//values()
		Collection<Integer> values = map.values();
		System.out.println("점수 : "+values);
		
		//Collections : 클래스, Collection에 사용할 메소드들 가지고 있음
		
		//총점, 평균, 최고점, 최저점
		int total = 0;
		Iterator<Integer> it2 = values.iterator();
		while (it2.hasNext()) {
			total += it2.next();
			
		}
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+(float)total / set.size());
		System.out.println("최고 점수 : "+Collections.max(values));
		System.out.println("최wj 점수 : "+Collections.min(values));

	}

}
