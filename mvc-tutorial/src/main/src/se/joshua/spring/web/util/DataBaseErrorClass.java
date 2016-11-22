package se.joshua.spring.web.util;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 *
 * http://viralpatel.net/blogs/spring-mvc-exception-handling-controlleradvice-annotation/
 *
 * @ControllerAdvice  This annotation is used to define

 *
 * @ExceptionHandler,
 * @InitBinder,
 * @ModelAttribute
 * methods that apply to all @RequestMapping methods.

 */

@ControllerAdvice
public class DataBaseErrorClass {

    @ExceptionHandler(DataAccessException.class)
    public String handleDataBaseException(DataAccessException e) {
        return "error";
    }

}
