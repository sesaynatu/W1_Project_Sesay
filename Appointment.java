/*
 * Name: Taphanatu Sesay
 * Course: Java Programming
 * Assignment: 3.8 Course Project - Class Implementation
 * Date: April 26, 2026
 * Description: Appointment class that demonstrates composition by using Customer, Employee, Service, and Payment objects.
 */

public class Appointment implements Displayable {
    private int appointmentId;
    private Customer customer;
    private Employee employee;
    private Service service;
    private Payment payment;
    private String appointmentDate;

    public Appointment(int appointmentId, Customer customer, Employee employee, Service service, Payment payment, String appointmentDate) {
        this.appointmentId = appointmentId;
        this.customer = customer;
        this.employee = employee;
        this.service = service;
        this.payment = payment;
        this.appointmentDate = appointmentDate;
    }

    @Override
    public void display() {
        System.out.println("Appointment ID: " + appointmentId);
        System.out.println("Appointment Date: " + appointmentDate);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Employee: " + employee.getName());
        System.out.println("Service: " + service.getServiceName());
        System.out.println("Payment Status: " + payment.getStatus());
    }
}