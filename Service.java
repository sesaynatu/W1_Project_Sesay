/*
 * Name: Taphanatu Sesay
 * Course: Java Programming
 * Assignment: 3.8 Course Project - Class Implementation
 * Date: April 26, 2026
 * Description: Service class that stores service information for an appointment.
 */

public class Service implements Displayable {
    private int serviceId;
    private String serviceName;
    private double price;

    public Service(int serviceId, String serviceName, double price) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Service ID: " + serviceId);
        System.out.println("Service Name: " + serviceName);
        System.out.println("Price: $" + price);
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getPrice() {
        return price;
    }
}