import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublic;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheck {

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		boolean result = client.TCKimlikNoDogrula(Long.parseLong(customer.getIdentityNumber()),
				customer.getName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getYearOfBirth());

		return result;

	}

}
