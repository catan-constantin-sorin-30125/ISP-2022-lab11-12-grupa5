package aut.utcluj.isp.ex4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * @author stefan
 */
public class EmployeeTest {
    @Test
    public void testAddSalary() {
        final Employee employee = new Employee("Harvey", "Specter", "1931216244480", 300d);
        assertEquals("Salary should be 0", Double.valueOf(0d), employee.getSalaryInfo().getTotalRevenue());

        employee.addSalary();
        assertEquals("Salary should be 300", Double.valueOf(300d), employee.getSalaryInfo().getMonthlyRevenue());
    }

    @Test
    public void testAddMoney() {
        final Employee employee = new Employee("Harvey", "Specter", "1931216244480", 300d);
        assertEquals("Salary should be 0", Double.valueOf(0d), employee.getSalaryInfo().getTotalRevenue());

        employee.addMoney(100d);
        assertEquals("Salary should be 100", Double.valueOf(100d), employee.getSalaryInfo().getTotalRevenue());
    }

    @Test
    public void testPayTax() {
        final Employee employee = new Employee("Harvey", "Specter", "1931216244480", 300d);
        employee.addMoney(100d);
        assertEquals("Salary should be 100", Double.valueOf(100d), employee.getSalaryInfo().getTotalRevenue());

        employee.payTax(50d);
        assertEquals("Salary should be 50", Double.valueOf(50d), employee.getSalaryInfo().getTotalRevenue());
    }

    @Test
    public void testEmployeeIsIdentityManagerInstance() {
        final Employee employee = new Employee("Harvey", "Specter", "1931216244480", 200D);
        try {
            final String identity = ((IdentityManager)employee).getIdentity();
            assertEquals("Identity should be returned", "Harvey_Specter_1931216244480", identity);
        } catch (ClassCastException ex) {
            fail("Should not fail the cast");
        }
    }
}