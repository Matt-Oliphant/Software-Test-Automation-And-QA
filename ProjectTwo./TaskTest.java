package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import task.Task;

class TaskTest {
	
	/*
	 * Simple check to ensure the task class properly constructs an object
	 */
	@Test
	void testTaskClass() {
		Task task = new Task("12345", "Name", "This is a description");
		assertTrue(task.getTaskId().equals("12345"));
		assertTrue(task.getName().equals("Name"));
		assertTrue(task.getDescription().equals("This is a description"));
	}
	
	
	/*
	 * Task Class Test Requirement 1: Task Id
	 */
	@Test
	void testTaskClassTaskIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("123456789123", "Name", "This is a description");
		});
	}
	
	@Test
	void testTaskClassTaskIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Name", "This is a description");
		});
	}
	
	
	/*
	 * Task Class Test Requirement 2: Name
	 */
	@Test
	void testTaskClassNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", "This name is too long", "This is a description");
		});
	}
	
	@Test
	void testTaskClassNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", null, "This is a description");
		});
	}
	
	
	/*
	 * Task Class Test Requirement 3: Description
	 */
	@Test
	void testTaskClassDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", "Name", "This description is too long and should throw an exception");
		});
	}
	
	@Test
	void testTaskClassDescriptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", "FirstName", null);
		});
	}

}