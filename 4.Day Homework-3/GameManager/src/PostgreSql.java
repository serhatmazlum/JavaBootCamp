import java.rmi.RemoteException;

public class PostgreSql implements CustomerManaging{
	
	private PersonCheck personCheck;
	
	 public PostgreSql(PersonCheck personCheck) {
	
		this.personCheck = personCheck;
	}
	
	
	
	@Override
	public void add(Customer customer) throws  RemoteException {
		
		if (personCheck.CheckIfRealPerson(customer)) {

			System.out.println("Added PostgreSql DB " + customer.getName());
		} else {
//			System.out.println("User information is incorrect" + customer.getName());
			System.out.println("Added PostgreSql DB " + customer.getName());
		}

	}

	@Override
	public void update(Customer customer) {
		System.out.println("Upddated on PostgreSql DB  "+customer.getName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Deleted on PostgreSql DB "+customer.getName());
		
	}

}
