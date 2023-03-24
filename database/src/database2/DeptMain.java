package database2;

import java.util.ArrayList;
import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("=======================");
			System.out.println("1. 특정부서 조회");
			System.out.println("2. 전체부서 조회");
			System.out.println("3. 새 부서 추가");
			System.out.println("4. 부서 정보 수정");
			System.out.println("5. 부서 정보 삭제");
			System.out.println("6. 종료");
			System.out.println("==========================");
			
			System.out.println("메뉴입력 >>");
			int no = Integer.parseInt(sc.nextLine());
			
			switch (no) {
			case 1:
				//사용자로부터 조회를 원하는 부서코드 입력받기
				System.out.print("부서 코드 입력 >> ");
				int deptno = Integer.parseInt(sc.nextLine());
				
				//하나 조회
				DeptDTO row = dao.getRow(deptno); //row 변수명 
				//DeptDTO 출력
				System.out.println(row);
				break;
			case 2:
				//전체 조회
				ArrayList<DeptDTO>list = dao.getRows();
				for (DeptDTO deptDTO : list) {
					System.out.print(deptDTO.getDeptno()+"\t");
					System.out.print(deptDTO.getDname()+"\t");
					System.out.print(deptDTO.getLoc()+"\n");
				}
				break;
			case 3: //새 부서 추가
//				System.out.println("부서 번호 >> ");
//				deptno = Integer.parseInt(sc.nextLine()); 
//				System.out.println("부서명 >> ");
//				String dname = sc.nextLine();
//				System.out.println("지역 >> ");
////				String loc = sc.nextLine();
//				
//				System.out.println(dao.insert(deptno, dname, loc)?"삽입 성공":"삽입실패");
				
				//사용자 입력 값을 DeptDTO 객체에 저장
				DeptDTO dto = new DeptDTO();
				System.out.print("부서 번호 >> ");
				dto.setDeptno(Integer.parseInt(sc.nextLine())); 
				System.out.print("부서명 >> ");
				dto.setDname(sc.nextLine());
				System.out.print("지역 >> ");
				dto.setLoc(sc.nextLine());
				
				System.out.println(dao.insert(dto)?"삽입 성공":"삽입실패");
				
				
				break;
			case 4:
				
				System.out.println("부서번호 >> ");
				deptno = Integer.parseInt(sc.nextLine());
				
				System.out.println("1) 부서명 수정 2) 위치 수정 원하는 번호 입력");
				int updateNo = Integer.parseInt(sc.nextLine());
				
				String input = null;
				if(updateNo == 1) {
					//1선택시
					System.out.print("새 부서명 입력 >> ");
					input = sc.nextLine();					
				}else if (updateNo == 2) {
					//2 선택시
					System.out.print("새 위치 입력 >> ");
					input = sc.nextLine();
				}
				
				System.out.println(dao.update(input, deptno, updateNo)?"수정성공":"수정실패");
						
								
				break;
			case 5:
				
				System.out.print("삭제 부서 코드 입력 >> ");
				deptno = Integer.parseInt(sc.nextLine());
				
				System.out.println(dao.remove(deptno)?"삭제성공":"삭제실패");
				
				
				
				break;
			case 6:
				flag = false;				
				break;

			default:
				System.out.println("번호 다시 입력해 주세요");
				break;
			}
		}
		
		
		
		
	

	}

}
