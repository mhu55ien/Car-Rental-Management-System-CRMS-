/**
 * Represents a client who rents a car without using a User inheritance model.
 */
public class Client {
    /** The unique identifier for the client. */
    private String userID;
    /** The full name of the client. */
    private String name;
    /** Basic contact details string. */
    private String contactDetails;
    /** The client's license number as a basic string. */
    private String licenseNumber;
    /** The client's physical address. */
    private String address;
    /** The primary payment info details. */
    private String paymentInfo;
    /** The structured license details. */
    private LicenseDetails license;
    /** The structured contact details. */
    private ContactDetails contact;

    /**
     * Constructs a new Client object.
     *
     * @param userID         the unique identifier
     * @param name           the full name
     * @param contactDetails the basic contact string
     * @param licenseNumber  the client's license number string
     * @param address        the client's address
     * @param paymentInfo    the payment info
     * @param license        the detailed license object
     * @param contact        the detailed contact object
     */
    public Client(String userID, String name, String contactDetails, String licenseNumber, String address, String paymentInfo, LicenseDetails license, ContactDetails contact) {
        this.userID = userID;
        this.name = name;
        this.contactDetails = contactDetails;
        this.licenseNumber = licenseNumber;
        this.address = address;
        this.paymentInfo = paymentInfo;
        this.license = license;
        this.contact = contact;
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
     * Gets the basic name string.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the basic name string.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the basic contact details.
     *
     * @return the contact details
     */
    public String getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the basic contact details.
     *
     * @param contactDetails the contact details string
     */
    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    /**
     * Gets the simple license number string.
     *
     * @return the license number
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the simple license number string.
     *
     * @param licenseNumber the license number
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    /**
     * Gets the basic address string.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the basic address string.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the payment info string.
     *
     * @return the payment info
     */
    public String getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Sets the payment info string.
     *
     * @param paymentInfo the payment info
     */
    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    /**
     * Gets the detailed license object.
     *
     * @return the detailed license
     */
    public LicenseDetails getLicense() {
        return license;
    }

    /**
     * Sets the detailed license object.
     *
     * @param license the detailed license
     */
    public void setLicense(LicenseDetails license) {
        this.license = license;
    }

    /**
     * Gets the detailed contact object.
     *
     * @return the detailed contact
     */
    public ContactDetails getContact() {
        return contact;
    }

    /**
     * Sets the detailed contact object.
     *
     * @param contact the detailed contact
     */
    public void setContact(ContactDetails contact) {
        this.contact = contact;
    }

    /**
     * Returns a string representation of the client.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Client{" +
                "userID='" + userID + '\'' +
                ", name='" + name + '\'' +
                ", contactDetails='" + contactDetails + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", address='" + address + '\'' +
                ", paymentInfo='" + paymentInfo + '\'' +
                ", license=" + license +
                ", contact=" + contact +
                '}';
    }
}
