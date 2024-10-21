package oops;

public class Book {
	
	static int totalNoOfBook;
	
	String title;
	String author;
	String isbn;
	
	boolean isborrowed;


	static {
		totalNoOfBook = 0;
	}
	{
		totalNoOfBook++;
	}
	Book(String isbn, String author , String title){
		this.isbn = isbn;
		this.author = author;
		this.title = title;
	}
	Book(String isbn){
		this(isbn, "Unknown", "Unknown");
	}
	static int  getTotalNoOfBook() {
		return totalNoOfBook;
	}
	void borrowedBook() {
		if(isborrowed) {
			System.out.println("This is already borrowed:");
		}else {
		this.isborrowed = true;
		System.out.println("Enjoy "+ this.title);
	}
	}
	void returnBook() {
		if(isborrowed) {
			this.isborrowed = false;
			System.out.println("Hope you enjoyed,Please leave a review");
		}else {
		
		System.out.println("The book is already in the libraray ");
	}
}
	public static void main(String [] agrs) {
		Book DesignOfThings = new Book("1" , "author" , "Bhagvat Geeta");
		Book mybook = new Book("2" );
		System.out.println(Book.getTotalNoOfBook());
		mybook.borrowedBook();
		DesignOfThings.borrowedBook();
		DesignOfThings.returnBook();
		DesignOfThings.returnBook();
	}
}