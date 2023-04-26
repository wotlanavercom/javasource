package action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor@AllArgsConstructor
@Getter@Setter
public class ActionForward {
	//페이지이동방식(true,false),페이지(String);
	
	private boolean isRedirect;
	private String path;
	
}
