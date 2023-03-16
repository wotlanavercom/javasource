package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx2 {

	public static void main(String[] args) {
		//ArrayList 에 Member 객체를 추가
		ArrayList<Member1> list = new ArrayList<>();
		list.add(new Member1("홍길동"));
		list.add(new Member1("성춘향"));
		list.add(new Member1("고길동"));
		list.add(new Member1("강감찬"));
		list.add(new Member1("송혜교"));
		
		System.out.println(list);
		
		//Member2 담는 ArrayList 생성
		ArrayList<Member2> list2 = new ArrayList<>();
		list2.add(new Member2("홍길동", "hong123", "hong123"));
		list2.add(new Member2("성춘향", "kong123", "kong123"));
		list2.add(new Member2("고길동", "song123", "song123"));
		list2.add(new Member2("강감찬", "kong123", "kong123"));
		list2.add(new Member2("송혜교", "tong123", "tong123"));
		
		System.out.println(list2); // 오버라이딩된 toString() 출력 ==>list2 확인 용도
		System.out.println("size() "+list2.size());
		
		
		for(int i = 0; i < list2.size(); i++) {
			Member2 member = list2.get(i);
			System.out.println("id : "+member.getId()+", password : "+member.getPassword()+", name : "+member.getName());
		}
		
		// Iterator : List, Set, Map 구조에서 요소를 접근하는 방법에 대한 통일성 제공
		// hasNext() : 다음요소가 존재하는 경우 true
		// next() : 요소 가져오기
		System.out.println();
		System.out.println("id       password         name");
		System.out.println("====================================");
		for (Iterator iterator = list2.iterator(); iterator.hasNext();) { //iterator.hasNext();=> 조건
			Member2 member2 = (Member2) iterator.next();
			System.out.println(member2.getId()+"\t"+member2.getPassword()+"\t"+member2.getName());
		}
		
		System.err.println();
		for (Member2 member2 : list2) {
			System.out.println(member2.getId()+"\t"+member2.getPassword()+"\t"+member2.getName());
		}
		

	}

}
