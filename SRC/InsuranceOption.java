/**
 * Represents an extra insurance option added to a booking.
 */
public class InsuranceOption {
    /** The specific type of insurance (e.g., standard, premium). */
    private String insuranceType;
    /** The added cost for this insurance option. */
    private double insuranceCost;
    /** The provider name for this specific package. */
    private String provider;

    /**
     * Constructs a new InsuranceOption.
     *
     * @param insuranceType the type
     * @param insuranceCost the cost
     * @param provider      the provider
     */
    public InsuranceOption(String insuranceType, double insuranceCost, String provider) {
        this.insuranceType = insuranceType;
        this.insuranceCost = insuranceCost;
        this.provider = provider;
    }

    /**
     * Gets the insurance type.
     *
     * @return the type
     */
    public String getInsuranceType() {
        return insuranceType;
    }

    /**
     * Sets the insurance type.
     *
     * @param insuranceType the type
     */
    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    /**
     * Gets the insurance cost.
     *
     * @return the cost
     */
    public double getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * Sets the insurance cost.
     *
     * @param insuranceCost the cost
     */
    public void setInsuranceCost(double insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    /**
     * Gets the provider name.
     *
     * @return the provider
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Sets the provider name.
     *
     * @param provider the provider
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * Returns a string representation of the insurance option.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "InsuranceOption{" +
                "insuranceType='" + insuranceType + '\'' +
                ", insuranceCost=" + insuranceCost +
                ", provider='" + provider + '\'' +
                '}';
    }
}
