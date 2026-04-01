import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Main implementation of the Car Rental Management System (CRMS) interface.
 * Handles the logic for initializing the system and managing the booking lifecycle.
 */
public class CarRentalImplementer implements CRMS {

    /**
     * Initializes the rental system with dummy data.
     *
     * @param numOfClients the number of dummy clients to create
     * @param numOfCars    the number of dummy cars to create
     * @param numOfAgents  the number of dummy agents to create
     * @return an initialized RentalSystem object
     */
    @Override
    public RentalSystem initializeRentalSystem(int numOfClients, int numOfCars, int numOfAgents) {
        List<Client> clients = new ArrayList<>();
        for (int i = 1; i <= numOfClients; i++) {
            clients.add(new Client("C" + i, "Client " + i, "Contact " + i,
                    "LIC" + i, "Address " + i, "Credit Card " + i, null, null));
        }

        List<Car> cars = new ArrayList<>();
        for (int i = 1; i <= numOfCars; i++) {
            cars.add(new Car("CAR" + i, "Brand " + i, "Sedan", 50.0 + (i * 10), true, null, null));
        }

        List<Agent> agents = new ArrayList<>();
        for (int i = 1; i <= numOfAgents; i++) {
            agents.add(new Agent("A" + i, "Agent " + i, "Agent Contact " + i,
                    "AG" + i, "Main Branch", null, null));
        }

        return new RentalSystem(clients, cars, agents);
    }

    /**
     * Creates an initial booking record from the provided client, car, and agent.
     *
     * @param c   the associated client
     * @param car the associated car
     * @param a   the associated agent
     * @return a new BookingRecord
     */
    @Override
    public BookingRecord book(Client c, Car car, Agent a) {
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusDays(3);
        double baseCost = (car != null ? car.getDailyRate() : 50.0) * 3;
        
        return new BookingRecord(c, car, a, startDate, endDate, baseCost);
    }

    /**
     * Processes an existing booking record by applying dummy insurance and discounts.
     *
     * @param br the base booking record
     * @return a ProcessedRecord
     */
    @Override
    public ProcessedRecord process(BookingRecord br) {
        if (br == null) return null;

        InsuranceOption dummyInsurance = new InsuranceOption("Comprehensive", 15.0);
        Discount dummyDiscount = new Discount("Standard Promo", 10.0, true);

        return new ProcessedRecord(
            br.getClient(), 
            br.getCar(), 
            br.getAgent(), 
            br.getStartDate(), 
            br.getEndDate(), 
            br.getBaseCost(), 
            dummyInsurance, 
            dummyDiscount
        );
    }

    /**
     * Finalizes the processed record by determining payment details and pickup instructions.
     *
     * @param pr the processed record
     * @return a FinalizedRecord
     */
    @Override
    public FinalizedRecord finalize(ProcessedRecord pr) {
        if (pr == null) return null;

        double totalCost = pr.calculateUpdatedTotalCost();
        double requiredDeposit = totalCost * 0.20; // 20% deposit

        PaymentDetails paymentDetails = new PaymentDetails(requiredDeposit, totalCost, totalCost - requiredDeposit);
        PickupDetails pickupDetails = new PickupDetails("Main Downtown Branch", pr.getStartDate(), "Please arrive 15 minutes early for inspection.");

        return new FinalizedRecord(
            pr.getClient(),
            pr.getCar(),
            pr.getAgent(),
            pr.getStartDate(),
            pr.getEndDate(),
            pr.getBaseCost(),
            pr.getInsuranceOption(),
            pr.getDiscount(),
            requiredDeposit,
            paymentDetails,
            pickupDetails
        );
    }
}
