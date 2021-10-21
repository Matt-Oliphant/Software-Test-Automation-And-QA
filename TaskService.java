package task;

import java.util.HashMap;

/*
 * Task service objects contain the in-memory data structure that stores tasks.
 * Used an ArrayList until I see actually requirement.
 * A taskService also allows for adding, deleting, and updating tasks.
 */
public class TaskService {
	
	private HashMap<String, Task> tasks;
	
	public TaskService() {
		tasks = new HashMap<>();
	}
	
	/*
	 * The task service shall be able to add tasks with a unique task Id.
	 */
	public void addTask (Task uniqueId) {
		tasks.put(uniqueId.getTaskId(), uniqueId);
	}
	
	/*
	 * The task service shall be able to delete tasks per task Id.
	 */
	public void deleteTask (String taskId) {
		tasks.remove(taskId);
	}
	
	/*
	 * The task service shall be able to update appointments in the in-memory data structure
	 */
	public void updateTask (String taskId, String newName, String newDescription) {
		tasks.get(taskId).setName(newName);
		tasks.get(taskId).setDescription(newDescription);
	}
	
	public HashMap<String, Task> getTasks () {
		return tasks;
	}
}
