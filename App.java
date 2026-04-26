/*
 * Name: Taphanatu Sesay
 * Course: Software Development
 * Assignment: 3.2 Project - Abstraction, Constructors, & Access Specifiers
 * Date: April 26, 2026
 * Description: This class runs the Week 3 project and demonstrates abstraction,
 * constructors, and access specifiers.
 */

public class App {
    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" Week 3 Project - Abstraction, Constructors, & Access Specifiers");
        System.out.println(" Name: Taphanatu Sesay");
        System.out.println("==============================================");

        System.out.println("\nWelcome to SecureTrack!");
        System.out.println("This application demonstrates abstraction, constructors, and access specifiers.");
        System.out.println("Follow the output below to view user and service request details.\n");

        Client client1 = new Client("Grace Johnson", "C001", "Cybersecurity Support");
        ServiceRequest request1 = new ServiceRequest("R001", "Network Security Review", "Open");

        client1.displayInfo();
        System.out.println();

        request1.displayRequest();
    }
}