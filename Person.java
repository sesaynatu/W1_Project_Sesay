/*
 * Name: Taphanatu Sesay
 * Course: Java Programming
 * Assignment: 3.8 Course Project - Class Implementation
 * Date: April 26, 2026
 * Description: Abstract parent class used for shared person information.
 */

public abstract class Person {
    protected int id;
    protected String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void displayInfo();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}