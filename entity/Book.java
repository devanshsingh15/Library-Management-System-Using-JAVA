package project.LibraryManagementSystem.entity;

import java.util.Comparator;

public class Book {
    public String bookID;
    public String title;
    public String author;

    public Book(String bookID, String title, String author){
        this.bookID = bookID;
        this.title = title;
        this.author= author;
    }
    
    public String toString() {
    	return bookID + " " + title + " " + author;
    }
}



