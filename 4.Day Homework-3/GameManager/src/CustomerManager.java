import java.rmi.RemoteException;

public class CustomerManager {

	private Customer customer;

	public CustomerManager(Customer customer) {
		this.customer = customer;
	}

	private CustomerManaging customerManaging;

	public CustomerManager(CustomerManaging custManaging) {

		this.customerManaging = custManaging;
	}

	void add(Customer customer) throws RemoteException {
		customerManaging.add(customer);

	}

	void update(Customer customer) throws RemoteException {
		customerManaging.update(customer);

	}

	void delete(Customer customer) throws RemoteException {
		customerManaging.delete(customer);

	}

}
