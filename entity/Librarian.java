package project.LibraryManagementSystem.entity;

public class Librarian {
    public String name;
    public String librarianID;
    public String password;

    Librarian(String name, String librarianID, String password){
        this.name = name;
        this.password = password;
        this.librarianID = librarianID;
    }
}
