package oops;

public class User {
	private final int id;
	private String name;
	
	public User(String name) {
		this.id = IDGenerator.nextId();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	
	
	

}
