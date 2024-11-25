package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		Book book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddABook() {
	bc = new BookCatalog();
	book1 = new Book(1,"Learning Java","","","",0);
	bc.addBook(book1);

	assertEquals(1, bc.getNumberOfBooks());

	}

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
	bc = new BookCatalog();
	book1 = new Book(1,"Learning Java","","","",0);
	bc.addBook(book1);
	bc.findBook("Learning Java");
	assertEquals(book1.getTitle(), bc.findBook("Learning Java").getTitle());
	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException {
	bc = new BookCatalog();
	book1 = new Book(1,"Learning Java","","","",0);
	bc.addBook(book1);
	assertEquals(book1.getTitle(), bc.findBook("Learning java").getTitle());
	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	assertEquals(book1.getTitle(), bc.findBook("Learning Java    ").getTitle());
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {
	bc = new BookCatalog();
	book1 = new Book(1,"Learning Java","","","",0);
	bc.addBook(book1);
	assertThrows(BookNotFoundException.class, () -> bc.findBook("Malström"));
	}

}
