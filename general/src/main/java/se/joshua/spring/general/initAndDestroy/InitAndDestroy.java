package se.joshua.spring.general.initAndDestroy;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import se.joshua.spring.general.Person;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class InitAndDestroy implements AutoCloseable {

private static  ClassPathXmlApplicationContext context;
    public static void main(String[] args) {


        intiAndDestroy();

    }


    public static void intiAndDestroy( ) {

            /**
             * Because the person is singleton, it's doesn't matter how many instances of person we have
             * all person will be stay same, just to changed behaviour we need changed scope to prototype
             */

             context = new ClassPathXmlApplicationContext("inti-and-destroy.xml");

            Person person1 = (Person) context.getBean("person");

        //  just run it


    }


    public void close() throws Exception {
        context.close();

    }
}
