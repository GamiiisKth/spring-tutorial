package se.joshua.spring.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class AutoWiring {


    public static void main(String[] args) {

        autoWiringByName();

        //autoWiringByType();
    }


    public static void autoWiringByName() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowiring-logger.xml");

        LoggerByName loggerByName = (LoggerByName) context.getBean("loggerByName");

        loggerByName.writeFile("hello file writer, your instance has been injected to LoggerByName by autowiring\n");
        loggerByName.writeConsole("hello console writer, your instance has been injected to LoggerByName by autowiring");

    }

    public static void autoWiringByType() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowiring-logger.xml");

        LoggerByType loggerByType = (LoggerByType) context.getBean("loggerByType");


        loggerByType.writeFile("hello file writer, your instance has been injected to LoggerByType by autowiring\n");
        loggerByType.writeConsole("hello console writer, your instance has been injected to LoggerByType by autowiring");

    }
}
