/**
 * Represents an Agent who works at a rental system branch.
 */
public class Agent {
    /** The unique identifier representing the agent (as previously User). */
    private String userID;
    /** The full name of the agent. */
    private String name;
    /** Basic contact details string. */
    private String contactDetails;
    /** The specific identifier for the agent. */
    private String agentID;
    /** The default branch location string for the agent. */
    private String branchLocation;
    /** The specific branch object the agent is assigned to. */
    private Branch branch;
    /** The specific working schedule of the agent. */
    private Schedule schedule;

    /**
     * Constructs a new Agent.
     *
     * @param userID         the unique identifier
     * @param name           the full name string
     * @param contactDetails the basic contact details
     * @param agentID        the secondary agent identifier
     * @param branchLocation the branch location string
     * @param branch         the specific branch object
     * @param schedule       the specific schedule object
     */
    public Agent(String userID, String name, String contactDetails, String agentID, String branchLocation, Branch branch, Schedule schedule) {
        this.userID = userID;
        this.name = name;
        this.contactDetails = contactDetails;
        this.agentID = agentID;
        this.branchLocation = branchLocation;
        this.branch = branch;
        this.schedule = schedule;
    }

    /**
     * Gets the base user ID.
     *
     * @return the user ID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the base user ID.
     *
     * @param userID the user ID
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * Gets the full name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the full name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the contact details string.
     *
     * @return the contact details
     */
    public String getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the contact details string.
     *
     * @param contactDetails the contact details string
     */
    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    /**
     * Gets the specific agent ID.
     *
     * @return the agent ID
     */
    public String getAgentID() {
        return agentID;
    }

    /**
     * Sets the specific agent ID.
     *
     * @param agentID the new agent ID
     */
    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    /**
     * Gets the basic branch location string.
     *
     * @return the branch location
     */
    public String getBranchLocation() {
        return branchLocation;
    }

    /**
     * Sets the basic branch location string.
     *
     * @param branchLocation the branch location
     */
    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    /**
     * Gets the branch object.
     *
     * @return the branch object
     */
    public Branch getBranch() {
        return branch;
    }

    /**
     * Sets the branch object.
     *
     * @param branch the branch object
     */
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    /**
     * Gets the agent's schedule.
     *
     * @return the schedule
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the agent's schedule.
     *
     * @param schedule the schedule
     */
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * Returns a string representation of the agent.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Agent{" +
                "userID='" + userID + '\'' +
                ", name='" + name + '\'' +
                ", contactDetails='" + contactDetails + '\'' +
                ", agentID='" + agentID + '\'' +
                ", branchLocation='" + branchLocation + '\'' +
                ", branch=" + branch +
                ", schedule=" + schedule +
                '}';
    }
}
