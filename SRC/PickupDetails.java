import java.time.LocalDate;

/**
 * Represents details regarding car pickup by the client.
 */
public class PickupDetails {
    /** The standard branch location where pickup occurs. */
    private String pickupBranch;
    /** The designated date of the pickup. */
    private LocalDate pickupDate;
    /** Any special instructions or preferences for pickup. */
    private String specialInstructions;

    /**
     * Constructs a new set of PickupDetails.
     *
     * @param pickupBranch        the designated pickup branch
     * @param pickupDate          the designated pickup date
     * @param specialInstructions the special instructions
     */
    public PickupDetails(String pickupBranch, LocalDate pickupDate, String specialInstructions) {
        this.pickupBranch = pickupBranch;
        this.pickupDate = pickupDate;
        this.specialInstructions = specialInstructions;
    }

    /**
     * Gets the pickup branch.
     *
     * @return the pickup branch
     */
    public String getPickupBranch() {
        return pickupBranch;
    }

    /**
     * Sets the pickup branch.
     *
     * @param pickupBranch the pickup branch
     */
    public void setPickupBranch(String pickupBranch) {
        this.pickupBranch = pickupBranch;
    }

    /**
     * Gets the pickup date.
     *
     * @return the pickup date
     */
    public LocalDate getPickupDate() {
        return pickupDate;
    }

    /**
     * Sets the pickup date.
     *
     * @param pickupDate the pickup date
     */
    public void setPickupDate(LocalDate pickupDate) {
        this.pickupDate = pickupDate;
    }

    /**
     * Gets any special instructions.
     *
     * @return the special instructions
     */
    public String getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Sets any special instructions.
     *
     * @param specialInstructions the special instructions
     */
    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    /**
     * Returns a string representation of the pickup details.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PickupDetails{" +
                "pickupBranch='" + pickupBranch + '\'' +
                ", pickupDate=" + pickupDate +
                ", specialInstructions='" + specialInstructions + '\'' +
                '}';
    }
}
