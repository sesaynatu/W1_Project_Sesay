# SecureTrack - Week 2 Project

This project is a Java-based security tracking system that demonstrates:

- Inheritance
- Composition
- Polymorphism
- Interface implementation
- User interaction via console input/output

## Week 2 Enhancements

This version of the SecureTrack system introduces:

- An interface (`Trackable`) to define tracking behavior
- Implementation of the interface in the `ActivityLog` class
- Use of polymorphism by storing a `SecurityEmployee` object using an `Employee` reference
- Improved object-oriented design and code structure

## Features

- Add employees
- View employees
- Add activity logs
- View activity logs

## Object-Oriented Concepts Used

- **Inheritance:**  
  `SecurityEmployee` and `AdminEmployee` extend the base `Employee` class

- **Polymorphism:**  
  An `Employee` reference is used to store a `SecurityEmployee` object

- **Interface:**  
  `Trackable` interface is implemented by `ActivityLog` to define tracking behavior

- **Composition:**  
  `SecureTrackSystem` manages collections of employees and activity logs

## Author

Taphanatu Sesay
