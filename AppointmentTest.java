package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import appointment.Appointment;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

class AppointmentTest {
	
	/*
	 * Simple check to ensure the appointment class properly constructs an object
	 */
	@Test
	void testAppointmentClass() {
		Date now = new Date();
		Appointment appointment = new Appointment("12345", now, "This is a description");
		assertTrue(appointment.getAppointmentId().equals("12345"));
		assertTrue(appointment.getAppointmentDate().equals(now));
		assertTrue(appointment.getDescription().equals("This is a description"));
	}
	
	
	/*
	 * Appointment Class Test Requirement 1: Appointment Id
	 */
	@Test
	void testAppointmentClassAppointmentIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("123456789123", new Date(), "This is a description");
		});
	}
	
	@Test
	void testAppointmentClassAppointmentIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, new Date(), "This is a description");
		});
	}
	
	
	/*
	 * Appointment Class Test Requirement 2: Appointment Date
	 */
	@Test
	void testAppointmentClassAppointmentDayInPast() throws ParseException {
		Date pastDate = new SimpleDateFormat("MMMM d, yyyy").parse("September 01, 2021");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", pastDate, "This is a description");
		});
	}
	
	@Test
	void testAppointmentClassAppointmentDayNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", null, "This is a description");
		});
	}
	
	
	/*
	 * Appointment Class Test Requirement 3: Appointment Description
	 */
	@Test
	void testAppointmentClassDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", new Date(), "This description is too long and should throw an exception");
		});
	}
	
	@Test
	void testAppointmentClassDescriptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", new Date(), null);
		});
	}

}