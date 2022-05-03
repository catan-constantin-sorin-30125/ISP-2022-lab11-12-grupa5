package aut.utcluj.isp.ex3;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * @author stefan
 */
public class EmployeeControllerTest {

    @Test
    public void testAddEmployee() {
        final Employee employee = new Employee("Harvey", "Specter", 2000d, "1861216244480");
        final EmployeeController employeeController = new EmployeeController();
        employeeController.addEmployee(employee);

        assertEquals("Number of created employees to be one", 1, employeeController.getNumberOfEmployees());
    }

    @Test
    public void testGetEmployeeByCnp() {
        final Employee employee = new Employee("Harvey", "Specter", 2000d, "1861216244480");
        final EmployeeController employeeController = new EmployeeController();
        employeeController.addEmployee(employee);
        employeeController.addEmployee(new Employee("John", "Wick", 2000d, "1851216244480"));

        final Employee notFoundEmployee = employeeController.getEmployeeByCnp("1861216244481");
        assertNull("No employee should be found", notFoundEmployee);

        final Employee foundEmployee = employeeController.getEmployeeByCnp("1861216244480");
        assertNotNull("Employee should be found", foundEmployee);
        assertEquals("Employee information should be the same", employee, foundEmployee);
    }

    @Test
    public void testUpdateEmployeeSalaryByCnp() {
        final EmployeeController employeeController = new EmployeeController();
        employeeController.addEmployee(new Employee("Harvey", "Specter", 2000d, "1861216244480"));
        employeeController.addEmployee(new Employee("John", "Wick", 3000d, "1851216244480"));

        final Employee notFoundEmployee = employeeController.updateEmployeeSalaryByCnp("1861216244481", 100d);
        assertNull("No employee should be updated", notFoundEmployee);

        final Employee updatedEmployee = employeeController.updateEmployeeSalaryByCnp("1861216244480", 300d);
        assertNotNull("Updated employee should not be null", updatedEmployee);
        assertEquals("CNP should be the same", "1861216244480", updatedEmployee.getCnp());
        assertEquals("Salary should be the new one", Double.valueOf(300d), updatedEmployee.getSalary());
    }

    @Test
    public void testDeleteEmployeeByCnp() {
        final Employee employee = new Employee("Harvey", "Specter", 2000d, "1861216244480");
        final EmployeeController employeeController = new EmployeeController();
        employeeController.addEmployee(new Employee("John", "Wick", 2000d, "1851216244480"));
        employeeController.addEmployee(employee);

        assertEquals("Two employees should be found", 2, employeeController.getNumberOfEmployees());

        final Employee notFoundEmployee = employeeController.deleteEmployeeByCnp("2851216244480");
        assertNull("Deleted employee should be null", notFoundEmployee);

        final String cnpToBeDeleted = "1851216244480";
        final Employee deletedEmployee = employeeController.deleteEmployeeByCnp(cnpToBeDeleted);
        assertNotNull("Deleted employee should not be null", deletedEmployee);
        assertEquals("One employee remained", 1, employeeController.getNumberOfEmployees());
        assertNull("Employee should not be found anymore", employeeController.getEmployeeByCnp(cnpToBeDeleted));
    }

    @Test
    public void testGetEmployees() {
        final EmployeeController employeeController = new EmployeeController();
        employeeController.addEmployee(new Employee("Harvey", "Specter", 2000d, "1861216244480"));
        employeeController.addEmployee(new Employee("John", "Wick", 3000d, "1851216244480"));

        final List<Employee> employees = employeeController.getEmployees();
        assertEquals("Two employees should be found", 2, employees.size());
        assertEquals("First employee name should be 'Harvey'", "Harvey", employees.get(0).getFirstName());
        assertEquals("First employee last name should be 'Specter'", "Specter", employees.get(0).getLastName());
        assertEquals("First employee salary should be 2000", Double.valueOf(2000), employees.get(0).getSalary());
        assertEquals("Second employee name should be 'Harvey'", "John", employees.get(1).getFirstName());
        assertEquals("Second employee last name should be 'Specter'", "Wick", employees.get(1).getLastName());
        assertEquals("Second employee salary should be 2000", Double.valueOf(3000), employees.get(1).getSalary());
    }
}