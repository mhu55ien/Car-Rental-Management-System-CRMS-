/**
 * Represents a rental branch location.
 */
public class Branch {
    /** The unique branch identifier. */
    private String branchID;
    /** The name of the branch. */
    private String branchName;
    /** The location details or address of the branch. */
    private String location;

    /**
     * Constructs a new Branch.
     *
     * @param branchID   the branch ID
     * @param branchName the branch name
     * @param location   the location
     */
    public Branch(String branchID, String branchName, String location) {
        this.branchID = branchID;
        this.branchName = branchName;
        this.location = location;
    }

    /**
     * Gets the branch ID.
     *
     * @return the branch ID
     */
    public String getBranchID() {
        return branchID;
    }

    /**
     * Sets the branch ID.
     *
     * @param branchID the branch ID
     */
    public void setBranchID(String branchID) {
        this.branchID = branchID;
    }

    /**
     * Gets the branch name.
     *
     * @return the branch name
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the branch name.
     *
     * @param branchName the branch name
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * Gets the branch location.
     *
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the branch location.
     *
     * @param location the location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Returns a string representation of the branch.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Branch{" +
                "branchID='" + branchID + '\'' +
                ", branchName='" + branchName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
