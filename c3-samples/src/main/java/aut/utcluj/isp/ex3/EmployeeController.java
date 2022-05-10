package aut.utcluj.isp.ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author stefan
 */
public class EmployeeController {
    ArrayList<Employee> EmployeeList = new ArrayList<>();
    /**
     * Add new employee to the list of employees
     *
     * @param employee - employee information
     */
    public void addEmployee(final Employee employee) {
        EmployeeList.add(new Employee("Marcel", "Maitare", 6900.00 , "5010404060023" ));
    }

    /**
     * Get employee by cnp
     *
     * @param cnp - unique cnp
     * @return found employee or null if not found
     */
    public Employee getEmployeeByCnp(final String cnp) {
        Employee ByCnp = EmployeeList.stream()
                .filter(Employee -> cnp.equals(Employee.getCnp()))
                .findAny()
                .orElse(null);
        return ByCnp;
    }

    /**
     * Update employee salary by cnp
     *
     * @param cnp    - unique cnp
     * @param salary - salary
     * @return updated employee
     */
    public Employee updateEmployeeSalaryByCnp(final String cnp, final Double salary) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Delete employee by cnp
     *
     * @param cnp - unique cnp
     * @return deleted employee or null if not found
     */
    public Employee deleteEmployeeByCnp(final String cnp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Return current list of employees
     *
     * @return current list of employees
     */
    public List<Employee> getEmployees() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Get number of employees
     *
     * @return - number of registered employees
     */
    public int getNumberOfEmployees() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
