/**
 * Name: Taphanatu Sesay
 * Date: May 8, 2026
 * Assignment: SDC330 5.2 Project - Application Delivery
 * Description: Final application delivery for the SecureTrack Security System.
 */
public class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}