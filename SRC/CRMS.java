/**
 * Interface for the Car Rental Management System (CRMS).
 * Defines the main methods needed for managing the car booking, processing, and finalization phases.
 */
public interface CRMS {
    /**
     * Sets up the rental environment.
     *
     * @param numOfClients the number of clients
     * @param numOfCars    the number of cars
     * @param numOfAgents  the number of agents
     * @return an initialized RentalSystem
     */
    public RentalSystem InitializeRentalSystem(int numOfClients, int numOfCars, int numOfAgents);

    /**
     * Handles the initial booking process.
     *
     * @param c   the client making the booking
     * @param car the car being requested
     * @param a   the agent handling the contract
     * @return a booking record connecting these three parties
     */
    public BookingRecord Book(Client c, Car car, Agent a);

    /**
     * Represents the processing phase of the booking.
     *
     * @param br the initial booking record
     * @return a processed record with applied insurance and discounts
     */
    public ProcessedRecord Process(BookingRecord br);

    /**
     * Finalizes the rental process.
     *
     * @param pr the processed booking record
     * @return a finalized record confirming payment and pickup details
     */
    public FinalizedRecord Finalize(ProcessedRecord pr);
}
