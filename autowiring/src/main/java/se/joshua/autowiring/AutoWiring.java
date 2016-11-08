package se.joshua.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class AutoWiring {


    public static void main(String[] args) {


        ClassPathXmlApplicationContext  context= new ClassPathXmlApplicationContext("autowring-logger.xml");

      Logger logger=  (Logger)context.getBean("logger");


        logger.writeFile("hello file writer, your instance has been injected to Logger by autowiring\n");
        logger.writeConsole("hello console writer, your instance has been injected to Logger by autowiring");

    }
}
