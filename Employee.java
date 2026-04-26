/*
 * Name: Taphanatu Sesay
 * Course: Java Programming
 * Assignment: 3.8 Course Project - Class Implementation
 * Date: April 26, 2026
 * Description: Employee class that inherits from the Person abstract class.
 */

public class Employee extends Person {
    private String position;

    public Employee(int id, String name, String position) {
        super(id, name);
        this.position = position;
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Position: " + position);
    }

    public String getPosition() {
        return position;
    }
}