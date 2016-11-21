package se.joshua.spring.web.util;

import org.apache.commons.validator.routines.EmailValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */


public class ValidEmailImpl implements ConstraintValidator<ValidEmail, String> {

    private int min;

    @Override
    public void initialize(ValidEmail validEmail) {
        min = validEmail.min();
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return email.length() >= min && EmailValidator.getInstance(false).isValid(email);
    }
}
