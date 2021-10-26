package appointment;

import java.util.HashMap;
import java.util.Date;

public class AppointmentService {
	
	private HashMap<String, Appointment> appointments;
	
	public AppointmentService() {
		appointments = new HashMap<>();
	}
	
	/*
	 * The appointment service shall be able to add appointments with a unique appointment Id.
	 */
	public void addAppointment (Appointment appointment) {
		appointments.put(appointment.getAppointmentId(), appointment);
	}
	
	/*
	 * The appointment service shall be able to delete appointments per appointment Id.
	 */
	public void deleteAppointment (String appointmentId) {
		appointments.remove(appointmentId);
	}
	
	/*
	 * The appointment service shall be able to update appointments in the in-memory data structure
	 */
	public void updateAppointment (String appointmentId, Date newApptDate, String newDescription) {
		appointments.get(appointmentId).setAppointmentDate(newApptDate);
		appointments.get(appointmentId).setDescription(newDescription);
	}
	
	public HashMap<String, Appointment> getAppointments () {
		return appointments;
	}
}
