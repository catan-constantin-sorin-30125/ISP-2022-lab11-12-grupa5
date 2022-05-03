package aut.utcluj.isp.ex4;

public class SalaryInfo {
    private Double totalRevenue;
    private Double monthlyRevenue;

    /**
     * If is not positive, an {@link NegativeAmountException} exception should be thrown
     *
     * @param monthlyRevenue
     */
    public SalaryInfo(Double monthlyRevenue) {
        this.monthlyRevenue = monthlyRevenue;
    }

    /**
     * Add incoming salary to total revenue
     */
    public void addSalary() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Add certain amount of money as bonus
     * If is not positive, an {@link NegativeAmountException} exception should be thrown
     *
     * @param value - money to be added
     */
    public void addMoney(final Double value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Pay certain amount of money as tax
     * If is not positive, an {@link NegativeAmountException} exception should be thrown
     * If not enough revenue found, an {@link NegativeBalanceException } exception should be thrown
     *
     * @param value - value to be paid
     */
    public void payTax(final Double value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Double getTotalRevenue() {
        return totalRevenue;
    }

    public Double getMonthlyRevenue() {
        return monthlyRevenue;
    }
}
