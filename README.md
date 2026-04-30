# 4.6 Course Project – Database Implementation

## Name
Taphanatu Sesay

## Course
Software Development (SDC330)

## Date
April 30, 2026

---

## Project Description
This project demonstrates the implementation of database support in a Java application using SQLite. The application stores and manages address records, allowing users to perform CRUD operations (Create, Read, Update, Delete).

The system connects to a SQLite database and creates a table to store address information, including street address, city, state, and zip code. The application allows inserting new records, retrieving all records, searching for a record by ID, updating existing records, and deleting records.

---

## Concepts Demonstrated

### Database Integration
- Connected Java application to a SQLite database
- Created a database table if it does not already exist
- Stored structured data in the database

### CRUD Operations
- Insert records into the database
- Retrieve all records from the database
- Retrieve a specific record using an ID
- Update an existing record
- Delete a record from the database

### Object-Oriented Programming
- Used classes to represent data (Address class)
- Separated database logic into a helper class (DatabaseHelper)
- Organized application flow in the main class (App)

---

## Classes Included

- **App.java** (Main class)  
  Handles program execution and demonstrates all database operations.

- **Address.java** (Model class)  
  Represents the structure of an address record.

- **DatabaseHelper.java** (Database class)  
  Manages database connection and performs CRUD operations.

---

## How to Run

1. Open the project in Visual Studio Code
2. Ensure the SQLite JDBC driver is added to referenced libraries
3. Run `App.java`
4. View output in the terminal

---

## Summary

This project successfully integrates database functionality into a Java application. It demonstrates how to manage data using SQLite and perform essential CRUD operations, which are critical for real-world software development.
