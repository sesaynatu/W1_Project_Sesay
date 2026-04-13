/**
 * Name: Taphanatu Sesay
 * Date: 04/12/2026
 * Assignment: SDC330L Project Week 1 - Inheritance, Composition, and User Interactions
 * Description: Derived class that represents an admin employee and demonstrates polymorphism.
 */
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