package validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserNameSpecialValidator implements ConstraintValidator<UserNameSpecial, String> {

	private String username;
	
	@Override
	public void initialize(UserNameSpecial arg0) {
		this.username = arg0.username();
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		// 对于含有毛泽东的username，校验不通过
		if (arg0.contains("毛泽东")) {
			return false;
		}
		return true;
	}

}
