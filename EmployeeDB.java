/**********************************************************************
 * Name: Taphanatu Sesay
 * Date: April 30, 2026
 * Assignment: SDC330 Week 4 Project - Database Interactions
 *
 * Purpose:
 * This class handles all CRUD operations for the Employees table.
 **********************************************************************/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDB {

    public static boolean createTable(Connection conn) {
        String sql =
                "CREATE TABLE IF NOT EXISTS Employees (\n"
                        + " ID integer PRIMARY KEY,\n"
                        + " FirstName varchar(20),\n"
                        + " LastName varchar(40),\n"
                        + " Position varchar(50),\n"
                        + " Age integer);";

        System.out.println(sql + "\n");

        try {
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void addEmployee(Connection conn, Employee e) {
        String sql = "INSERT INTO Employees(FirstName, LastName, Position, Age) VALUES(?,?,?,?)";

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, e.FirstName);
            pst.setString(2, e.LastName);
            pst.setString(3, e.Position);
            pst.setInt(4, e.Age);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void updateEmployee(Connection conn, Employee e) {
        String sql = "UPDATE Employees SET FirstName=?, LastName=?, Position=?, Age=? WHERE ID=?";

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, e.FirstName);
            pst.setString(2, e.LastName);
            pst.setString(3, e.Position);
            pst.setInt(4, e.Age);
            pst.setInt(5, e.ID);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void deleteEmployee(Connection conn, int id) {
        String sql = "DELETE FROM Employees WHERE ID=?";

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Employee> getAllEmployees(Connection conn) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        String sql = "SELECT * FROM Employees";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Employee e = new Employee(
                        rs.getInt("ID"),
                        rs.getString("FirstName"),
                        rs.getString("LastName"),
                        rs.getString("Position"),
                        rs.getInt("Age")
                );

                employees.add(e);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return employees;
    }

    public static Employee getEmployee(Connection conn, int id) {
        Employee e = new Employee();
        String sql = "SELECT * FROM Employees WHERE ID=?";

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                e.ID = rs.getInt("ID");
                e.FirstName = rs.getString("FirstName");
                e.LastName = rs.getString("LastName");
                e.Position = rs.getString("Position");
                e.Age = rs.getInt("Age");
            } else {
                e.ID = id;
                e.FirstName = "Not";
                e.LastName = "Found";
                e.Position = "No Role";
                e.Age = 999;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return e;
    }
}