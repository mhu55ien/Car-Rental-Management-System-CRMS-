/**
 * Represents a discount applicable to a rental booking.
 */
public class Discount {
    /** The type classification of the discount (e.g., loyalty, corporate). */
    private String discountType;
    /** The exact numeric amount or percentage that will be discounted. */
    private double discountAmount;
    /** A descriptive explanation of this discount. */
    private String description;

    /**
     * Constructs a new Discount.
     *
     * @param discountType   the discount type classification
     * @param discountAmount the calculated reduction amount
     * @param description    the string description
     */
    public Discount(String discountType, double discountAmount, String description) {
        this.discountType = discountType;
        this.discountAmount = discountAmount;
        this.description = description;
    }

    /**
     * Gets the discount type.
     *
     * @return the discount type
     */
    public String getDiscountType() {
        return discountType;
    }

    /**
     * Sets the discount type.
     *
     * @param discountType the discount type
     */
    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    /**
     * Gets the discount amount.
     *
     * @return the discount amount
     */
    public double getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the discount amount.
     *
     * @param discountAmount the discount amount
     */
    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * Gets the discount description.
     *
     * @return the descriptive string
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the discount description.
     *
     * @param description the descriptive string
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns a string representation of the discount.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Discount{" +
                "discountType='" + discountType + '\'' +
                ", discountAmount=" + discountAmount +
                ", description='" + description + '\'' +
                '}';
    }
}
