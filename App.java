/**
 * Name: Taphanatu Sesay
 * Course: SDC330
 * Assignment: 4.6 Course Project - Database Implementation
 * Date: April 30, 2026
 * Description: Main application demonstrating database functionality.
 */

public class App {
    public static void main(String[] args) {

        System.out.println("Taphanatu Sesay - Course Project Database");

        DatabaseHelper db = new DatabaseHelper();

        db.createTable();
        db.clearTable();

        db.insert(new Address(1, "123 Apple Tree Ln", "", "Fremont", "NC", 23145));
        db.insert(new Address(2, "321 Labrador Dr", "Apt 5", "Greenville", "VA", 42321));
        db.insert(new Address(3, "916 Spring Grove St", "Unit 3", "Spring", "TX", 73915));
        db.insert(new Address(4, "739 Green Way", "", "Flynt", "MI", 28537));

        System.out.println("\nAll Addresses:");
        for (Address address : db.getAll()) {
            printAddress(address);
        }

        System.out.println("\nGetting Address using invalid ID:");
        Address invalidAddress = db.getById(999);

        if (invalidAddress == null) {
            System.out.println("No matching address found.");
        } else {
            printAddress(invalidAddress);
        }

        System.out.println("\nUpdating Address 2:");
        db.update(new Address(2, "321 Labrador St", "Apt 12", "Greendale", "TN", 20194));

        Address updatedAddress = db.getById(2);

        if (updatedAddress != null) {
            printAddress(updatedAddress);
        } else {
            System.out.println("Updated address not found.");
        }

        System.out.println("\nDeleting Address 2:");
        db.delete(2);

        System.out.println("\nAll Addresses after deletion:");
        for (Address address : db.getAll()) {
            printAddress(address);
        }
    }

    public static void printAddress(Address address) {
        System.out.println("Address #" + address.getId());
        System.out.println(address.getStreet1());

        if (!address.getStreet2().isEmpty()) {
            System.out.println(address.getStreet2());
        }

        System.out.println(address.getCity() + ", " + address.getState() + " " + address.getZip());
        System.out.println();
    }
}