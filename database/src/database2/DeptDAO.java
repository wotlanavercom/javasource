package database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//~~~DAO : DataBase 작업을 담당하는 클래스임
public class DeptDAO {
	
	private Connection con; //이클립스랑 데이터베이스랑 연결
	private PreparedStatement pstmt; //- SQL 구문을 실행하는 역할 - 스스로는 SQL 구문 이해 못함(구문해석 X) -> 전달역할 - SQL 관리 O + 연결 정보 X
	private ResultSet rs; //수정 추가 삭제 db에 명령을 내리고 그값을 돌려준다
	
	//커넥션을 위한 드라이버 로드	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//커넥션 리턴 메소드
	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "TIGER";
		
		try {
			con = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	//close() : 자원닫기
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close(Connection con, PreparedStatement pstmt) {
		try {
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//select - 하나
	public DeptDTO getRow(int deptno) {
		//커넥션 가져오기
		con = getConnection();
		
		//sql 구문 작성
		String sql = "select * from dept_temp where deptno=?";
		DeptDTO dto = null;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				//System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
				
				//rs => DeptDTO 에 담기
//				deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				
//				dto = new DeptDTO(deptno, dname, loc);
				
//				return new DeptDTO(rs.getInt(1),rs.getString(2),rs.getString(3));
				
				
				dto =new DeptDTO();
				dto.setDeptno(rs.getInt(1));
				dto.setDname(rs.getString(2));
				dto.setLoc(rs.getString(3));
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt,rs);
		}
		return dto;
	}
	
	//select-all
	public ArrayList<DeptDTO> getRows() {
		
		ArrayList<DeptDTO> list = new ArrayList<>();
		
		try {
			
			con = getConnection();			
			String sql = "select * from dept_temp";			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
//				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			
//				int deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				DeptDTO dto = new DeptDTO(deptno, dname, loc);							
//				list.add(dto);
			
				
//				list.add(new DeptDTO(rs.getInt(1),rs.getString(2),rs.getString(3)));
			
				DeptDTO dto = new DeptDTO();
				dto.setDeptno(rs.getInt(1));
				dto.setDname(rs.getString(2));
				dto.setLoc(rs.getString(3));
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);
		}
		return list;
	}//getRows 종료
	public boolean insert(DeptDTO dto) {
		
		//insert 성공 여부
		boolean status = false;
		
		
		try {
			
			con = getConnection();
			
			String sql = "insert into dept_temp(deptno, dname, loc) values(?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			
			//? 처리
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) status =true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return status;
	}
	//새부서 추가 메소드
	public boolean insert(int deptno, String dname, String loc) {
		
		//insert 성공 여부
		boolean status = false;
		
		
		try {
			
			con = getConnection();
			
			String sql = "insert into dept_temp(deptno, dname, loc) values(?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			
			//? 처리
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) status =true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return status;
	}
	
	
	//부서 정보 수정 메소드
	public boolean update(String value,int deptno,int updateNo) {
		boolean status = false;
		String sql = null;
		
		
		
		try {
			
			con = getConnection();
			
			if (updateNo == 1) {
				//부서 수정
				sql = "update dept_temp set dname=? where deptno=?";
				
			}else if (updateNo == 2) {
				//위치 수정
				sql = "update dept_temp set loc=? where deptno=?";
				
			}
			
			pstmt = con.prepareStatement(sql);
			//? 처리
			pstmt.setString(1, value); //value : dname,loc를 말하는 변수명
			pstmt.setInt(2, deptno);
			
			int result = pstmt.executeUpdate();
			
			if (result > 0) status = true;
				
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return status;
	}
	
	//부서 정보 삭제
	public boolean remove(int detpno) {
		boolean status = false;
		
		try {
			
			con = getConnection();	
							
			//deptno 일치한 부서 삭제
			String sql = "delete from dept_temp where deptno=? ";
						
			pstmt =con.prepareStatement(sql);
			// ? 처리
			pstmt.setInt(1, detpno);
			
			int result = pstmt.executeUpdate();
			
			if (result > 0)status =true; 			
									
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		return status;
	}
	
	

}
