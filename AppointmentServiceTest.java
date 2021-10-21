package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import appointment.AppointmentService;
import appointment.Appointment;

import java.util.Date;

class AppointmentServiceTest {
	
	/*
	 * Test checks for a successful instantiation of a appointment and appointment service object.
	 */
	@Test
	void testAppointmentServiceClass() {
		AppointmentService appointmentService = new AppointmentService();
		Appointment appointment = new Appointment("12345", new Date(), "This is a description");
		assertFalse(appointmentService == null);
		assertFalse(appointment == null);
	}
	
	/*
	 * Test checks that a appointment can be properly added to the in-memory data structure.
	 */
	@Test
	void testAppointmentServiceClassAddAppointment() {
		AppointmentService appointmentService = new AppointmentService();
		Appointment appointment = new Appointment("23456", new Date(), "This is a description");
		appointmentService.addAppointment(appointment);
		assertTrue(appointmentService.getAppointments().containsValue(appointment));
	}
	
	/*
	 * Test checks that a appointment can be properly deleted from the in-memory data structure.
	 */
	@Test
	void testAppointmentServiceClassDeleteAppointment() {
		AppointmentService appointmentService = new AppointmentService();
		Appointment temp = new Appointment("23456", new Date(), "This is a description");
		appointmentService.addAppointment(temp);
		appointmentService.deleteAppointment("23456");
		assertFalse(appointmentService.getAppointments().containsValue(temp));
	}
	
	/*
	 * Test checks that a appointment can be properly updated in the in-memory data structure.
	 */
	@Test
	void testAppointmentServiceClassUpdateAppointment() {
		AppointmentService appointmentService = new AppointmentService();
		Appointment temp = new Appointment("12345", new Date(), "This is a description");		
		appointmentService.addAppointment(temp);
		assertTrue(appointmentService.getAppointments().containsValue(temp));
		assertTrue(temp.getDescription().equals("This is a description"));
		appointmentService.updateAppointment("12345", new Date(), "This is a NEW description");
		assertTrue(appointmentService.getAppointments().containsValue(temp));
		assertFalse(temp.getDescription().equals("This is a description"));
	}
}
