
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person person = new Person(1, "serhat", "serhat@gmail.com");
		
		PersonManager personManager = new PersonManager();
		personManager.Add(person);
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add(person);
	}

}
