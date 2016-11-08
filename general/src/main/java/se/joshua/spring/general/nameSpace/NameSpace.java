package se.joshua.spring.general.nameSpace;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class NameSpace {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("name-space.xml");

       Person person=(Person) context.getBean("spacePerson");

        System.out.println(person);

    }
}
