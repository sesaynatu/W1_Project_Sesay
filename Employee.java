/**********************************************************************
 * Name: Taphanatu Sesay
 * Date: April 30, 2026
 * Assignment: SDC330 Week 4 Project - Database Interactions
 *
 * Purpose:
 * This class represents one employee record.
 **********************************************************************/

public class Employee {
    public int ID;
    public String FirstName;
    public String LastName;
    public String Position;
    public int Age;

    public Employee(int id, String firstName, String lastName, String position, int age) {
        ID = id;
        FirstName = firstName;
        LastName = lastName;
        Position = position;
        Age = age;
    }

    public Employee(String firstName, String lastName, String position, int age) {
        FirstName = firstName;
        LastName = lastName;
        Position = position;
        Age = age;
    }

    public Employee() {
    }
}