/*
 * Name: Taphanatu Sesay
 * Course: Java Programming
 * Assignment: 3.8 Course Project - Class Implementation
 * Date: April 26, 2026
 * Description: Main application class that runs the appointment management system.
 */

public class App {
    public static void main(String[] args) {

        System.out.println("Appointment Management System");
        System.out.println("------------------------------");

        Customer customer = new Customer(101, "Mary Johnson", "mary@email.com");
        Employee employee = new Employee(201, "James Smith", "Receptionist");
        Service service = new Service(301, "Consultation", 75.00);
        Payment payment = new Payment(401, 75.00, "Paid");

        Appointment appointment = new Appointment(501, customer, employee, service, payment, "04/26/2026");

        System.out.println();
        customer.displayInfo();

        System.out.println();
        employee.displayInfo();

        System.out.println();
        service.display();

        System.out.println();
        payment.display();

        System.out.println();
        appointment.display();

        System.out.println();
        System.out.println("Polymorphism Demonstration:");
        Person person1 = customer;
        Person person2 = employee;

        person1.displayInfo();
        person2.displayInfo();
    }
}