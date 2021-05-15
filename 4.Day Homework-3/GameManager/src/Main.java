import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub

		// Game instances
		Game game1 = new Game(1, "CSGO", 300);
		Game game2 = new Game(1, "NFS", 500);

		// Campaign instances
		Campaign campaign1 = new Campaign(1, "17-days LockDown");
		Campaign campaign2 = new Campaign(1, "128 Billion olar");

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign1, game1);
		campaignManager.updateCampaign(campaign2, game2);
		campaignManager.deleteCampaign(campaign2, game2);

		// define new customer
		Customer customer1 = new Customer(1, "Serhat mazlum", "çetin", "11111111111", 1993);
		Customer customer2 = new Customer(2, "Ali", "Veli", "11111111111", 1993);

		CustomerManager customerManager = new CustomerManager(new PostgreSql(new MernisServiceAdapter()));
		customerManager.add(customer1);
		customerManager.update(customer1);
		customerManager.delete(customer1);

		GameManager gameManager = new GameManager();
		gameManager.buyGame(customer1, game1);
		gameManager.getCampaign(customer1, game1, campaign1, 10);

	}

}
