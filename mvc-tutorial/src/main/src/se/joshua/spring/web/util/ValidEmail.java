package se.joshua.spring.web.util;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Size;
import java.lang.annotation.*;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented

@Constraint(validatedBy = se.joshua.spring.web.util.ValidEmailImpl.class)
public @interface  ValidEmail {

    String message() default "this is not appear to be a valid email address";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int min() default 5;
}
