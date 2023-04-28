package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import domain.ChangeDTO;
import domain.MemberDTO;

public class MemberDAO {
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//DB서버 연결
	public Connection getConnection() {
				
		try {
			
			Context ctx = new InitialContext();
			
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myoracle");			
			Connection con = ds.getConnection();
			//DML 실행 시 트랜잭션 관리를 직접 하겠음
			con.setAutoCommit(false);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//자원해제
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			con.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void close(Connection con, PreparedStatement pstmt) {
		try {
			
			con.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void commit(Connection con) {
		try {
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void rollback(Connection con) {
		try {
			con.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//로그인
	//아이디와 비밀번호가 일치하면 아이디와 이름만 추출
	//select userid, name from membertbl where userid=? and password=?
	public MemberDTO islogin(String userid, String password) {
		MemberDTO dto = null;
		
		
		try {
			
			con = getConnection();
			
			String sql = "select userid, name from membertbl where userid=? and password=? ";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, userid);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				dto = new MemberDTO();
				dto.setUserid(rs.getString("userid"));
				dto.setName(rs.getString("name"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return dto;
	}
	//회원가입
	public boolean insert(MemberDTO dto) {
		boolean flag = false;
		
		
		try {	
			con = getConnection();
			
			String sql = "insert into membertbl(userid,password,name,gender,email) values(?,?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getUserid());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getGender());
			pstmt.setString(5, dto.getEmail());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				flag = true;
				commit(con);
			}
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	//비밀번호 변경
	public boolean update(ChangeDTO dto) {
		boolean flag = false;
		
		try {
			con = getConnection();
			
			String sql = "update membertbl set password = ? where userid = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getConfirmPassword());
			pstmt.setString(2, dto.getUserid());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				flag = true;
				commit(con);
			}
			
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	//회원탈퇴 - 아이디와 비밀번호 일치시
	public boolean delete(String userid, String password) {
		boolean flag = false;
		
		try {
			con = getConnection();
			
			String sql = "delete from membertbl where userid=? and password=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, password);
			
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				flag = true;
				commit(con);
			}
			
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	//중복아이디 검사
	//존재하는 아이디가 있다면 ture 리턴 false 리턴
	public boolean duplicateId(String userid) {
		boolean flag = true;
		
		try {
			con = getConnection();
			
			String sql = "select count(*) from membertbl where userid=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int cnt = rs.getInt(1);
				if(cnt > 0) flag = false;
			}			
		} catch (Exception e) {			
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return flag;
	}
	
}
