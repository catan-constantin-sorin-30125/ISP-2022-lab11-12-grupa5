package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String cnp;
    private SalaryInfo employeeSalaryInfo;

    public Employee(String firstName, String lastName, String cnp, Double monthlyRevenue) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCnp() {
        return cnp;
    }

    /**
     * Add salary to the employee
     */
    public void addSalary() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Add money as bonus to the employee
     * Value added should be positive
     *
     * @param money - money to be added
     */
    public void addMoney(final Double money) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Pay tax from salary
     *
     * @param tax - tax to be paid
     */
    public void payTax(final Double tax) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Get salary info
     *
     * @return salary info
     */
    public SalaryInfo getSalaryInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
