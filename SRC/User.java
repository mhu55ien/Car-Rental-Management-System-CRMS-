/**
 * Represents a basic user in the system.
 */
public class User {
    /** The unique identifier for the user. */
    private String userID;
    /** The full name of the user. */
    private String name;
    /** The contact details of the user. */
    private String contactDetails;

    /**
     * Constructs a new User.
     *
     * @param userID         the unique identifier
     * @param name           the full name
     * @param contactDetails the contact details string
     */
    public User(String userID, String name, String contactDetails) {
        this.userID = userID;
        this.name = name;
        this.contactDetails = contactDetails;
    }

    /**
     * Gets the user ID.
     *
     * @return the user ID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the user ID.
     *
     * @param userID the user ID
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * Gets the user name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the user name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the contact details string.
     *
     * @return the contact details string
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
     * Returns a string representation of the User.
     *
     * @return a string containing user details
     */
    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", name='" + name + '\'' +
                ", contactDetails='" + contactDetails + '\'' +
                '}';
    }
}
