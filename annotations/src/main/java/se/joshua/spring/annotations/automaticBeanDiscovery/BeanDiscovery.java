package se.joshua.spring.annotations.automaticBeanDiscovery;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class BeanDiscovery {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-discovery-logger.xml");

        LoggerBeanDiscovery loggerBeanDiscovery =(LoggerBeanDiscovery)context.getBean("beanDiscovery");


        loggerBeanDiscovery.writeConsole("hej");
    }
}
