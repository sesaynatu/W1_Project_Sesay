/**
 * Name: Taphanatu Sesay
 * Date: 04/12/2026
 * Assignment: SDC330L Project Week 1 - Inheritance, Composition, and User Interactions
 * Description: Derived class that extends Employee and adds access level for security tracking.
 */
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