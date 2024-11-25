package models;

import static org.junit.jupiter.api.Assertions.*;
import static utilities.GenderType.FEMALE;

import org.junit.jupiter.api.Test;

import java.time.*;

public class LoanTest {

	//VG
	@Test
	public void testDueDate() {
	Clock fixedClock = Clock.fixed(Instant.parse("2024-11-15T12:00:00Z"), ZoneId.of("UTC"));
	LocalDate now = LocalDate.now(fixedClock);
	Book book = new Book(102030, "Malström", "Sigrid Rausing", "10298490", "Memoir", 230);
	Customer customer = new Customer("ms", "Malin", "Sundberg", "Jons väg 42, Jonsered", "0730449610", "malinsundberg@gmail.com", 1, FEMALE);
	Loan loan = new Loan(2, customer, book);
	LocalDate expectedDueDate = LocalDate.now().plusDays(14);
	assertEquals(expectedDueDate, loan.getDueDate());
   }
}