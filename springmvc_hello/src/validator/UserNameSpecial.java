package validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UserNameSpecialValidator.class)
@Documented
public @interface UserNameSpecial {
	
	// 添加username属性，可以作为校验时的条件，如果不需要，可去掉
	String username();
	
	String message() default "用户名必须唯一";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * 定义List，为了让Bean的一个属性上可以添加多套规则
     */
    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
        UserNameSpecial[] value();
    }
    
}
