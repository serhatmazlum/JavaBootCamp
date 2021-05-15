import java.rmi.RemoteException;

public interface CustomerManaging {
	
	 void add(Customer customer) throws RemoteException;
	 
	 void update(Customer customer)throws RemoteException;
	 
	 void delete(Customer customer)throws RemoteException;

	

	
		
	

}
