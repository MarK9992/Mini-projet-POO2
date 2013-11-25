package model.users;

public abstract class User {
	private String id;
	private String name;

	public String getId() {
    	return id;
    }

	public void setId(String id) {
    	this.id = id;
    }
	
	public User(String i, String n) {
		this.id = i;
		this.name = n;
	}
}
