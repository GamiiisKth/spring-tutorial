package se.joshua.spring.general.listProperties;

import java.util.List;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class PersonList {

    private String firstName;
    private String lastName;

    private List<String> persons;


    public PersonList() {
    }

    public PersonList(String firstName, String lastName, List<String> persons) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.persons = persons;

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void onCreate() {
        // 'this' will be converted to toString of the person instance
        System.out.println("init-method\n Person created" + this);
    }

    public void onDestroy() {
        // 'this' will be converted to toString of the person instance
        System.out.println("Destroy-method\n Person destroyed" + this);
    }

    @Override
    public String toString() {
        return "PersonList{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", persons=" + persons +
                '}';
    }
}
