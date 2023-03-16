package modifier;

public class Account {
	//속성(인스턴스변수) ==> private
	//외부에서는 속성에 직접적으로 접근 불가
	//인스턴스변수의 값을 얻어내거나 or 변경하고 싶다면? ==> 메소드로 처리
	private String ano;

	//getter/setter 메소드 활용
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	

}
