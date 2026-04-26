# SecureTrack - Week 3 Class Implementation

This project is a Java-based security tracking system that now includes full class implementation using Object-Oriented Programming (OOP) principles. The system demonstrates how real-world applications are built using structured classes, relationships, and reusable code.

## Features

- Create and manage customers
- Manage employees
- Schedule appointments
- Handle services and payments
- Display system information using console output

## Week 3 Class Implementation

This version of the SecureTrack system introduces:

- Full implementation of Java classes
- Use of constructors in all classes
- Implementation of an abstract class (Person)
- Implementation of an interface (Displayable)
- Use of inheritance (Customer and Employee extend Person)
- Use of polymorphism through method overriding
- Use of composition (Appointment uses Customer, Employee, Service, and Payment)

## Object-Oriented Concepts Used

- **Inheritance:**
  Customer and Employee classes extend the Person abstract class

- **Polymorphism:**
  A Person reference is used to call different implementations of displayInfo()

- **Interface:**
  Displayable interface is implemented by Service, Payment, and Appointment classes

- **Abstraction:**
  Person is an abstract class with an abstract method displayInfo()

- **Composition:**
  Appointment class contains Customer, Employee, Service, and Payment objects

## Author

Taphanatu Sesay
