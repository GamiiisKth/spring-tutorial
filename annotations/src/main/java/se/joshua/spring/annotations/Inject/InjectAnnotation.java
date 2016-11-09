package se.joshua.spring.annotations.Inject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class InjectAnnotation {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-logger.xml");

        LoggerInject loggerInject = (LoggerInject) context.getBean("logger");

        loggerInject.writeFile("hello inject you are using @Inject annotation to inject writeFile ");
        loggerInject.writeConsole("hello inject you are using @Inject annotation to inject writeConsole ");

    }
}
