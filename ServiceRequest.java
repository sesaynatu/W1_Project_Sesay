/*
 * Name: Taphanatu Sesay
 * Course: Software Development
 * Assignment: 3.2 Project - Abstraction, Constructors, & Access Specifiers
 * Date: April 26, 2026
 */

public class ServiceRequest {

    private String requestId;
    private String requestTitle;
    private String status;

    public ServiceRequest() {
        this.requestId = "N/A";
        this.requestTitle = "No Request";
        this.status = "Pending";
    }

    public ServiceRequest(String requestId, String requestTitle, String status) {
        this.requestId = requestId;
        this.requestTitle = requestTitle;
        this.status = status;
    }

    public void displayRequest() {
        System.out.println("Service Request Information");
        System.out.println("---------------------------");
        System.out.println("Request ID: " + requestId);
        System.out.println("Request Title: " + requestTitle);
        System.out.println("Status: " + status);
    }
}