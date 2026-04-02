import java.util.*;

/*
 * Main execution class
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("===== CAR RENTAL MANAGEMENT SYSTEM TEST =====\n");

        CRMS implementer = new CarRentalImplementer();

        RentalSystem system = implementer.initializeRentalSystem(1,1,2);

        Client client = system.getClients().get(0);
        Car car = system.getCars().get(0);
        Agent agent1 = system.getAgents().get(0);
        Agent agent2 = system.getAgents().get(1);

        BookingRecord booking1 = implementer.book(client,car,agent1);
        BookingRecord booking2 = implementer.book(client,car,agent2);

        ProcessedRecord processed1 = implementer.process(booking1);
        processed1.setInsuranceOption(new InsuranceOption("Premium",50));
        processed1.setDiscount(null);

        ProcessedRecord processed2 = implementer.process(booking2);
        processed2.setInsuranceOption(new InsuranceOption("Standard",20));
        processed2.setDiscount(new Discount("Loyalty",20,true));

        double cost1 = processed1.calculateUpdatedTotalCost();
        double cost2 = processed2.calculateUpdatedTotalCost();

        System.out.println("Booking1 Cost: $" + cost1);
        System.out.println("Booking2 Cost: $" + cost2);

        ProcessedRecord better;

        if(cost1 <= cost2){
            better = processed1;
            System.out.println("Booking1 is better.");
        }else{
            better = processed2;
            System.out.println("Booking2 is better.");
        }

        FinalizedRecord finalRecord = implementer.finalize(better);

        System.out.println("\nFINAL AGREEMENT");
        System.out.println("Client: " + finalRecord.getClient().getName());
        System.out.println("Car: " + finalRecord.getCar().getBrand());
        System.out.println("Agent: " + finalRecord.getAgent().getName());
        System.out.println("Final Cost: $" + finalRecord.calculateUpdatedTotalCost());
        System.out.println("Deposit: $" + finalRecord.getDepositRequired());
        System.out.println(finalRecord.getPaymentDetails());
        System.out.println(finalRecord.getPickupDetails());
    }
}

/*
 * Interface
 */
interface CRMS{

    RentalSystem initializeRentalSystem(int clients,int cars,int agents);

    BookingRecord book(Client client,Car car,Agent agent);

    ProcessedRecord process(BookingRecord booking);

    FinalizedRecord finalize(ProcessedRecord record);
}

/*
 * Implementation
 */
class CarRentalImplementer implements CRMS{

    public RentalSystem initializeRentalSystem(int clientCount,int carCount,int agentCount){

        List<Client> clients = new ArrayList<>();
        List<Car> cars = new ArrayList<>();
        List<Agent> agents = new ArrayList<>();

        for(int i=1;i<=clientCount;i++)
            clients.add(new Client(i,"Client"+i));

        for(int i=1;i<=carCount;i++)
            cars.add(new Car(i,"Toyota"));

        for(int i=1;i<=agentCount;i++)
            agents.add(new Agent(i,"Agent"+i));

        return new RentalSystem(clients,cars,agents);
    }

    public BookingRecord book(Client client,Car car,Agent agent){
        return new BookingRecord(client,car,agent,200);
    }

    public ProcessedRecord process(BookingRecord booking){
        return new ProcessedRecord(booking);
    }

    public FinalizedRecord finalize(ProcessedRecord record){
        return new FinalizedRecord(record);
    }
}

/*
 * Rental System
 */
class RentalSystem{

    private List<Client> clients;
    private List<Car> cars;
    private List<Agent> agents;

    public RentalSystem(List<Client> clients,List<Car> cars,List<Agent> agents){
        this.clients = clients;
        this.cars = cars;
        this.agents = agents;
    }

    public List<Client> getClients(){ return clients; }
    public List<Car> getCars(){ return cars; }
    public List<Agent> getAgents(){ return agents; }
}

/*
 * Client
 */
class Client{

    int id;
    String name;

    public Client(int id,String name){
        this.id=id;
        this.name=name;
    }

    public String getName(){ return name; }
}

/*
 * Car
 */
class Car{

    int carID;
    String brand;

    public Car(int carID,String brand){
        this.carID=carID;
        this.brand=brand;
    }

    public int getCarID(){ return carID; }
    public String getBrand(){ return brand; }
}

/*
 * Agent
 */
class Agent{

    int id;
    String name;

    public Agent(int id,String name){
        this.id=id;
        this.name=name;
    }

    public String getName(){ return name; }
}

/*
 * Booking Record
 */
class BookingRecord{

    Client client;
    Car car;
    Agent agent;
    double baseCost;

    public BookingRecord(Client client,Car car,Agent agent,double baseCost){
        this.client=client;
        this.car=car;
        this.agent=agent;
        this.baseCost=baseCost;
    }

    public Client getClient(){ return client; }
    public Car getCar(){ return car; }
    public Agent getAgent(){ return agent; }
    public double getBaseCost(){ return baseCost; }
}

/*
 * Insurance
 */
class InsuranceOption{

    String type;
    double price;

    public InsuranceOption(String type,double price){
        this.type=type;
        this.price=price;
    }

    public double getPrice(){ return price; }
}

/*
 * Discount
 */
class Discount{

    String name;
    double value;
    boolean percentage;

    public Discount(String name,double value,boolean percentage){
        this.name=name;
        this.value=value;
        this.percentage=percentage;
    }

    public double apply(double price){

        if(percentage)
            return price-(price*value/100);
        else
            return price-value;
    }
}

/*
 * Processed Record
 */
class ProcessedRecord{

    BookingRecord booking;
    InsuranceOption insurance;
    Discount discount;

    public ProcessedRecord(BookingRecord booking){
        this.booking=booking;
    }

    public void setInsuranceOption(InsuranceOption insurance){
        this.insurance=insurance;
    }

    public void setDiscount(Discount discount){
        this.discount=discount;
    }

    public double calculateUpdatedTotalCost(){

        double cost = booking.getBaseCost();

        if(insurance!=null)
            cost+=insurance.getPrice();

        if(discount!=null)
            cost=discount.apply(cost);

        return cost;
    }

    public BookingRecord getBooking(){ return booking; }
}

/*
 * Finalized Record
 */
class FinalizedRecord{

    ProcessedRecord record;

    public FinalizedRecord(ProcessedRecord record){
        this.record=record;
    }

    public Client getClient(){ return record.getBooking().getClient(); }
    public Car getCar(){ return record.getBooking().getCar(); }
    public Agent getAgent(){ return record.getBooking().getAgent(); }

    public double getBaseCost(){ return record.getBooking().getBaseCost(); }

    public double calculateUpdatedTotalCost(){
        return record.calculateUpdatedTotalCost();
    }

    public double getDepositRequired(){
        return calculateUpdatedTotalCost()*0.2;
    }

    public String getPaymentDetails(){
        return "Payment Method: Credit Card";
    }

    public String getPickupDetails(){
        return "Pickup Location: Main Branch";
    }
}