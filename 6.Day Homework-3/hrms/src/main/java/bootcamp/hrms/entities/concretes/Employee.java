package bootcamp.hrms.entities.concretes;


import lombok.Data;

@Data
public class Employee extends User {

	private long id;
	private String name;
	private String lastName;
	
	
	public Employee(int id, String email, String password,String name,String lastName) {
		super(id, email, password);
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		
		
	
		
	}

	
}
