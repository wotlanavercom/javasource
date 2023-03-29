package shop2;
//Myshop 돌리는데 필요없음 연습용 클레스
public class OrderMain {

	public static void main(String[] args) {
		// OrderDTO 사용하기
		OrderDTO dto = new OrderDTO();
		
		//프로퍼티(멤버변수/속성)에 값 세팅 => 1)생성자 2) setter 메소드 사용
		dto.setOrderid(1000);
		
//		dto.setUserDTO(new UserDTO(100, "hong", 1, "card"));  이거대신 밑에 거로 해도됨
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(100);
		userDTO.setName("hong");
		userDTO.setPayNo(1);
		userDTO.setType("card");
		dto.setUserDTO(userDTO);
		
		
		//프로퍼티 값 조회
		System.out.println(dto.getOrderid());
		System.out.println(dto.getUserDTO().getName());
		
		UserDTO getUser = dto.getUserDTO();
		System.out.println(getUser.getName());
		System.out.println(getUser.getType());

	}

}
