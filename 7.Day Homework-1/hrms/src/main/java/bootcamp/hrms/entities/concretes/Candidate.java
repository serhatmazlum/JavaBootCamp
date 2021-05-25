package bootcamp.hrms.entities.concretes;

import java.sql.Date;

import lombok.Data;

@Data
public class Candidate extends User {
	
	private int id;
	private String firstName;
	private String lastName;
	private String identityNumber;
	private Date  birthDay;

	public Candidate(int id, String email, String password,String firstName,String lastName,
			String identityNumber,
			Date  birthDay) {
		super(id, email, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDay = birthDay;
		
	}

	
	
}