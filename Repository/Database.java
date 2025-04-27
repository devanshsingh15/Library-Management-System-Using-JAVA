package project.LibraryManagementSystem.Repository;

import java.util.HashMap;
import project.LibraryManagementSystem.entity.Book;
import project.LibraryManagementSystem.entity.User;


public class Database{
    public static User[] users = new User[100];
    public static HashMap<Book, Integer> books = new HashMap<>();
    
    static {
    	books.put(new Book("1", "Maths", "R.D. Sharma"), 4);
        books.put(new Book("2", "Science", "Dr. Endo"), 2);
        books.put(new Book("3", "Computer Science", "Elon Musk"), 5);
        books.put(new Book("4", "Physics", "Einstein"), 3);
        books.put(new Book("5", "Chemistry", "Dr. Anuj"), 6);
    }
}