package user.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter@Getter@ToString
@AllArgsConstructor@NoArgsConstructor
public class LoginDTO {
	private String userId;
	private String password;

}
