package shop2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data //getter,setter,equals,canEqual,hashCode,tostring,기본생성자

@NoArgsConstructor @AllArgsConstructor
@ToString @Getter @Setter
public class ProductDTO {
	private int productId;
	private String pname;
	private int price;
	private String content;

}
