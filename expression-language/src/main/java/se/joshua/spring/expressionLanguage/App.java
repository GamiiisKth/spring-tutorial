package se.joshua.spring.expressionLanguage;

/**
 * @author Ali Yusha {@literal <mailto:Ali.yusha@so4it.com/>}
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("expression-language.xml");

        Robot robot = (Robot) context.getBean("robot");

        robot.speak();

        ((ClassPathXmlApplicationContext) context).close();
    }

}
