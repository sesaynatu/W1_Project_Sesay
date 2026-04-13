/**
 * Name: Taphanatu Sesay
 * Date: 04/12/2026
 * Assignment: SDC330L Project Week 1 - Inheritance, Composition, and User Interactions
 * Description: Main system class that manages employees and activity logs using composition.
 */
import java.util.ArrayList;

public class SecureTrackSystem {
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<ActivityLog> logs = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added successfully.");
    }

    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee emp : employees) {
                emp.displayInfo();
                System.out.println("-------------------");
            }
        }
    }

    public void addLog(ActivityLog log) {
        logs.add(log);
        System.out.println("Log added successfully.");
    }

    public void displayLogs() {
        if (logs.isEmpty()) {
            System.out.println("No logs found.");
        } else {
            for (ActivityLog log : logs) {
                log.displayLog();
            }
        }
    }
}