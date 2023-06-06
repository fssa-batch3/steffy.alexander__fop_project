package day04.solved;

class Book {
	public void display() {
		System.out.println("Display Method is invoked");
	}
}

public class BookDemo {

	public static void main(String[] args) {
		
		Book newBook = new Book();
		System.out.println(newBook);
		newBook.display();

	}
	
	

}
