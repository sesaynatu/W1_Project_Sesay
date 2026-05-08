/**
 * Name: Taphanatu Sesay
 * Date: May 8, 2026
 * Assignment: SDC330 5.2 Project - Application Delivery
 * Description: Final application delivery for the SecureTrack Security System.
 */

// Inheritance: AdminEmployee extends Employee to represent administrative users
public class AdminEmployee extends Employee {
    private String department;

    public AdminEmployee(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}