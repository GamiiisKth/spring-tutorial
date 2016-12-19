package se.joshua.spring.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 *         <p>
 *         https://www.mkyong.com/spring/spring-aop-examples-advice/
 */

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aspects-tutotial.xml");
        Camera camera = (Camera) context.getBean("camera");

        camera.snap();

        //camera.snap(1000);

        context.close();

    }
}
