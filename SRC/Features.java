/**
 * Represents the specific features of a car.
 */
public class Features {
    /** The fuel type of the vehicle (e.g., Petrol, Diesel, Electric). */
    private String fuelType;
    /** The transmission type (e.g., Manual, Automatic). */
    private String transmission;
    /** The seating capacity of the vehicle. */
    private int seatingCapacity;
    /** The category of the vehicle (e.g., SUV, Sedan, Luxury, Economy). */
    private String category;

    /**
     * Constructs a new set of car features.
     *
     * @param fuelType        the fuel type
     * @param transmission    the transmission type
     * @param seatingCapacity the seating capacity
     * @param category        the vehicle category
     */
    public Features(String fuelType, String transmission, int seatingCapacity, String category) {
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.seatingCapacity = seatingCapacity;
        this.category = category;
    }

    /**
     * Gets the fuel type.
     *
     * @return the fuel type
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * Sets the fuel type.
     *
     * @param fuelType the fuel type
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * Gets the transmission type.
     *
     * @return the transmission type
     */
    public String getTransmission() {
        return transmission;
    }

    /**
     * Sets the transmission type.
     *
     * @param transmission the transmission type
     */
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    /**
     * Gets the seating capacity.
     *
     * @return the seating capacity
     */
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    /**
     * Sets the seating capacity.
     *
     * @param seatingCapacity the seating capacity
     */
    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    /**
     * Gets the category.
     *
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category.
     *
     * @param category the category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Returns a string representation of the features.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Features{" +
                "fuelType='" + fuelType + '\'' +
                ", transmission='" + transmission + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                ", category='" + category + '\'' +
                '}';
    }
}
