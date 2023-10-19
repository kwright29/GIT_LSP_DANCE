package org.howard.edu.lsp.midterm.problem1;

public class Book {
	private String title;
	private String author;
	private String year;

	public Book(String title, String author, String year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	public String toString() {
		String book_str = "Title of Book: " + this.title + "\nAuthor: " + 
				this.author + "\nYear of Publication: " + this.year;
		return book_str;
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof Book)) {
			return false;
	    }
		Book book2 = (Book) o;
		
		if (this.title.equals(book2.title) && this.author.equals(book2.author)) {
			return true;
		}
		return false;
	}
}
