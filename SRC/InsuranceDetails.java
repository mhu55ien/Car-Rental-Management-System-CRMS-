/**
 * Represents standard insurance details applicable to a rental car.
 */
public class InsuranceDetails {
    /** The insurance provider name. */
    private String provider;
    /** The base coverage option (e.g., comprehensive, third-party). */
    private String coverageOption;
    /** Any additional add-ons included (e.g., premium cover, accident protection). */
    private String addOns;

    /**
     * Constructs new InsuranceDetails.
     *
     * @param provider       the insurance provider
     * @param coverageOption the coverage option
     * @param addOns         the specific add-ons
     */
    public InsuranceDetails(String provider, String coverageOption, String addOns) {
        this.provider = provider;
        this.coverageOption = coverageOption;
        this.addOns = addOns;
    }

    /**
     * Gets the insurance provider.
     *
     * @return the provider name
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Sets the insurance provider.
     *
     * @param provider the provider name
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * Gets the base coverage option.
     *
     * @return the coverage option
     */
    public String getCoverageOption() {
        return coverageOption;
    }

    /**
     * Sets the base coverage option.
     *
     * @param coverageOption the coverage option
     */
    public void setCoverageOption(String coverageOption) {
        this.coverageOption = coverageOption;
    }

    /**
     * Gets the active add-ons.
     *
     * @return the add-ons
     */
    public String getAddOns() {
        return addOns;
    }

    /**
     * Sets the active add-ons.
     *
     * @param addOns the add-ons
     */
    public void setAddOns(String addOns) {
        this.addOns = addOns;
    }

    /**
     * Returns a string representation of the insurance details.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "InsuranceDetails{" +
                "provider='" + provider + '\'' +
                ", coverageOption='" + coverageOption + '\'' +
                ", addOns='" + addOns + '\'' +
                '}';
    }
}
