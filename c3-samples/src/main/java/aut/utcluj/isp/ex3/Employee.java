package aut.utcluj.isp.ex3;

/**
 * @author stefan
 */
public class Employee {
    private String firstName;
    private String lastName;
    private Double salary;
    private String cnp;

    public Employee(String firstName, String lastName, Double salary, String cnp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public String getCnp() {
        return cnp;
    }
}
