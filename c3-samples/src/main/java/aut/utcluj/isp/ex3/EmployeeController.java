package aut.utcluj.isp.ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author stefan
 */
public class EmployeeController {
    List<Employee> EmployeeList = new ArrayList<>();
    /**
     * Add new employee to the list of employees
     *
     * @param employee - employee information
     */
    public void addEmployee(final Employee employee) {
        EmployeeList.add(employee);
    }

    /**
     * Get employee by cnp
     *
     * @param cnp - unique cnp
     * @return found employee or null if not found
     */
    public Employee getEmployeeByCnp(final String cnp) {
        return EmployeeList.stream()
                .filter(Employee -> cnp.equals(Employee.getCnp()))
                .findAny()
                .orElse(null);
    }

    /**
     * Update employee salary by cnp
     *
     * @param cnp    - unique cnp
     * @param salary - salary
     * @return updated employee
     */
    public Employee updateEmployeeSalaryByCnp(final String cnp, final Double salary) {
        Employee UpdatedEmployeeByCnp = EmployeeList.stream()
                .filter(Employee -> cnp.equals(Employee.getCnp()))
                .findAny()
                .orElse(null);

        if (UpdatedEmployeeByCnp != null)
            UpdatedEmployeeByCnp.setSalary(salary);
        return UpdatedEmployeeByCnp;
    }

    /**
     * Delete employee by cnp
     *
     * @param cnp - unique cnp
     * @return deleted employee or null if not found
     */
    public Employee deleteEmployeeByCnp(final String cnp) {
        Employee EmployeeByCnp = EmployeeList.stream()
                .filter(Employee -> cnp.equals(Employee.getCnp()))
                .findAny()
                .orElse(null);
        EmployeeList.remove(EmployeeByCnp);
        return EmployeeByCnp;
    }

    /**
     * Return current list of employees
     *
     * @return current list of employees
     */
    public List<Employee> getEmployees() {
        return EmployeeList;
    }

    /**
     * Get number of employees
     *
     * @return - number of registered employees
     */
    public int getNumberOfEmployees() {
        return EmployeeList.size();
    }
}
