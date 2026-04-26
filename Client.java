/*
 * Name: Taphanatu Sesay
 * Course: Software Development
 * Assignment: 3.2 Project - Abstraction, Constructors, & Access Specifiers
 * Date: April 26, 2026
 * Description: This class represents a client in the SecureTrack system.
 * It extends the abstract SystemUser class and demonstrates inheritance,
 * constructors, and access specifiers.
 */

public class Client extends SystemUser {

    private String serviceType;

    public Client() {
        super();
        this.serviceType = "General Service";
    }

    public Client(String name, String userId, String serviceType) {
        super(name, userId);
        this.serviceType = serviceType;
    }

    public String getServiceType() {
        return serviceType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Client Information");
        System.out.println("------------------");
        System.out.println("Name: " + name);
        System.out.println("User ID: " + getUserId());
        System.out.println("Service Type: " + serviceType);
    }
}