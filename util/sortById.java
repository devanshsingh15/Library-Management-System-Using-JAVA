package project.LibraryManagementSystem.util;
import project.LibraryManagementSystem.entity.*;

import java.util.Comparator;

public class sortById implements Comparator<Book>{
	 public int compare(Book o1, Book o2) {
		return o1.bookID.compareTo(o2.bookID);
	}
}


