/**
 * Represents a base booking record in the system.
 */
public class BookingRecord {
    /** The client who made the booking. */
    private Client client;
    /** The car that is booked. */
    private Car car;
    /** The agent assisting with the booking. */
    private Agent agent;
    /** The formatted start date string. */
    private String startDate;
    /** The formatted end date string. */
    private String endDate;
    /** The calculated base cost of the rental. */
    private double baseCost;

    /**
     * Constructs a new BookingRecord.
     *
     * @param client    the booking client
     * @param car       the booked car
     * @param agent     the managing agent
     * @param startDate the start date
     * @param endDate   the end date
     * @param baseCost  the accumulated base cost
     */
    public BookingRecord(Client client, Car car, Agent agent, String startDate, String endDate, double baseCost) {
        this.client = client;
        this.car = car;
        this.agent = agent;
        this.startDate = startDate;
        this.endDate = endDate;
        this.baseCost = baseCost;
    }

    /**
     * Gets the client.
     *
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * Sets the client.
     *
     * @param client the new client
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * Gets the car.
     *
     * @return the car
     */
    public Car getCar() {
        return car;
    }

    /**
     * Sets the car.
     *
     * @param car the new car
     */
    public void setCar(Car car) {
        this.car = car;
    }

    /**
     * Gets the agent.
     *
     * @return the agent
     */
    public Agent getAgent() {
        return agent;
    }

    /**
     * Sets the agent.
     *
     * @param agent the new agent
     */
    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    /**
     * Gets the start date string.
     *
     * @return the start date
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the start date string.
     *
     * @param startDate the start date
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Gets the end date string.
     *
     * @return the end date
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the end date string.
     *
     * @param endDate the end date
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Gets the base cost.
     *
     * @return the base cost
     */
    public double getBaseCost() {
        return baseCost;
    }

    /**
     * Sets the base cost.
     *
     * @param baseCost the base cost
     */
    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    /**
     * Returns a string representation of the booking record.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "BookingRecord{" +
                "client=" + client +
                ", car=" + car +
                ", agent=" + agent +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", baseCost=" + baseCost +
                '}';
    }
}
