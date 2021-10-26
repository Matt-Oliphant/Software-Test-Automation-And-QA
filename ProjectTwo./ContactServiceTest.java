package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import contact.Contact;
import contact.ContactService;

class ContactServiceTest {
	
	/*
	 * Test checks for a successful instantiation of a contact and contact service object.
	 */
	@Test
	void testTaskServiceClass() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("12345", "FirstName", "LastName", "1234567890", "125 W Address Ln");
		assertFalse(contactService == null);
		assertFalse(contact == null);
	}
	
	/*
	 * Test checks that a contact can be properly added to the in-memory data structure.
	 */
	@Test
	void testContactServiceClassAddNewContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("12345", "FirstName", "LastName", "1234567890", "125 W Address Ln");
		contactService.addContact(contact);
		assertTrue(contactService.getContacts().containsValue(contact));
	}
	
	/*
	 * Test checks that a contact can be properly deleted from the in-memory data structure.
	 */
	@Test
	void testContactServiceClassDeleteContact() {
		ContactService contactService = new ContactService();
		Contact temp = new Contact("12345", "FirstName", "LastName", "1234567890", "125 W Address Ln");
		contactService.addContact(temp);
		assertTrue(contactService.getContacts().containsValue(temp));
		contactService.deleteContact("12345");
		assertFalse(contactService.getContacts().containsValue(temp));
	}
	
	/*
	 * Test checks that a contact can be properly updated from the in-memory data structure.
	 */
	@Test
	void testContactServiceClassUpdateContact() {
		ContactService contactService = new ContactService();
		Contact temp = new Contact("12345", "FirstName", "LastName", "1234567890", "125 W Address Ln");
		contactService.addContact(temp);
		assertTrue(contactService.getContacts().containsValue(temp));
		assertTrue(temp.getFirstName().equals("FirstName"));
		contactService.updateContact("12345", "NewFirst", "NewLast", "0123456789", "521 E NewAddress Ln");
		assertTrue(contactService.getContacts().containsValue(temp));
		assertFalse(temp.getFirstName().equals("FirstName"));
	}
}
