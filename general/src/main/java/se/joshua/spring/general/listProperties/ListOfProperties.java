package se.joshua.spring.general.listProperties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class ListOfProperties {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("list-properties.xml");

        PersonList personList=(PersonList) context.getBean("persons");

        System.out.println(personList );
    }
}
