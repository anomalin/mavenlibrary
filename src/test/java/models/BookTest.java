package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
	Book book = new Book(102030, "Malström", "Sigrid Rausing", "10298490", "Memoir", 230);
	Book book2 = new Book(102030, "Malström", "Sigrid Rausing", "10298490", "Memoir", 230);
	assertEquals(book, book2);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
	Book book = new Book(102030, "Malström", "Sigrid Rausing", "10298490", "Memoir", 230);
	Book book2 = new Book(405060, "Steglitsan", "Donna Tartt", "39285940", "Novel", 550);
	assertNotEquals(book, book2);
	}

}
