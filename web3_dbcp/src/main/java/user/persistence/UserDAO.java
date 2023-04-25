package user.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import user.domain.UserDTO;

//~~ DAO : 데이터베이스 작업
public class UserDAO {
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
		
	public Connection getConnection() {
		Context ctx;
		try {
			ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myoracle");
			return ds.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void close(Connection con, PreparedStatement pstmt) {
		try {
			
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean insert(String name, String birthYear, String addr, String mobile) {
		
		boolean flag = false;		
		con = getConnection();
		String sql ="INSERT INTO userTBL(no,username, birthYear, ADDR, mobile) ";
		sql += "values(user_seq.NEXTVAL, ?,?,?,?)";
		
		//executeUpdate() : insert, update, delete 와 같은 DML 구문 실행
		try {
			pstmt = con.prepareStatement(sql);
			// ? 해결
			pstmt.setString(1, name);
			pstmt.setInt(2, Integer.parseInt(birthYear));
			pstmt.setString(3, addr);
			pstmt.setString(4, mobile);
			
			int count = pstmt.executeUpdate();
			
			if(count > 0) flag=true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
		
	}
	
	public List<UserDTO> getliList(){
		List<UserDTO> list = new ArrayList<>();
		
		try {
			con = getConnection();
			
			//3. SQL 쿼리문 실행 - 1) 전체 조회
			String sql = "select * from usertbl";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();  //쿼리문 실행한 후 결과 전송
			while(rs.next()){
				int no = rs.getInt("no");
				String username = rs.getString("username");
				int birthyear = rs.getInt("birthyear");
				String addr = rs.getString("addr");
				String mobile = rs.getString("mobile");
				
				list.add(new UserDTO(no, username, birthyear, addr, mobile));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
	public UserDTO getRow(int no) {
		
		UserDTO dto = null;
		
		try {
			con = getConnection();
			
			String sql = "select * from usertbl where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				String name =rs.getString("username");
				int birthYear =rs.getInt("birthYear");
				String addr =rs.getString("addr");
				String mobile =rs.getString("mobile");
				
				dto = new UserDTO(no, name, birthYear, addr, mobile);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return dto;
	}
	
	//수정
	public boolean update(int no, String addr, String mobile) {
		boolean flag = false;
		
		try {
			con = getConnection();
			
			pstmt = null;
			String sql = "";
			if(addr != "" && mobile !=""){
			//update usertbl set addr=?, mobile=? where no=?
				sql = "update usertbl set addr=?, mobile=? where no=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, addr);
				pstmt.setString(2, mobile);
				pstmt.setInt(3, no);
			}else{
				if(addr !=""){
			//update usertbl set addr=? where no=?
				sql = "update usertbl set addr=? where no=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, addr);
				pstmt.setInt(2, no);
				}else{
			//update usertbl set mobile=? where no=?
					sql="update usertbl set mobile=? where no=?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, mobile);
					pstmt.setInt(2, no);
				}
			}
			int count = pstmt.executeUpdate();
			
			if(count > 0) flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	public boolean remove(int no)	{
		boolean flag = false;
		
		try {
			con = getConnection();
			
			String sql ="delete from usertbl where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			int count = pstmt.executeUpdate();
			if(count > 0) flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}
}
