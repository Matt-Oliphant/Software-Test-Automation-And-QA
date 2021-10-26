package task;

public class Task {
	
	private final String taskId;  // Task Id shall not be updatable.
	private String name;
	private String description;
	
	public Task (String taskId, String name, String description) {
		
		// The task Id cannot be longer than 10 characters and shall not be null.
		if (taskId == null || taskId.length() > 10) {
			throw new IllegalArgumentException("Invalid taskId");
		}
		
		// The name cannot be longer than 20 characters and shall not be null.
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid name");
		}
		
		// The description cannot be longer than 50 characters and shall not be null.
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
			
		this.taskId = taskId;
		this.name = name;
		this.description = description;
	}
	
	// Accessors
	public String getTaskId () {
		return taskId;
	}
	public String getName () {
		return name;
	}
	public String getDescription () {
		return description;
	}
	
	// Mutators
	public void setName(String newName) {
		name = newName;
	}
	public void setDescription(String newDescription) {
		description = newDescription;
	}
}
