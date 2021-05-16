package bootcamp.hrms.entities.concretes;


import lombok.Data;

@Data
public class Employer extends User {

	private int id;
	private String companyName;
	private String webAddress;
	private String phoneNumber;
	private boolean isActive;

	public Employer(int id, String email, String password, String companyName, String webAddress, String phoneNumber) {
		super(id, email, password);		
		this.id = id;
		this.companyName = companyName;
		this.webAddress = webAddress;
		this.phoneNumber = phoneNumber;
		
		
	}
	// employer constructırın içine eklenecek

}
