/*
 * Name: Taphanatu Sesay
 * Course: Java Programming
 * Assignment: 3.8 Course Project - Class Implementation
 * Date: April 26, 2026
 * Description: Payment class that stores payment details for an appointment.
 */

public class Payment implements Displayable {
    private int paymentId;
    private double amount;
    private String status;

    public Payment(int paymentId, double amount, String status) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = status;
    }

    @Override
    public void display() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: $" + amount);
        System.out.println("Status: " + status);
    }

    public String getStatus() {
        return status;
    }
}