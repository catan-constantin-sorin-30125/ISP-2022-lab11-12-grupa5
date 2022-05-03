package aut.utcluj.isp.ex1;

/**
 * @author stefan
 */
public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName) {
        this.lastName = "";
        this.firstName=firstName;
    }

    public Person(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName=firstName;    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
