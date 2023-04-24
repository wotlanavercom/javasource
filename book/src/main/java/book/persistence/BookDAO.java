package book.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import book.domain.BookDTO;

public class BookDAO {
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	//드라이버 로드
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();			
		}
	}
	//DB서버 연결
	public Connection getConnection() {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "javadb";
		String password = "12345";
		
		try {
			Connection con = DriverManager.getConnection(url, user,password);
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
	
	//도서목록 조회
	public List<BookDTO> getList(){
		List<BookDTO> list = new ArrayList<>();
		
		try {
			
			con = getConnection();
			String sql = "select code,title,writer,price from booktbl";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
//				int code = rs.getInt("code");
//				String title = rs.getString("title");
//				String writer = rs.getString("writer");
//				int price = rs.getInt("price");
//				
//				list.add(new BookDTO(code, title, writer,price));
				
				BookDTO dto = new BookDTO();
				dto.setCode(rs.getInt("code"));
				dto.setTitle(rs.getString("title"));
				dto.setWriter(rs.getString("writer"));
				dto.setPrice(rs.getInt("price"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
	//도서 상세 조회
	//select * from booktbl where code=?
	public BookDTO getRow(int code) {
		BookDTO dto = null;
		
		try {
			con = getConnection();
			
			String sql = "select * from booktbl where code=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, code);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				code = rs.getInt("code");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				int price = rs.getInt("price");
				String description = rs.getString("description");
				
				dto = new BookDTO(code, title, writer, price, description);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return dto;
	}
	
}
