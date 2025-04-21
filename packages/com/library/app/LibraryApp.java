package com.library.app;
import com.library.books.*;
import com.library.staff.*;
public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l=new Library();
		Librarian l1=new Librarian();
		
		l.setLibraryName("Janata");
		l.setTotalBooks(100);
		
		l1.setLibrarianName("Harshika");
		l1.setYearOfExperience(10);
		
		l.showLibraryDetails();
		System.out.println();
		l1.showsLibrarianDetails();
	}

}
