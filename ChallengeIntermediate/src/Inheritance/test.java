package Inheritance;

public class test {
	public static void main(String [] args) {
		LibraryItem item = new LibraryItem();
		item.checkout();
		//item.returnItem(); // it is not accesble because it's private 
		Book book = new Book();
		
		Magzine mgl = new Magzine();
		
		DVD d = new DVD();
	}

}
