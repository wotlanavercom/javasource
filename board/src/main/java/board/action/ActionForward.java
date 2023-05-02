package board.action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor@NoArgsConstructor
@Getter@Setter@ToString
public class ActionForward {
	private boolean isRedirect;
	private String path;

}
