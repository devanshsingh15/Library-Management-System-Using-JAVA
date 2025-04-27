# 📚Library-Management-System-Using-JAVA

## 📝 Project Overview
The Library Management System is a Core Java-based application designed to manage and automate common library activities such as managing books, managing users, issuing and returning books, and viewing available books.
The system uses basic Java concepts like OOP, Collections, and custom utilities to achieve a modular, easy-to-understand design.

The project follows a simple three-layered architecture:
-Entity Layer (for models like User and Book)
-Repository Layer (Database class acting as a dummy database)
-Service Layer (handles business logic like issuing books, user registration, etc.)

### ✨ Features of the Project
-Add new users
-User authentication (login)
-View all available books
-Issue (borrow) a book
-Return a book
-View all users
-Sort books by:
  ~Book ID
  ~Book Title
  ~Book Author

### 📂 Package Structure
```pgsql
project.LibraryManagementSystem
│
├── entity
│    ├── Book.java
│    └── User.java
│
├── Repository
│    └── Database.java
│
├── util
│    ├── sortById.java
│    ├── SortByTitle.java
│    └── SortByAuthor.java
│
├── Service
│    ├── UserService.java
│    └── LibraryService.java
│
└── Main.java
```

### 📜 Class-wise Description
1. Book.java (entity layer)
Represents a book with attributes:
-bookID
-title
-author
Purpose: Acts as a model/entity class for storing book details.

2. User.java (entity layer)
Represents a user with attributes:
-name
-userID
-password
Purpose: Acts as a model/entity class for storing user details.

3. Database.java (Repository layer)
Acts as a dummy database for storing:
-A HashMap<Book, Integer> to store books along with available quantity
-A User[] users array to store user information
Purpose: Central place to store and access books and users.

4. sortById.java, SortByTitle.java, SortByAuthor.java (util layer)
Custom comparator classes to sort Book objects based on:
-Book ID (sortById)
-Book Title (SortByTitle)
-Book Author (SortByAuthor)
Purpose: Help in sorting books dynamically according to different attributes.

5. LibraryService.java (Service layer)
Provides common library-related operations like:
-Add books
-Update quantity of books (when issued or returned)
-Delete books
Purpose: Manage book inventory — adding, updating, deleting books.

6. UserService.java (Service layer)
Provides user-focused operations like:
-User registration (addUser)
-User authentication (verifyUser)
-Borrow a book (getBook)
-Return a book (returnBook)
-View available books
-Sort books by ID, Title, Author
-View all users
Purpose: Handle business logic for user interactions and book borrowing/returning.

7. Main.java (driver class)
Acts as the entry point of the program.
Handles:
-User login
-Menu-driven interaction
-Calling service methods based on user input
Purpose: Run the application, take user inputs, and call appropriate service methods.

### 🛠️ Technologies & Concepts Used
`Java 17 (or Java 8+ compatible)
`Core Java OOP Principles (Classes, Objects, Inheritance, Encapsulation)
`Java Collections Framework (ArrayList, HashMap)
`Streams API (Filtering and Collecting)
`Comparator and Sorting
`Separation of Concerns (Entity, Repository, Service Layer)
`Simple Exception Handling

### 🎯 Learning Outcomes
--Designing and structuring a Java project with multiple packages and layers
-Handling real-world scenarios like book borrowing and return
-Managing collections (like HashMaps and Arrays) efficiently
-Writing clean, reusable, modular code
-Implementing custom sorting logic
-Creating a simple console-based user interface
-Understanding the basics of service-oriented architecture in Java

### 🚀 Possible Future Enhancements
-Add Admin functionalities (like removing a user, checking history)
-Implement fine calculation for late returns
-Introduce a real database (MySQL, PostgreSQL)
-Create a GUI (using JavaFX or Swing)

Feel free to connect!
📌 Author: Devansh
📅 mail: devanshdmp15@gmail.com
