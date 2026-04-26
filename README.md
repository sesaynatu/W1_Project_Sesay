# 3.2 Project – Abstraction, Constructors, & Access Specifiers

## Name
Taphanatu Sesay

## Course
Software Development

## Date
April 26, 2026

---

## Project Description
This project demonstrates the use of abstraction, constructors, and access specifiers in Java. The application simulates a simple system called SecureTrack that manages client information and service requests.

An abstract class `SystemUser` is used to define common properties such as name and user ID. The `Client` class extends this abstract class and provides its own implementation of the `displayInfo()` method. The `ServiceRequest` class stores and displays request-related information.

Constructors are used to initialize objects with both default and specific values. Access specifiers (`private`, `protected`, and `public`) are used to control how data is accessed and modified within the program.

---

## Concepts Demonstrated

### Abstraction
- Implemented using the abstract class `SystemUser`
- Includes an abstract method `displayInfo()` that must be implemented by subclasses

### Constructors
- Default constructors for creating objects with placeholder values
- Parameterized constructors for initializing objects with real data

### Access Specifiers
- `private` used to protect sensitive data
- `protected` used for inheritance access
- `public` used for methods that need to be accessed outside the class

---

## Classes Included
- `App.java` (Main class)
- `SystemUser.java` (Abstract class)
- `Client.java` (Derived class)
- `ServiceRequest.java` (Data class)

---

## How to Run
1. Compile all files:
