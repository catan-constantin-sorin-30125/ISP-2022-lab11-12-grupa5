package aut.utcluj.isp.ex4;

import org.junit.Test;

import static org.junit.Assert.*;

public class SalaryInfoTest {
    @Test
    public void testCreate() {
        final SalaryInfo salaryInfo = new SalaryInfo(300d);
        assertNotNull("Salary object cannot be null", salaryInfo);
        assertEquals("Revenue is 0", Double.valueOf(0d), salaryInfo.getTotalRevenue());
        assertEquals("Monthly revenue is 300", Double.valueOf(300d), salaryInfo.getMonthlyRevenue());
    }

    @Test(expected = NegativeAmountException.class)
    public void testCreateShouldThrowExceptionWhenMonthlyRevenueIsNegative() {
        new SalaryInfo(-300d);
    }

    @Test
    public void testAddSalary() {
        final SalaryInfo salaryInfo = new SalaryInfo(300d);
        assertNotNull("Salary object cannot be null", salaryInfo);
        assertEquals("Revenue is 0", Double.valueOf(0d), salaryInfo.getTotalRevenue());
        assertEquals("Monthly revenue is 300", Double.valueOf(300d), salaryInfo.getMonthlyRevenue());

        salaryInfo.addSalary();
        assertEquals("Revenue is 300", Double.valueOf(300d), salaryInfo.getTotalRevenue());

        salaryInfo.addSalary();
        assertEquals("Revenue is 600", Double.valueOf(600d), salaryInfo.getTotalRevenue());
    }

    @Test
    public void testAddMoney() {
        final SalaryInfo salaryInfo = new SalaryInfo(300d);
        assertNotNull("Salary object cannot be null", salaryInfo);
        assertEquals("Revenue is 0", Double.valueOf(0d), salaryInfo.getTotalRevenue());
        assertEquals("Monthly revenue is 300", Double.valueOf(300d), salaryInfo.getMonthlyRevenue());

        salaryInfo.addMoney(100d);
        assertEquals("Revenue is 100", Double.valueOf(100d), salaryInfo.getTotalRevenue());
    }

    @Test(expected = NegativeAmountException.class)
    public void testAddMoneyShouldThrowExceptionWhenValueIsNegative() {
        final SalaryInfo salaryInfo = new SalaryInfo(300d);
        assertNotNull("Salary object cannot be null", salaryInfo);
        assertEquals("Revenue is 0", Double.valueOf(0d), salaryInfo.getTotalRevenue());
        assertEquals("Monthly revenue is 300", Double.valueOf(300d), salaryInfo.getMonthlyRevenue());

        salaryInfo.addMoney(-100d);
    }

    @Test
    public void testPayTax() {
        final SalaryInfo salaryInfo = new SalaryInfo(300d);
        salaryInfo.addSalary();

        assertEquals("Revenue is 300", Double.valueOf(300d), salaryInfo.getTotalRevenue());
        salaryInfo.payTax(100d);
        assertEquals("Revenue is 200", Double.valueOf(200d), salaryInfo.getTotalRevenue());
    }

    @Test(expected = NegativeAmountException.class)
    public void testPayTaxShouldThrowExceptionWhenTaxIsNegative() {
        final SalaryInfo salaryInfo = new SalaryInfo(300d);
        salaryInfo.payTax(-100d);
    }

    @Test(expected = NegativeBalanceException.class)
    public void testPayTaxShouldThrowExceptionWhenNoEnoughMoneyFound() {
        final SalaryInfo salaryInfo = new SalaryInfo(300d);
        salaryInfo.payTax(100d);
    }
}