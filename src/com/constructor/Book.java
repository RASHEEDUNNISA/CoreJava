package com.constructor;

public class Book {
	private int bookId;
	private String title;
	private int availableCopies;
	
	public Book(int bookId, String title, int availableCopies) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.availableCopies = availableCopies;
	}

	public Book() {}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAvailableCopies() {
		return availableCopies;
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	
	protected void borrowBook() {
		if(availableCopies>0)
			{
			System.out.println("Attempting to borrow a book....");
			availableCopies--;
			System.out.println("Book borrowed Successfully! Updated Available Copies "+availableCopies);
			}
		else
			System.out.println("Book is not available for borrowing");
	}
	
	protected void returnBook() {
		{
			System.out.println("Attempting to return a book....");
			availableCopies++;
			System.out.println("Book returned Successfully! Updated Available Copies "+availableCopies);
		}
	}
	
}
