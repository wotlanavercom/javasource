package action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter@Getter
@AllArgsConstructor@NoArgsConstructor
public class BookActionForward {
	//이동방식, 페이지
	private boolean isRedirect;
	private String path;

}
