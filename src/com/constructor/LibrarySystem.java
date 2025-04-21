package com.constructor;

public class LibrarySystem {
	public static void main(String[] args) {
		Book b=new Book(9,"A Walk to Remember",2);
		System.out.println("Book Details :");
		System.out.println("Book ID : "+b.getBookId());
		System.out.println("Title : "+b.getTitle());
		System.out.println("Available Copies : "+b.getAvailableCopies());
		for(int i=0;i<3;i++) {
			b.borrowBook();
		}
		for(int i=0;i<2;i++) {
			b.returnBook();
		}
		System.out.println("Library Transaction completed");
	}
}
