package database2;

import java.util.ArrayList;
import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {
		DeptDao dao = new DeptDao();
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("=======================");
			System.out.println("1. 특정부서 조회");
			System.out.println("2. 전체부서 조회");
			System.out.println("6. 종료");
			System.out.println("==========================");
			
			System.out.println("메뉴입력 >>");
			int no = sc.nextInt();
			
			switch (no) {
			case 1:
				//사용자로부터 조회를 원하는 부서코드 입력받기
				System.out.println("부서 코드 입력 >> ");
				int deptno = sc.nextInt();
				
				//하나 조회
				DeptDTO row = dao.getRow(deptno);
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
