package project.LibraryManagementSystem.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import project.LibraryManagementSystem.Repository.Database;
import project.LibraryManagementSystem.entity.*;
import project.LibraryManagementSystem.util.*;


import project.LibraryManagementSystem.entity.*;

public class UserService {

	public static String viewAvailableBooks() {
		List<Book> availableBooks = Database.books.entrySet().stream().filter(entry -> entry.getValue() > 0)
				.map(Map.Entry::getKey).collect(Collectors.toList());

		if (availableBooks.isEmpty()) {
			return "No books are currently available.";
		}

		StringBuilder sb = new StringBuilder("Available Books:\n");
		for (Book book : availableBooks) {
			sb.append("ID: ").append(book.bookID).append(", Title: ").append(book.title).append(", Author: ")
					.append(book.author).append(", Copies: ").append(Database.books.get(book)).append("\n");
		}
		return sb.toString();
	}

	LibraryService libraryService = new LibraryService();

	public void getBook(String bookId) {
		for (Book book : Database.books.keySet()) {
			if (book.bookID.equals(bookId)) {
				int count = Database.books.get(book);
				if (count > 0) {
					libraryService.updateQuantity(bookId, -1);
					System.out.println("Book is available");
					return;
				} else {
					System.out.println("Book is not available");
				}
			}
		}
		System.out.println("Book is not available");
	}

	public void returnBook(String bookId) {
		if (libraryService.updateQuantity(bookId, 1))
			System.out.println("Book is returned");
		else
			System.out.println("");
	}

	public static void addUser(String name, String id, String pass) {
		for (User u : Database.users) {
			if (u != null && u.userID.equals(id)) {
				System.out.println("User with this ID already exists!");
				return;
			}
		}
		User user = new User(name, id, pass);
		for (int i = 0; i < Database.users.length; i++) {
			if (Database.users[i] == null) {
				Database.users[i] = user;
				System.out.println("User Added successfully");
				return;
			}
		}
		System.out.println("Library is full");
	}

	public static boolean verifyUser(String userID, String pass) {
		for (User u : Database.users) {
			if (u != null && u.userID.equals(userID) && u.password.equals(pass)) {
				return true;
			}
		}
		return false;
	}

	public static void viewAllUsers() {
		for (User u : Database.users) {
			if (u != null) {
				System.out.println(u);
			}
		}
	}
	
	public static ArrayList<Book> sortById(HashMap<Book, Integer> books) {
		ArrayList<Book> temp = new ArrayList<>(books.keySet());
		temp.sort(new sortById());;
		return temp;
	}
	public static ArrayList<Book> sortByTitle(HashMap<Book, Integer> books) {
		ArrayList<Book> temp = new ArrayList<>(books.keySet());
		temp.sort(new SortByTitle());;
		return temp;
	}
	public static ArrayList<Book> sortByAuthor(HashMap<Book, Integer> books) {
		ArrayList<Book> temp = new ArrayList<>(books.keySet());
		temp.sort(new SortByAuthor());;
		return temp;
	}
	
}
