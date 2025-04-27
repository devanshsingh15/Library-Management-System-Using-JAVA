package project.LibraryManagementSystem.Service;
import project.LibraryManagementSystem.Repository.Database;
import java.util.HashMap;

import project.LibraryManagementSystem.entity.Book;

public class LibraryService {
    public boolean addBook(Book b, int q){
        for(Book book : Database.books.keySet()) {
            if(book.bookID.equals(b.bookID)) {
                Database.books.put(book, Database.books.get(book)+q);
                return true;
            }
        }
        Database.books.put(b, q);
        return true;
    }

    public boolean isAvailable(String bookID) {
        for(Book book : Database.books.keySet()) {
            if(book.bookID.equals(bookID)) {
                return true;
            }
        }
        return false;
    }

    public boolean updateQuantity(String bookID, Integer q) {
        for(Book book : Database.books.keySet()) {
            if(book.bookID.equals(bookID)) {
                Database.books.put(book, Database.books.get(book) + q);
                return true;
            }
        }
        System.out.println("Not a valid Book");
        return false;
    }

    public boolean removeBook(String bookId) {
        for (Book book : Database.books.keySet()) {
            if (book.bookID.equals(bookId)) {
                Database.books.remove(book);
                System.out.println("Book removed successfully.");
                return true;
            }
        }
        System.out.println("Book not found.");
        return false;
    }

}
