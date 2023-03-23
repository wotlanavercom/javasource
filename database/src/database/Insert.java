package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {

	public static void main(String[] args) {
		
		//insert,update,delete 작업 시 두개의 객체만 사용
		//DML 작업시 성공한 행의 개수만 전달받게 됨
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con = DriverManager.getConnection(url,user,password);
			
			//sql 문 작성
			String sql = "insert into dept_temp(deptno, dname, loc) values(55,'NETWORK','SEOUL')";
			
			pstmt = con.prepareStatement(sql);
			
			//select : executeQuery(), DML : executeUpdate()
			int count = pstmt.executeUpdate();
			
			if (count > 0) {
				System.out.println("입력 성공");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
