/*- Customer ID
- Name
- Passport number
- Contact number
- Contact address
- Email address*/

public class Traveller {
    private int customerId;
    private String name;
    private String passportNumber;
    private String contactNumber;
    private String contactAddress;
    private String emailAddress;

    // Constructor
    public Traveller(int customerId, String name, String passportNumber, String contactNumber, String contactAddress,
            String emailAddress) {
        this.customerId = customerId;
        this.name = name;
        this.passportNumber = passportNumber;
        this.contactNumber = contactNumber;
        this.contactAddress = contactAddress;
        this.emailAddress = emailAddress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    // toString method
    @Override
    public String toString() {
        return "Customer ID: " + customerId +
                "\nName: " + name +
                "\nPassport Number: " + passportNumber +
                "\nContact Number: " + contactNumber +
                "\nContact Address: " + contactAddress +
                "\nEmail Address: " + emailAddress;
    }

}