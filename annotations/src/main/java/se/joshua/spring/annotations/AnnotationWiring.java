package se.joshua.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class AnnotationWiring {


    public static void main(String[] args) {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-wiring-logger.xml");
    Logger logger=(Logger)context.getBean("logger");
        logger.writeConsole("hello autowire i am console writer");
        logger.writeConsole("hello autowire i am file writer");

    }

}
