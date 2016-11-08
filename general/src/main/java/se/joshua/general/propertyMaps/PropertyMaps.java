package se.joshua.general.propertyMaps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class PropertyMaps {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("property-maps.xml");


        PersonMaps personMaps = (PersonMaps) context.getBean("personMaps");

        System.out.println(personMaps.toString());
    }
}
