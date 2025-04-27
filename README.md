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

