package database2;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//db 데이터 내용을 전송하는 용도로 주로 사용
//table 컬럼과 동일하게 작성
//getter/setter 메소드, 생성자, toString() 작성


@AllArgsConstructor@ToString
@Getter@Setter@NoArgsConstructor
public class EmpDTO {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
	

}
