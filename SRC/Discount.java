/**
 * Documents any discounts applied to a booking.
 * Specifies the discount type and the amount (or percentage) to be deducted.
 */
public class Discount {
    /** The type of discount (e.g., loyalty, promotional, corporate). */
    private String type;
    /** The numeric value of the discount. */
    private double amount;
    /** Indicates whether the amount represents a percentage or a flat value. */
    private boolean isPercentage;

    /**
     * Constructs a new Discount.
     *
     * @param type         the discount type
     * @param amount       the discount amount or percentage
     * @param isPercentage true if the amount is a percentage, false if flat value
     */
    public Discount(String type, double amount, boolean isPercentage) {
        this.type = type;
        this.amount = amount;
        this.isPercentage = isPercentage;
    }

    /**
     * Gets the discount type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the discount type.
     *
     * @param type the new type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the numeric value of the discount.
     *
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the numeric value of the discount.
     *
     * @param amount the new amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Checks if the discount is a percentage.
     *
     * @return true if percentage, false otherwise
     */
    public boolean isPercentage() {
        return isPercentage;
    }

    /**
     * Sets whether the discount is a percentage.
     *
     * @param percentage true if percentage, false otherwise
     */
    public void setPercentage(boolean percentage) {
        isPercentage = percentage;
    }

    /**
     * Returns a string representation of the discount.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        String amountStr = isPercentage ? amount + "%" : "$" + String.format("%.2f", amount);
        return "Discount {" +
                "Type='" + type + '\'' +
                ", Value=" + amountStr +
                '}';
    }
}
