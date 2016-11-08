package se.joshua.general.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import se.joshua.general.Person;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class BeanScope {


    public static void main(String[] args) {


        singletonOrPrototype();

    }


    public static void singletonOrPrototype( ) {

            /**
             * Because the person is singleton, it's doesn't matter how many instances of person we have
             * all person will be stay same, just to changed behaviour we need changed scope to prototype
             */

            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");

            Person person1 = (Person) context.getBean("person");
            Person person2 = (Person) context.getBean("person");


            person2.setSsn(2222);
            System.out.println(person1);
            System.out.println(person2);


    }


}
