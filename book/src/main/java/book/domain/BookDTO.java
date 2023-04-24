package book.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@ToString
@AllArgsConstructor@NoArgsConstructor
public class BookDTO {
	private int code;
	private String title;
	private String writer;
	private int price;
	private String description;
//	public BookDTO(int code, String title, String writer, int price) {
//		super();
//		this.code = code;
//		this.title = title;
//		this.writer = writer;
//		this.price = price;
//	}
	
	
}
