package bootcamp.hrms.entities.concretes;

import lombok.Data;

@Data
public class User implements bootcamp.hrms.entities.abstracts.User {


	private long id;
	private String email;
	private String password;
	
	
	public User(int id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}
	
	
}
