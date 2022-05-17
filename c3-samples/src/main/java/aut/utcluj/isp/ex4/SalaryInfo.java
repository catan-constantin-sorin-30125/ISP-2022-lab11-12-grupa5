package aut.utcluj.isp.ex4;

public class SalaryInfo {
    private Double totalRevenue;
    private Double monthlyRevenue;

    /**
     * If is not positive, an {@link NegativeAmountException} exception should be thrown
     *
     * @param monthlyRevenue value of the salary
     */
    public SalaryInfo(Double monthlyRevenue) throws NegativeAmountException {
        if(monthlyRevenue>=0) {
            this.monthlyRevenue = monthlyRevenue;
            this.totalRevenue = 0d ;
        }
        else
        {
            throw new NegativeAmountException();
        }
    }

    /**
     * Add incoming salary to total revenue
     */
    public void addSalary() {
        totalRevenue+=monthlyRevenue;
    }

    /**
     * Add certain amount of money as bonus
     * If is not positive, an {@link NegativeAmountException} exception should be thrown
     *
     * @param value - money to be added
     */
    public void addMoney(final Double value) throws NegativeAmountException {
        if(value>=0) {
            totalRevenue += value;
        }
        else
        {
            throw new NegativeAmountException();
        }
    }

    /**
     * Pay certain amount of money as tax
     * If is not positive, an {@link NegativeAmountException} exception should be thrown
     * If not enough revenue found, an {@link NegativeBalanceException } exception should be thrown
     *
     * @param value - value to be paid
     */
    public void payTax(final Double value) throws NegativeAmountException, NegativeBalanceException {
        if(value>=0) {
            if(totalRevenue>=value) {
                totalRevenue -= value;
            }
            else
            {
                throw new NegativeBalanceException();
            }
        }
        else
        {
            throw new NegativeAmountException();
        }
    }

    public Double getTotalRevenue() {
        return totalRevenue;
    }

    public Double getMonthlyRevenue() {
        return monthlyRevenue;
    }
}
