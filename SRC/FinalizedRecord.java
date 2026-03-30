/**
 * Represents a fully finalized booking record, incorporating payment and pickup details.
 */
public class FinalizedRecord extends ProcessedRecord {
    /** The validated payment details. */
    private PaymentDetails paymentDetails;
    /** The designated pickup details. */
    private PickupDetails pickupDetails;

    /**
     * Constructs a new FinalizedRecord.
     *
     * @param client          the specific client
     * @param car             the chosen car
     * @param agent           the assigned agent
     * @param startDate       the chosen start date
     * @param endDate         the end date
     * @param baseCost        the calculated base cost
     * @param insuranceOption the requested insurance options
     * @param discount        the requested overall discount
     * @param depositRequired the specific deposit required
     * @param paymentDetails  the payment details structured object
     * @param pickupDetails   the pickup parameters
     */
    public FinalizedRecord(Client client, Car car, Agent agent, String startDate, String endDate, double baseCost,
                           InsuranceOption insuranceOption, Discount discount, double depositRequired,
                           PaymentDetails paymentDetails, PickupDetails pickupDetails) {
        super(client, car, agent, startDate, endDate, baseCost, insuranceOption, discount, depositRequired);
        this.paymentDetails = paymentDetails;
        this.pickupDetails = pickupDetails;
    }

    /**
     * Gets the payment details.
     *
     * @return the payment details
     */
    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the payment details.
     *
     * @param paymentDetails the structured payment details
     */
    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    /**
     * Gets the pickup details.
     *
     * @return the pickup details
     */
    public PickupDetails getPickupDetails() {
        return pickupDetails;
    }

    /**
     * Sets the pickup details.
     *
     * @param pickupDetails the pickup details
     */
    public void setPickupDetails(PickupDetails pickupDetails) {
        this.pickupDetails = pickupDetails;
    }

    /**
     * Returns a string representation of the finalized record.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "FinalizedRecord{" +
                "client=" + getClient() +
                ", car=" + getCar() +
                ", agent=" + getAgent() +
                ", startDate='" + getStartDate() + '\'' +
                ", endDate='" + getEndDate() + '\'' +
                ", baseCost=" + getBaseCost() +
                ", insuranceOption=" + getInsuranceOption() +
                ", discount=" + getDiscount() +
                ", depositRequired=" + getDepositRequired() +
                ", paymentDetails=" + paymentDetails +
                ", pickupDetails=" + pickupDetails +
                '}';
    }
}
