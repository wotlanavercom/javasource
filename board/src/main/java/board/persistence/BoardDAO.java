package board.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import board.domain.BoardDTO;
import board.domain.PageDTO;

public class BoardDAO {
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
	
	//게시글 등록
	//inserArticle(BoardDTO boardDTO)
	//re_ref : bon 동일한 값, re_lev : 0, re_seq : 0
	public boolean insertArticle(BoardDTO boardDTO) {
		boolean flag = false;
		
		try {
			
			con = getConnection();
			String sql = "insert into board(bno,name,password,title,content,attach,re_ref,re_lev,re_seq) ";
			sql += "values(board_seq.nextval,?,?,?,?,?,board_seq.currval,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, boardDTO.getName());
			pstmt.setString(2, boardDTO.getPassword());
			pstmt.setString(3, boardDTO.getTitle());
			pstmt.setString(4, boardDTO.getContent());
			pstmt.setString(5, boardDTO.getAttach());
			pstmt.setInt(6, 0);
			pstmt.setInt(7, 0);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				flag = true;
				commit(con);
			}
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	//board 전체 가져오기
	//bno,title,name,regdate,cnt
	public List<BoardDTO> getRows(PageDTO pageDTO){
		List<BoardDTO> list = new ArrayList<>();
		
		try {
			
			con = getConnection();
			
			String sql = null;
			if (pageDTO.getKeyword().isEmpty() && pageDTO.getCriteria().isEmpty()) {
				
				//전체
//				String sql ="select bno,title,name,regdate,cnt,re_lev from board order by re_ref desc, re_seq asc";
				
				//페이지 나누기
				sql = "select * "; 
				sql += "from(select rownum rnum, bno, title, name, regdate, cnt, re_lev ";
				sql += "from(select bno, title, name, regdate, cnt, re_lev ";
				sql += "from board order by re_ref desc, re_seq asc) ";
				sql += "where rownum <= ?) ";
				sql += "where rnum > ?";
				
				pstmt = con.prepareStatement(sql);
				// ? 해결
				//rownum 값 : 페이지번호 * 한 페이지에 보여줄 목록 개수
				//rnum 값 : (페이지번호-1) * 한 페이지에 보여줄 목록 개수
				int start = pageDTO.getPage() * pageDTO.getAmount();
				int end = (pageDTO.getPage() - 1) * pageDTO.getAmount();
				pstmt.setInt(1, start);
				pstmt.setInt(2, end);
			}else {
				//검색
				sql = "select bno,title,name,regdate,cnt,re_lev from board ";
				sql += "where " + pageDTO.getCriteria() + " like ? order by re_ref desc, re_seq asc";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "%"+pageDTO.getKeyword()+"%");
				
			}			
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setBno(rs.getInt("bno"));
				dto.setTitle(rs.getString("title"));
				dto.setName(rs.getString("name"));
				dto.setRegDate(rs.getDate("regdate"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setReLev(rs.getInt("re_lev"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
	//게시글 하나 조회
	public BoardDTO getRow(int bno) {
		BoardDTO dto = null;
		
		try {
			
			con = getConnection();
			
			String sql = "select bno,name,title,content,attach,re_ref,re_lev,re_seq from board where bno=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new BoardDTO();
				dto.setBno(rs.getInt("bno"));
				dto.setName(rs.getString("name"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setAttach(rs.getString("attach"));
				dto.setReRef(rs.getInt("re_ref"));
				dto.setReLev(rs.getInt("re_lev"));
				dto.setReSeq(rs.getInt("re_seq"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return dto;
	}
	
	//조회수 증가
	//update board set cnt=cnt+1 where bno=?
	public boolean readcnt(int bno) {
		boolean flag = false;
		try {
			con = getConnection();
			
			String sql = "update board set cnt=cnt+1 where bno=?";			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			
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
	
	//업데이트
	//title, content 수정 + attach(옵션)
	public boolean updateArticle(BoardDTO updateDto) {
		boolean flag = false;
		String sql = null;
		try {
			
			con = getConnection();
			
			if (updateDto.getAttach()==null) {				
				sql = "update board set title=?,content=? where bno=? and password=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, updateDto.getTitle());
				pstmt.setString(2, updateDto.getContent());
				pstmt.setInt(3, updateDto.getBno());
				pstmt.setString(4, updateDto.getPassword());
			}else {
				sql = "update board set title=?,content=?,attach=? where bno=? and password=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, updateDto.getTitle());
				pstmt.setString(2, updateDto.getContent());
				pstmt.setString(3, updateDto.getAttach());				
				pstmt.setInt(4, updateDto.getBno());
				pstmt.setString(5, updateDto.getPassword());
			}
			
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
	
	public boolean delete(int bno,String password) {
		boolean flag = false;
		String sql = null;
		
		try {
			con = getConnection();
			sql = "delete from board where bno=? and password=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
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
	
	//답변	
	public boolean reply(BoardDTO updateDto) {
		boolean flag = false;
		try {
			con = getConnection();
			
			String sql = "update board set re_seq = re_seq + 1 where re_ref = ? and re_seq > ?";
			//부모값 가져오기
			int reRef = updateDto.getReRef();
			int reLev = updateDto.getReLev();
			int reSeq = updateDto.getReSeq();
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, reRef);
			pstmt.setInt(2, reSeq);
			
			pstmt.executeUpdate();
			
			sql = "insert into board(bno,name,password,title,content,attach,re_ref,re_lev,re_seq) ";
			sql += "values(board_seq.nextval,?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, updateDto.getName());
			pstmt.setString(2, updateDto.getPassword());
			pstmt.setString(3, updateDto.getTitle());
			pstmt.setString(4, updateDto.getContent());
			pstmt.setString(5, updateDto.getAttach());
			pstmt.setInt(6, reRef);
			pstmt.setInt(7, reLev + 1);
			pstmt.setInt(8, reSeq + 1);
			
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
	
	//검색
	public List<BoardDTO> searchRows(String criteria, String keyword){
		List<BoardDTO> list = new ArrayList<>();
		
		try {
			
			con = getConnection();
			
			String sql = "select bno,title,name,regdate,cnt,re_lev from board ";
			sql += "where " + criteria + " like ? order by re_ref desc, re_seq asc";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%"+keyword+"%");
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setBno(rs.getInt("bno"));
				dto.setTitle(rs.getString("title"));
				dto.setName(rs.getString("name"));
				dto.setRegDate(rs.getDate("regdate"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setReLev(rs.getInt("re_lev"));
				
				list.add(dto);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return list;
	}
}
