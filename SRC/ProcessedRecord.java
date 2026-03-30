/**
 * Represents a processed booking record, extending the base BookingRecord.
 */
public class ProcessedRecord extends BookingRecord {
    /** The specific insurance option chosen for this booking. */
    private InsuranceOption insuranceOption;
    /** The specific discount applied to this booking. */
    private Discount discount;
    /** The calculated deposit required for the rental. */
    private double depositRequired;

    /**
     * Constructs a new ProcessedRecord.
     *
     * @param client          the client
     * @param car             the car
     * @param agent           the agent
     * @param startDate       the start date
     * @param endDate         the end date
     * @param baseCost        the base rental cost
     * @param insuranceOption the chosen insurance option
     * @param discount        the applied discount
     * @param depositRequired the required deposit
     */
    public ProcessedRecord(Client client, Car car, Agent agent, String startDate, String endDate, double baseCost,
                           InsuranceOption insuranceOption, Discount discount, double depositRequired) {
        super(client, car, agent, startDate, endDate, baseCost);
        this.insuranceOption = insuranceOption;
        this.discount = discount;
        this.depositRequired = depositRequired;
    }

    /**
     * Gets the chosen insurance option.
     *
     * @return the insurance option
     */
    public InsuranceOption getInsuranceOption() {
        return insuranceOption;
    }

    /**
     * Sets the chosen insurance option.
     *
     * @param insuranceOption the insurance option
     */
    public void setInsuranceOption(InsuranceOption insuranceOption) {
        this.insuranceOption = insuranceOption;
    }

    /**
     * Gets the applied discount.
     *
     * @return the discount
     */
    public Discount getDiscount() {
        return discount;
    }

    /**
     * Sets the applied discount.
     *
     * @param discount the discount
     */
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    /**
     * Gets the required deposit amount.
     *
     * @return the deposit required
     */
    public double getDepositRequired() {
        return depositRequired;
    }

    /**
     * Sets the required deposit amount.
     *
     * @param depositRequired the deposit required
     */
    public void setDepositRequired(double depositRequired) {
        this.depositRequired = depositRequired;
    }

    /**
     * Returns a string representation of the processed record.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "ProcessedRecord{" +
                "client=" + getClient() +
                ", car=" + getCar() +
                ", agent=" + getAgent() +
                ", startDate='" + getStartDate() + '\'' +
                ", endDate='" + getEndDate() + '\'' +
                ", baseCost=" + getBaseCost() +
                ", insuranceOption=" + insuranceOption +
                ", discount=" + discount +
                ", depositRequired=" + depositRequired +
                '}';
    }
}
