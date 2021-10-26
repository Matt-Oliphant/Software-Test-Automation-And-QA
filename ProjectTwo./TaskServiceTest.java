package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import task.Task;
import task.TaskService;

class TaskServiceTest {
	
	/*
	 * Test checks for a successful instantiation of a task and task service object.
	 */
	@Test
	void testTaskServiceClass() {
		TaskService taskService = new TaskService();
		Task task = new Task("12345", "Name", "This is a description");
		assertFalse(taskService == null);
		assertFalse(task == null);
	}
	
	/*
	 * Test checks that a task can be properly added to the in-memory data structure.
	 */
	@Test
	void testTaskServiceClassAddTask() {
		TaskService taskService = new TaskService();
		Task task = new Task("23456", "Name", "This is a description");
		taskService.addTask(task);
		assertTrue(taskService.getTasks().containsValue(task));
	}
	
	/*
	 * Test checks that a task can be properly deleted from the in-memory data structure.
	 */
	@Test
	void testTaskServiceClassDeleteTask() {
		TaskService taskService = new TaskService();
		Task temp = new Task("23456", "Name", "This is a description");
		taskService.addTask(temp);
		assertTrue(taskService.getTasks().containsValue(temp));
		taskService.deleteTask("23456");
		assertFalse(taskService.getTasks().containsValue(temp));
	}
	
	/*
	 * Test checks that a task can be properly updated in the in-memory data structure.
	 */
	@Test
	void testTaskServiceClassUpdateTask() {
		TaskService taskService = new TaskService();
		Task temp = new Task("12345", "Name", "This is a description");
		taskService.addTask(temp);
		assertTrue(taskService.getTasks().containsValue(temp));
		assertTrue(temp.getName().equals("Name"));
		taskService.updateTask("12345", "New Name", "This is a NEW description");
		assertTrue(taskService.getTasks().containsValue(temp));
		assertFalse(temp.getName().equals("Name"));
	}
}
