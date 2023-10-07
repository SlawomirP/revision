package enkapsulacja;

public class Client {
    private String firstName = "Bob";
    private String lastName = "Cat";
    private boolean premiumClient = true;

    public Client(String firstName, String lastName, boolean premiumClient) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.premiumClient = premiumClient;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isPremiumClient() {
        return premiumClient;
    }

    public void setPremiumClient(boolean premiumClient) {
        this.premiumClient = premiumClient;
    }
}
