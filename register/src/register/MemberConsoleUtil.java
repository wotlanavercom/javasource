package register;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MemberConsoleUtil {
	
	public Member getNewMember(Scanner sc) {
		//새로운 Member 정보 입력받기
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		
//		Member member = new Member(id, name, address, email, age);
//		return member;
		
		return new Member(id, name, address, email, age); //위에 두줄 줄인것
	}
	
	public void printAddSuccessMessage(Member member) {
		// 홍길동님 회원 정보 추가 성공 메세지 출력
		System.out.println(member.getName()+"님 회원 정보 추가 성공");
	}
	
	public void printMemberList(ArrayList<Member> list) {
		//list에 들어있는 member 출력
		System.out.println("아이디  이름  주소  이메일  나이");
		for (Member member : list) {
			System.out.printf("%5s", member.getId());
			System.out.printf("%6s", member.getName());
			System.out.printf("%8s", member.getAddress());
			System.out.printf("%10s", member.getEmail());
			System.out.printf("%5d", member.getAge());
			System.out.println();
		}
	}
	public Member updateMember(Scanner sc, ArrayList<Member> list) {
		//수정할 회원의 아이디를 입력받기
		System.out.println("수정할 회원 아이디 입력");
		String id = sc.nextLine();
		
//		//list에서 입력된 회원의 아이디랑 일치하는 회원 찾기
//		Iterator<Member> it = list.iterator();
//		//list=>Iterator 변경
//		//Member를 하나씩 가져오게 됨
//		while (it.hasNext()) {
//			Member member = it.next();
//			
//			if (member.getId().equals(id)) {
//				//회원이 존재한다면 변경할 주소를 입력 받기
//				System.out.println("변경 주소 입력 : ");
//				String address = sc.nextLine();
//				//주소를 변경한다.
//				member.setAddress(address);
//				
//				//수정된 회원을 리턴
//				return member;
//			}
//		}
		
		//list에서 입력된 회원의 아이디랑 일치하는 회원 찾기
				
//		for (int i = 0; i < list.size(); i++) {
//			Member member = list.get(i);						
//				if (member.getId().equals(id)) {
//				//회원이 존재한다면 변경할 주소를 입력 받기
//				System.out.println("변경 주소 입력 : ");
//				String address = sc.nextLine();
//				//주소를 변경한다.
//				member.setAddress(address);
//						
//				//수정된 회원을 리턴
//				return member;
//					}
//				}
		
		for (Member member : list) {									
			if (member.getId().equals(id)) {
				//회원이 존재한다면 변경할 주소를 입력 받기
				System.out.println("변경 주소 입력 : ");
				String address = sc.nextLine();
				//주소를 변경한다.
				member.setAddress(address);
						
				//수정된 회원을 리턴
				return member;
					}
				}
		//일치하는 회원이 없다면
		return null;
		
	}
	
	
	public void printUpdateSuccessMessage(Member member) {
		//홍길동님 회원 정보 수정 성공 메세지 출력
		System.out.println(member.getName()+"님 회원 정보 수정 성공");
		
	}
	
	public void printUpdateFailMessage() {
		//회원 정보 수정에 실패하였습니다.
		System.out.println("회원 정보 수정에 실패하였습니다.");
		
	}
	
	
	public Member removeMember(Scanner sc,ArrayList<Member> list) {
		//삭제할 회원 아이디 입력받기
		System.out.println("삭제할 회원 아이디 : ");
		String id = sc.nextLine();
		//삭제할 회원 아이디가 존재하는지 확인하기
		for (Member member : list) {									
			if (member.getId().equals(id)) {
				//존재한다면 삭제
				list.remove(member);							
				//삭제 회원 리턴
				return member;
					}
				}
		
		//삭제할 회원 아이디가 존재하지 않는다면 null리턴
		return null;
		
	}
	public void printRemoveSuccessMessage(Member member) {
		System.out.println(member.getName()+"회원 정보 삭제 성공");
	}
	
	public void printRemoveFailMessage() {
		System.out.println("회원 정보 삭제에 실패하셨습니다.");
	}

}
