package se.joshua.spring.aspects;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 *
 * https://www.mkyong.com/spring/spring-aop-examples-advice/
 */
public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aspects-tutotial.xml");
        Camera camera = (Camera) context.getBean("camera");

        camera.snap();

        context.close();

    }
}
