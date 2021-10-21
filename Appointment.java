package appointment;

import java.util.Date;

public class Appointment {
	
	private final String appointmentId;  // Appointment Id shall not be updatable.
	private Date appointmentDate;
	private String description;
	
	public Appointment (String appointmentId, Date appointmentDate, String description) {
		
		// The appointment Id cannot be longer than 10 characters and shall not be null.
		if (appointmentId == null || appointmentId.length() > 10) {
			throw new IllegalArgumentException("Invalid appointmentId");
		}
		
		// The appointmentDate cannot be longer than 20 characters and shall not be null.
		if (appointmentDate == null || appointmentDate.before(new Date())) {
			throw new IllegalArgumentException("Invalid appointmentDate");
		}
		
		// The description cannot be longer than 50 characters and shall not be null.
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
			
		this.appointmentId = appointmentId;
		this.appointmentDate = appointmentDate;
		this.description = description;
	}
	
	// Accessors
	public String getAppointmentId () {
		return appointmentId;
	}
	public Date getAppointmentDate () {
		return appointmentDate;
	}
	public String getDescription () {
		return description;
	}
	
	// Mutators
	public void setAppointmentDate(Date newAppointmentDate) {
		appointmentDate = newAppointmentDate;
	}
	public void setDescription(String newDescription) {
		description = newDescription;
	}
}
