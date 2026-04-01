import java.time.LocalDate;

/**
 * Represents a base booking record in the Car Rental Management System (CRMS).
 * Stores the initial booking details such as client, car, agent, dates, and base cost.
 */
public class BookingRecord {
    /** The client who made the booking. */
    private Client client;
    /** The car that is requested for the booking. */
    private Car car;
    /** The agent handling the booking. */
    private Agent agent;
    /** The start date of the rental period. */
    private LocalDate startDate;
    /** The end date of the rental period. */
    private LocalDate endDate;
    /** The initial base cost of the rental. */
    private double baseCost;

    /**
     * Constructs a new BookingRecord.
     *
     * @param client    the booking client
     * @param car       the requested car
     * @param agent     the managing agent
     * @param startDate the start date of the rental
     * @param endDate   the end date of the rental
     * @param baseCost  the base cost of the rental
     */
    public BookingRecord(Client client, Car car, Agent agent, LocalDate startDate, LocalDate endDate, double baseCost) {
        this.client = client;
        this.car = car;
        this.agent = agent;
        this.startDate = startDate;
        this.endDate = endDate;
        this.baseCost = baseCost;
    }

    /**
     * Gets the client making the booking.
     *
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * Sets the client making the booking.
     *
     * @param client the new client
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * Gets the car requested for the booking.
     *
     * @return the car
     */
    public Car getCar() {
        return car;
    }

    /**
     * Sets the car requested for the booking.
     *
     * @param car the new car
     */
    public void setCar(Car car) {
        this.car = car;
    }

    /**
     * Gets the agent handling the booking.
     *
     * @return the agent
     */
    public Agent getAgent() {
        return agent;
    }

    /**
     * Sets the agent handling the booking.
     *
     * @param agent the new agent
     */
    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    /**
     * Gets the start date of the rental period.
     *
     * @return the start date
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Sets the start date of the rental period.
     *
     * @param startDate the new start date
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * Gets the end date of the rental period.
     *
     * @return the end date
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Sets the end date of the rental period.
     *
     * @param endDate the new end date
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * Gets the initial base cost of the rental.
     *
     * @return the base cost
     */
    public double getBaseCost() {
        return baseCost;
    }

    /**
     * Sets the initial base cost of the rental.
     *
     * @param baseCost the new base cost
     */
    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    /**
     * Returns a customized string representation of the booking record.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "BookingRecord {" +
                "Client=" + (client != null ? client.getName() : "null") +
                ", Car=" + (car != null ? car.getCarID() : "null") +
                ", Agent=" + (agent != null ? agent.getName() : "null") +
                ", StartDate=" + startDate +
                ", EndDate=" + endDate +
                ", BaseCost=$" + String.format("%.2f", baseCost) +
                '}';
    }
}
