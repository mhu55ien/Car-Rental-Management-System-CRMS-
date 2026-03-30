/**
 * Represents detailed contact information.
 */
public class ContactDetails {
    /** The physical address. */
    private String address;
    /** The phone number. */
    private String phoneNumber;
    /** The email address. */
    private String email;

    /**
     * Constructs a new ContactDetails object.
     *
     * @param address     the physical address
     * @param phoneNumber the phone number
     * @param email       the email address
     */
    public ContactDetails(String address, String phoneNumber, String email) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /**
     * Gets the address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the phone number.
     *
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number.
     *
     * @param phoneNumber the phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the email address.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns a string representation of the contact details.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "ContactDetails{" +
                "address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
