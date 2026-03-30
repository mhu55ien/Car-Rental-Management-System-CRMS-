/**
 * Represents a rental Car inside the management system.
 */
public class Car {
    /** The unique identifier for the car. */
    private String carID;
    /** The brand or make of the car. */
    private String brand;
    /** The model or type classification. */
    private String type;
    /** The base daily rental rate for this car. */
    private double dailyRate;
    /** Indicates whether the car is currently available to rent. */
    private boolean isAvailable;
    /** The specific features of this car. */
    private Features features;
    /** The base insurance details applying to this car. */
    private InsuranceDetails insurance;

    /**
     * Constructs a new Car.
     *
     * @param carID       the unique car ID
     * @param brand       the car brand
     * @param type        the car type
     * @param dailyRate   the base daily rate
     * @param isAvailable the availability flag
     * @param features    the custom features
     * @param insurance   the related insurance details
     */
    public Car(String carID, String brand, String type, double dailyRate, boolean isAvailable, Features features, InsuranceDetails insurance) {
        this.carID = carID;
        this.brand = brand;
        this.type = type;
        this.dailyRate = dailyRate;
        this.isAvailable = isAvailable;
        this.features = features;
        this.insurance = insurance;
    }

    /**
     * Gets the car ID.
     *
     * @return the car ID
     */
    public String getCarID() {
        return carID;
    }

    /**
     * Sets the car ID.
     *
     * @param carID the new car ID
     */
    public void setCarID(String carID) {
        this.carID = carID;
    }

    /**
     * Gets the brand.
     *
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the brand.
     *
     * @param brand the brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Gets the type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the daily rental rate.
     *
     * @return the daily rate
     */
    public double getDailyRate() {
        return dailyRate;
    }

    /**
     * Sets the daily rental rate.
     *
     * @param dailyRate the daily rate
     */
    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    /**
     * Checks if the car is available.
     *
     * @return true if available, false otherwise
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Sets the availability.
     *
     * @param isAvailable the availability flag
     */
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    /**
     * Gets the mapped features of the car.
     *
     * @return the features
     */
    public Features getFeatures() {
        return features;
    }

    /**
     * Sets the mapped features of the car.
     *
     * @param features the features
     */
    public void setFeatures(Features features) {
        this.features = features;
    }

    /**
     * Gets the insurance details.
     *
     * @return the insurance details
     */
    public InsuranceDetails getInsurance() {
        return insurance;
    }

    /**
     * Sets the insurance details.
     *
     * @param insurance the insurance details
     */
    public void setInsurance(InsuranceDetails insurance) {
        this.insurance = insurance;
    }

    /**
     * Returns a string representation of the car.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Car{" +
                "carID='" + carID + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", dailyRate=" + dailyRate +
                ", isAvailable=" + isAvailable +
                ", features=" + features +
                ", insurance=" + insurance +
                '}';
    }
}
