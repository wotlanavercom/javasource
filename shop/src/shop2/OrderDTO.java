package shop2;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//관계 : 1)상속(isa) 2)포함(hasa)

@AllArgsConstructor@NoArgsConstructor
@ToString@Getter@Setter
public class OrderDTO {
	private int orderid;
	private int userid;
	private int productid;
	private Date orderDate;
	
	//포함 관계
	private UserDTO userDTO;
	private ProductDTO productDTO;
	

}
