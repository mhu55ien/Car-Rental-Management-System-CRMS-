/**
 * Represents the license details of a driver.
 */
public class LicenseDetails {
    /** The driver's license number. */
    private String licenseNumber;
    /** The validity period of the license. */
    private String validityPeriod;
    /** Any restrictions on the license. */
    private String restrictions;

    /**
     * Constructs new LicenseDetails.
     *
     * @param licenseNumber  the license number
     * @param validityPeriod the validity period
     * @param restrictions   any restrictions on the license
     */
    public LicenseDetails(String licenseNumber, String validityPeriod, String restrictions) {
        this.licenseNumber = licenseNumber;
        this.validityPeriod = validityPeriod;
        this.restrictions = restrictions;
    }

    /**
     * Gets the license number.
     *
     * @return the license number
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the license number.
     *
     * @param licenseNumber the license number
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    /**
     * Gets the validity period.
     *
     * @return the validity period
     */
    public String getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the validity period.
     *
     * @param validityPeriod the validity period
     */
    public void setValidityPeriod(String validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    /**
     * Gets the license restrictions.
     *
     * @return the restrictions
     */
    public String getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the license restrictions.
     *
     * @param restrictions the restrictions
     */
    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * Returns a string representation of the license details.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "LicenseDetails{" +
                "licenseNumber='" + licenseNumber + '\'' +
                ", validityPeriod='" + validityPeriod + '\'' +
                ", restrictions='" + restrictions + '\'' +
                '}';
    }
}
