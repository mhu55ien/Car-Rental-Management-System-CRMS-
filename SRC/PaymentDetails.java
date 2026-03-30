/**
 * Represents the structured payment details for a finalized booking.
 */
public class PaymentDetails {
    /** The expected or paid deposit amount. */
    private double depositAmount;
    /** The total cost of the rental including all fees and discounts. */
    private double totalRentalCost;
    /** The outstanding balance left to be paid. */
    private double outstandingBalance;
    /** The current payment status (e.g., Pending, Completed). */
    private String paymentStatus;

    /**
     * Constructs a new set of PaymentDetails.
     *
     * @param depositAmount      the deposit amount
     * @param totalRentalCost    the total overall cost
     * @param outstandingBalance the outstanding balance
     * @param paymentStatus      the payment status string
     */
    public PaymentDetails(double depositAmount, double totalRentalCost, double outstandingBalance, String paymentStatus) {
        this.depositAmount = depositAmount;
        this.totalRentalCost = totalRentalCost;
        this.outstandingBalance = outstandingBalance;
        this.paymentStatus = paymentStatus;
    }

    /**
     * Gets the deposit amount.
     *
     * @return the deposit amount
     */
    public double getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the deposit amount.
     *
     * @param depositAmount the deposit amount
     */
    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    /**
     * Gets the total rental cost.
     *
     * @return the total cost
     */
    public double getTotalRentalCost() {
        return totalRentalCost;
    }

    /**
     * Sets the total rental cost.
     *
     * @param totalRentalCost the total cost
     */
    public void setTotalRentalCost(double totalRentalCost) {
        this.totalRentalCost = totalRentalCost;
    }

    /**
     * Gets the outstanding balance.
     *
     * @return the outstanding balance
     */
    public double getOutstandingBalance() {
        return outstandingBalance;
    }

    /**
     * Sets the outstanding balance.
     *
     * @param outstandingBalance the outstanding balance
     */
    public void setOutstandingBalance(double outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }

    /**
     * Gets the payment status.
     *
     * @return the payment status
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the payment status.
     *
     * @param paymentStatus the payment status
     */
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    /**
     * Returns a string representation of the payment details.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PaymentDetails{" +
                "depositAmount=" + depositAmount +
                ", totalRentalCost=" + totalRentalCost +
                ", outstandingBalance=" + outstandingBalance +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
