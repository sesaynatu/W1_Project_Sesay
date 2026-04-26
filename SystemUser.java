/*
 * Name: Taphanatu Sesay
 * Course: Software Development
 * Assignment: 3.2 Project - Abstraction, Constructors, & Access Specifiers
 * Date: April 26, 2026
 * Description: This abstract class represents a general system user.
 * It demonstrates abstraction and uses access specifiers to protect data.
 */

public abstract class SystemUser {

    protected String name;
    private String userId;

    public SystemUser() {
        this.name = "Unknown";
        this.userId = "N/A";
    }

    public SystemUser(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public abstract void displayInfo();
}