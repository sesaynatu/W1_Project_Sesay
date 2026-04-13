/**
 * Name: Taphanatu Sesay
 * Date: 04/12/2026
 * Assignment: SDC330L Project Week 1 - Inheritance, Composition, and User Interactions
 * Description: Base class representing an employee with common attributes such as name and ID.
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