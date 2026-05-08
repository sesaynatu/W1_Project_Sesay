/**
 * Name: Taphanatu Sesay
 * Date: May 8, 2026
 * Assignment: SDC330 5.2 Project - Application Delivery
 * Description: Final application delivery for the SecureTrack Security System.
 */

// Inheritance: SecurityEmployee extends Employee to represent restricted access users
public class SecurityEmployee extends Employee {
    private String accessLevel;

    public SecurityEmployee(String name, int id, String accessLevel) {
        super(name, id);
        this.accessLevel = accessLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Access Level: " + accessLevel);
    }
}