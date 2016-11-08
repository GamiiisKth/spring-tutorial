package se.joshua.general.factoryBeanAndMethod;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class PersonFactory {


    public Person createPerson(String firstName, String lastName) {
        System.out.println("using factory bean to create person");
        return new Person(firstName, lastName);
    }
}
