import java.util.List;
import java.util.ArrayList;

/**
 * Main container class representing the Rental System's data models.
 */
public class RentalSystem {
    /** The active list of clients in the system. */
    private List<Client> clients;
    /** The active list of cars in the system. */
    private List<Car> cars;
    /** The active list of agents in the system. */
    private List<Agent> agents;

    /**
     * Constructs a new RentalSystem with initial lists.
     *
     * @param clients the initial list of clients
     * @param cars    the initial list of cars
     * @param agents  the initial list of agents
     */
    public RentalSystem(List<Client> clients, List<Car> cars, List<Agent> agents) {
        this.clients = clients != null ? clients : new ArrayList<>();
        this.cars = cars != null ? cars : new ArrayList<>();
        this.agents = agents != null ? agents : new ArrayList<>();
    }

    /**
     * Gets the list of clients.
     *
     * @return the clients list
     */
    public List<Client> getClients() {
        return clients;
    }

    /**
     * Sets the list of clients.
     *
     * @param clients the new clients list
     */
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    /**
     * Gets the list of cars.
     *
     * @return the cars list
     */
    public List<Car> getCars() {
        return cars;
    }

    /**
     * Sets the list of cars.
     *
     * @param cars the new cars list
     */
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    /**
     * Gets the list of agents.
     *
     * @return the agents list
     */
    public List<Agent> getAgents() {
        return agents;
    }

    /**
     * Sets the list of agents.
     *
     * @param agents the new agents list
     */
    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }

    /**
     * Returns a string representation of the rental system.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "RentalSystem{" +
                "clientsCount=" + (clients != null ? clients.size() : 0) +
                ", carsCount=" + (cars != null ? cars.size() : 0) +
                ", agentsCount=" + (agents != null ? agents.size() : 0) +
                '}';
    }
}
