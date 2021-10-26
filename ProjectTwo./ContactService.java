package contact;

import java.util.HashMap;

public class ContactService {
	
	private HashMap<String, Contact> contacts;
	
	public ContactService () {
		contacts = new HashMap<>();
	}
	
	/*
	 * The contact service shall be able to add contacts with a unique contact Id.
	 */
	public void addContact (Contact contact) {
		contacts.put(contact.getContactId(), contact);
	}
	
	/*
	 * The contact service shall be able to delete contacts per contact Id.
	 */
	public void deleteContact (String contactId) {
		contacts.remove(contactId);
	}
	
	/*
	 * The contact service shall be able to update appointments in the in-memory data structure
	 */
	public void updateContact (String contactId, String firstName, String lastName, String phone, String address) {
		Contact update = contacts.get(contactId);
		update.setFirstName(firstName);
		update.setLastName(lastName);
		update.setPhone(phone);
		update.setAddress(address);
	}
	
	public HashMap<String, Contact> getContacts () {
		return contacts;
	}
}
