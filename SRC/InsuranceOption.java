/**
 * Represents the insurance applied to a booking.
 * Details the type of insurance and its additional extra cost.
 */
public class InsuranceOption {
    /** The type of insurance (e.g., standard, premium). */
    private String type;
    /** The extra cost incurred by this insurance option. */
    private double extraCost;

    /**
     * Constructs a new InsuranceOption.
     *
     * @param type      the type of insurance
     * @param extraCost the extra cost for this insurance
     */
    public InsuranceOption(String type, double extraCost) {
        this.type = type;
        this.extraCost = extraCost;
    }

    /**
     * Gets the type of insurance.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of insurance.
     *
     * @param type the new type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the extra cost for the insurance.
     *
     * @return the extra cost
     */
    public double getExtraCost() {
        return extraCost;
    }

    /**
     * Sets the extra cost for the insurance.
     *
     * @param extraCost the new extra cost
     */
    public void setExtraCost(double extraCost) {
        this.extraCost = extraCost;
    }

    /**
     * Returns a string representation of the insurance option.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "InsuranceOption {" +
                "Type='" + type + '\'' +
                ", ExtraCost=$" + String.format("%.2f", extraCost) +
                '}';
    }
}
