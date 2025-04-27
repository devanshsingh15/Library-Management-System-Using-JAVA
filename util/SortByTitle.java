package project.LibraryManagementSystem.util;

import java.util.Comparator;

import project.LibraryManagementSystem.entity.*;

public class SortByTitle implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.title.compareTo(o2.title);
	}
	
}
