/**
 * Name: Taphanatu Sesay
 * Date: 04/19/2026
 * Assignment: SDC330L Project Week 2 - Interfaces & Polymorphism
 * Description: Main application file that displays menu options, accepts user input,
 * and demonstrates polymorphism and interface usage for SecureTrack system.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureTrackSystem system = new SecureTrackSystem();

        int choice;

        do {
            System.out.println("\n=== SecureTrack Security System ===");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Add Activity Log");
            System.out.println("4. View Activity Logs");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    input.nextLine();

                    System.out.print("Enter Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter ID: ");
                    int id = input.nextInt();
                    input.nextLine();
                    


                    System.out.print("Enter Access Level: ");
                    String access = input.nextLine();

                    // Polymorphism: using Employee reference to store a SecurityEmployee object
                    Employee emp = new SecurityEmployee(name, id, access);
                    system.addEmployee(emp);
                    break;

                case 2:
                    system.displayEmployees();
                    break;

                case 3:
                    input.nextLine();

                    System.out.print("Enter Action: ");
                    String action = input.nextLine();

                    System.out.print("Enter Time: ");
                    String time = input.nextLine();

                    ActivityLog log = new ActivityLog(action, time);
                    system.addLog(log);
                    break;

                case 4:
                    system.displayLogs();
                    break;

                case 5:
                    System.out.println("Exiting SecureTrack...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        input.close();
    }
}