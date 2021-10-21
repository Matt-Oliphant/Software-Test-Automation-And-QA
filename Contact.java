package contact;

public class Contact {
	
	private final String contactId;  // Appointment Id shall not be updatable.
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact (String contactId, String firstName, String lastName,
			String phone, String address) {
		
		// The contact Id cannot be longer than 10 characters and shall not be null.
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid contactId");
		}
		
		// The contact first name cannot be longer than 10 characters and shall not be null.
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		
		// The contact last name cannot be longer than 10 characters and shall not be null.
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		// The contact phone number must be 10 characters and shall not be null.
		if (phone == null || phone.length() != 10 || !phone.matches("[0-9]+")) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		
		// The contact address cannot be longer than 30 characters and shall not be null.
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	// Accessors
	public String getContactId() {
		return contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
	// Mutators
	public void setFirstName(String newName) {
		firstName = newName;
	}
	public void setLastName(String newName) {
		lastName = newName;
	}
	public void setPhone(String newPhone) {
		phone = newPhone;
	}
	public void setAddress(String newAddress) {
		address = newAddress;
	}
}
