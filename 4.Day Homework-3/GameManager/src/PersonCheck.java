import java.rmi.RemoteException;

public interface PersonCheck {

	boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
