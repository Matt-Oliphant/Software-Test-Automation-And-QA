package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {
	
	/*
	 * Contact Class Test Requirement 1: Contact Id
	 */
	@Test
	void testContactClass() {
		Contact contact = new Contact("12345", "FirstName", "LastName",
				"7890123456", "1234 Main Ave");
		assertTrue(contact.getContactId().equals("12345"));
		assertTrue(contact.getFirstName().equals("FirstName"));
		assertTrue(contact.getLastName().equals("LastName"));
		assertTrue(contact.getPhone().equals("7890123456"));
		assertTrue(contact.getAddress().equals("1234 Main Ave"));
	}
	
	@Test
	void testContactClassContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789123", "FirstName", "LastName",
				"7890123456", "1234 Main Ave");
		});
	}
	
	@Test
	void testContactClassContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "FirstName", "LastName",
				"7890123456", "1234 Main Ave");
		});
	}
	
	
	/*
	 * Contact Class Test Requirement 2: First Name
	 */
	@Test
	void testContactClassFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "FirstNameIsTooLong", "LastName",
				"7890123456", "1234 Main Ave");
		});
	}
	
	@Test
	void testContactClassFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", null, "LastName",
				"7890123456", "1234 Main Ave");
		});
	}
	
	
	/*
	 * Contact Class Test Requirement 3: Last Name
	 */
	@Test
	void testContactClassLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "FirstName", "LastNameIsTooLong",
				"7890123456", "1234 Main Ave");
		});
	}
	
	@Test
	void testContactClassLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "FirstName", null,
				"7890123456", "1234 Main Ave");
		});
	}
	
	
	/*
	 * Contact Class Test Requirement 4: Phone
	 */
	@Test
	void testContactClassPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "FirstName", "LastName",
				"7890123456789", "1234 Main Ave");
		});
	}
	
	@Test
	void testContactClassPhoneTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "FirstName", "LastName",
				"7890123", "1234 Main Ave");
		});
	}
	
	@Test
	void testContactClassPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "FirstName", "LastName",
				null, "1234 Main Ave");
		});
	}
	
	@Test
	void testContactClassPhoneNonDigits() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "FirstName", "LastName",
				"789012345a", "1234 Main Ave");
		});
	}
	
	
	/*
	 * Contact Class Test Requirement 5: Address
	 */
	@Test
	void testContactClassAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "FirstName", "LastName",
				"7890123456", "1234 Main Ave This Address Is Too Long");
		});
	}
	
	@Test
	void testContactClassAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "FirstName", "LastName",
				"7890123456", null);
		});
	}

}
