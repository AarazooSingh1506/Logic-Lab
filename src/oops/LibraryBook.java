package oops;

public class LibraryBook {
	private String title;
	private String author;
	private boolean issued;
	
	public static int totalBooks = 0;
	
	public LibraryBook(String title , String author) {
		this.title = title;
		this.author =author;
		this.issued = false;
		totalBooks++;
	}
	public void issue() {
		if(issued = false) {
			issued =true;
			System.out.println("Book issue successfully");
		}else {
			System.out.println("Book is already issued");
		}
	}
	public void returnBook() {
		if(issued=true) {
			issued = false;
			System.out.println("Book return successfully");
		}else {
			System.out.println("Book was not isused");
		}
	}
	public boolean isIssued() {
		return issued;
	}
	
	public static void main(String[] args) {
		LibraryBook b = new LibraryBook("1945","Adams");
		
		b.issue();
		b.issue();
		b.returnBook();
		
		System.out.println("Total books: " + LibraryBook.totalBooks);
	}

}
