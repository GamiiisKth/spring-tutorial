package se.joshua.spring.annotations.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class QualifierSpring {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("qualifier-bean-logger.xml");

        LoggerQualifier loggerQualifier = (LoggerQualifier) context.getBean("logger");

        loggerQualifier.writeConsole("hello writeConsole you are a required bean  and has qualifier with id toConsole ");


    }
}
