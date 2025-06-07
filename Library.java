package week2.day1;

public class Library {

		public String addBook(String bookTitle) {
		System.out.println("Book Added Successfully");
		return bookTitle;
		
		}
		public void issueBook() {
		System.out.println("Book issued successfully");
		}

		public static class LibraryManagement {
	    public static void main(String[] args) {
	    Library library = new Library();

	    String addedBook = library.addBook("The Great Gatsby");
	    System.out.println("Added Book: " + addedBook);
	    library.issueBook();
	    }
	}

	
}
