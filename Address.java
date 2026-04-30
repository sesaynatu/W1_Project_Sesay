/**
 * Name: Taphanatu Sesay
 * Course: SDC330
 * Assignment: 4.6 Course Project - Database Implementation
 * Date: April 30, 2026
 * Description: This class represents an Address object.
 */

public class Address {
    private int id;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private int zip;

    public Address(int id, String street1, String street2, String city, String state, int zip) {
        this.id = id;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public int getId() {
        return id;
    }

    public String getStreet1() {
        return street1;
    }

    public String getStreet2() {
        return street2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }
}