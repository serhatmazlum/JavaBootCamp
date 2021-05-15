package coffeShopCustomerManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerManager customerManager = new CustomerManager();
		customerManager.saveDatabase(new Customer(1, "serhat", "dd", "dddd"));
		
	}


}
