import java.time.LocalDate;

/**
 * Represents a processed booking record that strictly extends the base BookingRecord.
 * Includes additional processing details like insurance and discount,
 * and calculates the updated final total cost.
 */
public class ProcessedRecord extends BookingRecord {
    /** The specific insurance option chosen for this booking. */
    private InsuranceOption insuranceOption;
    /** The specific discount applied to this booking. */
    private Discount discount;

    /**
     * Constructs a new ProcessedRecord using the parent class constructor and additional details.
     *
     * @param client          the booking client
     * @param car             the requested car
     * @param agent           the managing agent
     * @param startDate       the start date of the rental
     * @param endDate         the end date of the rental
     * @param baseCost        the base rental cost
     * @param insuranceOption the chosen insurance option
     * @param discount        the applied discount
     */
    public ProcessedRecord(Client client, Car car, Agent agent, LocalDate startDate, LocalDate endDate, double baseCost,
                           InsuranceOption insuranceOption, Discount discount) {
        super(client, car, agent, startDate, endDate, baseCost);
        this.insuranceOption = insuranceOption;
        this.discount = discount;
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
     * @param insuranceOption the new insurance option
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
     * @param discount the new discount
     */
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    /**
     * Calculates the updated total cost for the rental.
     * The formula applies base cost plus insurance cost, minus the discount.
     *
     * @return the updated total calculated cost
     */
    public double calculateUpdatedTotalCost() {
        double costBeforeDiscount = getBaseCost();
        
        if (insuranceOption != null) {
            costBeforeDiscount += insuranceOption.getExtraCost();
        }

        double discountValue = 0.0;
        if (discount != null) {
            if (discount.isPercentage()) {
                // E.g., a 10% discount on $100 -> $10 deduction
                discountValue = costBeforeDiscount * (discount.getAmount() / 100.0);
            } else {
                // Flat amount deduction
                discountValue = discount.getAmount();
            }
        }

        return costBeforeDiscount - discountValue;
    }

    /**
     * Returns an overridden string representation of the processed record.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "ProcessedRecord {" +
                "BookingDetails=" + super.toString() +
                ", InsuranceOption=" + (insuranceOption != null ? insuranceOption.toString() : "None") +
                ", Discount=" + (discount != null ? discount.toString() : "None") +
                ", UpdatedTotalCost=$" + String.format("%.2f", calculateUpdatedTotalCost()) +
                '}';
    }
}
