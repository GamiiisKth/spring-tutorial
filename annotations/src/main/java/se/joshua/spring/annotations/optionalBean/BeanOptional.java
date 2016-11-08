package se.joshua.spring.annotations.optionalBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class BeanOptional {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("optional-bean-logger.xml");

        LoggerBeanOptional loggerBeanOptional =( LoggerBeanOptional)context.getBean("logger");

        loggerBeanOptional.writeFile("hello fileWriter you are a required bean which  must be exist in xml");

        // remove comment and the you will see it's not will work because it's hasn't been created in xml
       // loggerBeanOptional.writeConsole("hello fileWriter you are a required bean which  must be exist in xml");

    }
}
