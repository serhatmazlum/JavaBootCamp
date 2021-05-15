package coffeShopCustomerManager;

public class Customer {


	private int id;
 	private String name;
 	private String surName;
 	private String identificationNumber;
	
	
	public Customer(int id,String name,String surName,String identificationNumber) {

		this.id = id;
		this.name = name;
		this.surName = surName;
		this.identificationNumber = identificationNumber;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String surName) {
		this.name = name;
	}
	

	public String getSurName() {
		return surName;
	}


	public void setSurName(String surName) {
		this.surName = surName;
	}


	public String getIdentificationNumber() {
		return identificationNumber;
	}


	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	}
	



