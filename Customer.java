/*
 * Name: Taphanatu Sesay
 * Course: Java Programming
 * Assignment: 3.8 Course Project - Class Implementation
 * Date: April 26, 2026
 * Description: Customer class that inherits from the Person abstract class.
 */

public class Customer extends Person {
    private String email;

    public Customer(int id, String name, String email) {
        super(id, name);
        this.email = email;
    }

    @Override
    public void displayInfo() {
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Email: " + email);
    }

    public String getEmail() {
        return email;
    }
}