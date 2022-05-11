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
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.cnp = cnp;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
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
