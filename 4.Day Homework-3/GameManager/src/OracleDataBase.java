import java.rmi.RemoteException;

public class OracleDataBase implements CustomerManaging {

	private PersonCheck personCheck;

	public OracleDataBase(PersonCheck personCheck) {
		this.personCheck = personCheck;
	}

	@Override
	public void add(Customer customer) throws RemoteException {

		if (personCheck.CheckIfRealPerson(customer)) {

			System.out.println("Added on Oracle DB " + customer.getName());
		} else {
			System.out.println("User information is incorrect" + customer.getName());
		}

	}

	@Override
	public void update(Customer customer) {
		System.out.println("Updated on Oracle DB " + customer.getName());

	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Deleted on Oracle DB " + customer.getName());

	}

}
