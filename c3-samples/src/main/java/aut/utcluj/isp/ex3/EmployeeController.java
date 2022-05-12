package aut.utcluj.isp.ex3;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @author stefan
 */
public class EmployeeController extends AbstractTableModel {
    private String[] columns = new String[] {"First Name","Last Name","CNP","Salary"};
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

    @Override
    public int getRowCount() {
        return EmployeeList.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Employee employee = EmployeeList.get(rowIndex);
        
        switch(columnIndex){
            case 0:return employee.getFirstName();
            case 1:return employee.getLastName();
            case 2:return employee.getCnp();
            case 3:return employee.getSalary();
            
        }
        return "N/A";
    }
    @Override
    public String getColumnName(int index) {
        return columns[index];
    }
}
