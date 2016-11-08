package se.joshua.spring.general.factoryBeanAndMethod;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import se.joshua.general.*;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class FactoryBeanAndMethod {


    public static void main(String[] args) {

        // getInstance method on person class which retuen a factory method of the constructor


         factoryMethod();

      //       factoryBean();

    }


    public static void factoryMethod() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("factory-bean-method.xml");

        Person person = (Person) context.getBean("person");

        System.out.println(person);

    }

    public static void factoryBean() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("factory-bean-method.xml");
        Person person = (Person) context.getBean("person2");

        System.out.println(person);


    }
}
