package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public class Employee implements IdentityManager{
    private String firstName;
    private String lastName;
    private String cnp;
    private SalaryInfo employeeSalaryInfo;

    public Employee(String firstName, String lastName, String cnp, Double monthlyRevenue) throws NegativeAmountException {
        try {
            employeeSalaryInfo = new SalaryInfo(monthlyRevenue);
            this.firstName = firstName;
            this.lastName = lastName;
            this.cnp = cnp;
        }
        catch (NegativeAmountException e)
        {
            System.out.println("Salary can't be negative");
        }
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
        employeeSalaryInfo.addSalary();
    }

    /**
     * Add money as bonus to the employee
     * Value added should be positive
     *
     * @param money - money to be added
     */
    public void addMoney(final Double money) throws NegativeAmountException {
        employeeSalaryInfo.addMoney(money);
    }

    /**
     * Pay tax from salary
     *
     * @param tax - tax to be paid
     */
    public void payTax(final Double tax) throws NegativeAmountException, NegativeBalanceException {
        employeeSalaryInfo.payTax(tax);
    }

    /**
     * Get salary info
     *
     * @return salary info
     */
    public SalaryInfo getSalaryInfo() {
        return employeeSalaryInfo;
    }

    @Override
    public String getIdentity() {
        return firstName+"_"+lastName+"_"+cnp;
    }
}
