package database2;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		EmpDAO empDAO = new EmpDAO();
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while (flag) {
			System.out.println("-----------------------------");
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 삭제");
			System.out.println("3. 사원 급여 수정");
			System.out.println("4. 사원 조회(사번)");
			System.out.println("5. 사원 조회(이름)");
			System.out.println("6. 종료");
			System.out.println("-----------------------------");
			
			System.out.println("메뉴 >> ");
			//메뉴번호 입력받기
			int menu = Integer.parseInt(sc.nextLine());
			//switch 작성
			switch (menu) {
			case 1:
				//삽입할 사원정보 입력받기
				EmpDTO empDTO = new EmpDTO();
				System.out.print("새사원 추가");
				System.out.print("추가할 사번입력 >> ");
				empDTO.setEmpno(Integer.parseInt(sc.nextLine()));
				System.out.print("추가할 사원 이름 입력 >> ");
				empDTO.setEname(sc.nextLine());
				System.out.print("추가할 직무 입력 >> ");
				empDTO.setJob(sc.nextLine());
				System.out.print("추가할 매니저 번호 입력 >> ");
				empDTO.setEmpno(Integer.parseInt(sc.nextLine()));
				System.out.print("추가할 급여 입력 >> ");
				empDTO.setEmpno(Integer.parseInt(sc.nextLine()));
				System.out.print("추가할 추가수당 입력 >> ");
				empDTO.setEmpno(Integer.parseInt(sc.nextLine()));
				System.out.print("추가할 부서번호 입력 >> ");
				empDTO.setEmpno(Integer.parseInt(sc.nextLine()));
				
				System.out.println(empDAO.insert(empDTO)?"사원 추가 성공":"사원 추가 실패");
				
								
				break;
			case 2:
				//삭제할 empno 입력받기
				System.out.println("삭제할 사번 입력 >> ");				
				int empno = Integer.parseInt(sc.nextLine());
				
				System.out.println(empDAO.remove(empno)?"삭제 성공":"삭제 실패");
				
				break;
			case 3:
				//empno, sal 입력받기
				System.out.println("수정할 정보 입력 >> ");
				System.out.println("사원번호 >> ");
				empno = Integer.parseInt(sc.nextLine());
				
				System.out.println("수정 급여 >> ");
				int sal = Integer.parseInt(sc.nextLine());
				System.out.println(empDAO.update(sal, empno)?"급여 변경 성공":"급여 변경 실패");
				
					
				break;
			case 4:
				//empno 입력 받기
				System.out.print("조회할 사번 입력 >> ");
				empno = Integer.parseInt(sc.nextLine());
				
				//EmpDTO 가 null 상태일 수 있음
				EmpDTO dto = empDAO.getRow(empno); //dto 변수명 
				 //출력
//				System.out.println(dto); empno, ename, job, sal, comm, deptno
				if(dto != null) {
				System.out.println("\n*** 사원정보 조회***");
				System.out.println("사원번호 : "+dto.getEmpno());
				System.out.println("사원명 : "+dto.getEname());
				System.out.println("직무 : "+dto.getJob());
				System.out.println("급여 : "+dto.getSal());
				System.out.println("추가수당 : "+dto.getComm());
				System.out.println("부서번호 : "+dto.getDeptno());
				}else {
					System.out.println("사원번호를 확인해 주세요");
				}
				System.out.println();
				break;
			case 5:
				//이름 입력받기
				System.out.println("조회할 이름 입력 >> ");
				String ename = sc.nextLine();
				
				//ArrayList가 빈 상태 or 데이터가 담겨 있는 상태
				ArrayList<EmpDTO> list = empDAO.getList(ename);
				
				//empno,ename,job,hiredate
				System.out.println();
				
				if(list.isEmpty()) {
					System.out.println("조회 사원이 없습니다.");
				}else {
					System.out.println("사번\t사원명\t직무\t\t입사일");
					System.out.println("---------------------------------");
					for (EmpDTO empDTO1 : list) {
						System.out.print(empDTO1.getDeptno()+"\t");
						System.out.print(empDTO1.getEname()+"\t");
						System.out.print(empDTO1.getJob()+"\t");
						System.out.print(empDTO1.getHiredate()+"\n\n");
					}
					
				}
				
				
				
				break;
			case 6:
				flag = false;				
				break;	

			default:
				System.out.println("메뉴 번호 확인");
				break;
			}
		}
				

	}

}
