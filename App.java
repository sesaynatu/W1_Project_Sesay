/**********************************************************************
 * Name: Taphanatu Sesay
 * Date: April 30, 2026
 * Assignment: SDC330 Week 4 Project - Database Interactions
 *
 * Purpose:
 * Main application class for an Employee Management System.
 * This program demonstrates database CRUD operations using SQLite.
 **********************************************************************/

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        final String dbName = "TaphanatuSesayProject.db";

        System.out.println("\nTaphanatu Sesay, Week 4 Database Interactions Project\n");

        System.out.println("Welcome to the Employee Management System.");
        System.out.println("This program demonstrates how to add, view, update, and delete employee records.\n");

        Connection conn = SQLiteDatabase.connect(dbName);

        if (conn != null) {
            if (EmployeeDB.createTable(conn)) {

                // Clear old data so employees do not duplicate each time the program runs
                Statement clear = conn.createStatement();
                clear.execute("DELETE FROM Employees");

                // Create
                EmployeeDB.addEmployee(conn, new Employee("Taphanatu", "Sesay", "Cybersecurity Analyst", 21));
                EmployeeDB.addEmployee(conn, new Employee("John", "Smith", "Software Developer", 45));
                EmployeeDB.addEmployee(conn, new Employee("Jane", "Jones", "Database Administrator", 24));
                EmployeeDB.addEmployee(conn, new Employee("Joe", "Diffy", "IT Support Specialist", 61));

                // Read
                System.out.println("=== ALL EMPLOYEES IN THE DATABASE ===");
                printEmployees(EmployeeDB.getAllEmployees(conn));

                // Invalid ID search
                System.out.println("\n=== SEARCH EMPLOYEE USING INVALID ID ===");
                printEmployee(EmployeeDB.getEmployee(conn, -5));

                // Update
                Employee employeeToUpdate = new Employee(2, "James", "Smith", "Senior Software Developer", 37);
                EmployeeDB.updateEmployee(conn, employeeToUpdate);

                System.out.println("\n=== UPDATED EMPLOYEE ===");
                printEmployee(EmployeeDB.getEmployee(conn, employeeToUpdate.ID));

                // Delete
                EmployeeDB.deleteEmployee(conn, employeeToUpdate.ID);

                System.out.println("\n=== EMPLOYEES AFTER DELETE ===");
                printEmployees(EmployeeDB.getAllEmployees(conn));

                System.out.println("\nProgram completed successfully.");
            }
        }
    }

    private static void printEmployees(ArrayList<Employee> employees) {
        for (Employee e : employees) {
            printEmployee(e);
        }
    }

    private static void printEmployee(Employee e) {
        System.out.print("Employee " + e.ID + ": ");
        System.out.print(e.FirstName + " " + e.LastName);
        System.out.print(" works as a " + e.Position);
        System.out.print(" and is " + e.Age + " years old.\n");
    }
}