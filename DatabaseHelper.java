import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Name: Taphanatu Sesay
 * Course: SDC330
 * Assignment: 4.6 Course Project - Database Implementation
 * Date: April 30, 2026
 * Description: This class handles the SQLite database connection and CRUD operations.
 */

public class DatabaseHelper {
    private static final String URL = "jdbc:sqlite:Taphanatu.db";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS Addresses (" +
                "ID INTEGER PRIMARY KEY, " +
                "StreetAddress1 TEXT, " +
                "StreetAddress2 TEXT, " +
                "City TEXT, " +
                "State TEXT, " +
                "ZipCode INTEGER)";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {

            stmt.execute(sql);

        } catch (SQLException e) {
            System.out.println("Create Table Error: " + e.getMessage());
        }
    }

    public void clearTable() {
        String sql = "DELETE FROM Addresses";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("Clear Table Error: " + e.getMessage());
        }
    }

    public void insert(Address address) {
        String sql = "INSERT INTO Addresses VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, address.getId());
            pstmt.setString(2, address.getStreet1());
            pstmt.setString(3, address.getStreet2());
            pstmt.setString(4, address.getCity());
            pstmt.setString(5, address.getState());
            pstmt.setInt(6, address.getZip());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Insert Error: " + e.getMessage());
        }
    }

    public List<Address> getAll() {
        List<Address> addresses = new ArrayList<>();
        String sql = "SELECT * FROM Addresses ORDER BY ID";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                addresses.add(new Address(
                        rs.getInt("ID"),
                        rs.getString("StreetAddress1"),
                        rs.getString("StreetAddress2"),
                        rs.getString("City"),
                        rs.getString("State"),
                        rs.getInt("ZipCode")
                ));
            }

        } catch (SQLException e) {
            System.out.println("Read Error: " + e.getMessage());
        }

        return addresses;
    }

    public Address getById(int id) {
        String sql = "SELECT * FROM Addresses WHERE ID = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return new Address(
                        rs.getInt("ID"),
                        rs.getString("StreetAddress1"),
                        rs.getString("StreetAddress2"),
                        rs.getString("City"),
                        rs.getString("State"),
                        rs.getInt("ZipCode")
                );
            }

        } catch (SQLException e) {
            System.out.println("Find Error: " + e.getMessage());
        }

        return null;
    }

    public void update(Address address) {
        String sql = "UPDATE Addresses SET StreetAddress1 = ?, StreetAddress2 = ?, City = ?, State = ?, ZipCode = ? WHERE ID = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, address.getStreet1());
            pstmt.setString(2, address.getStreet2());
            pstmt.setString(3, address.getCity());
            pstmt.setString(4, address.getState());
            pstmt.setInt(5, address.getZip());
            pstmt.setInt(6, address.getId());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Update Error: " + e.getMessage());
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM Addresses WHERE ID = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Delete Error: " + e.getMessage());
        }
    }
}