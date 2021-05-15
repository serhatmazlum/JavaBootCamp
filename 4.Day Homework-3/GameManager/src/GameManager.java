

public class GameManager implements GameService{

	@Override
	public void buyGame(Customer customer, Game game) {
		System.out.println(customer.getName()+" "+customer.getLastName()+" purchase succesful "+ game.getGameName()+" "+ game.getPrice());
		
	}

	@Override
	public void getCampaign(Customer customer,Game game, Campaign campaign, double discount) {
		System.out.println(customer.getName()+" "+customer.getLastName()+" purchase succesful "+ game.getGameName()+" "+ campaign.getCampaignName()+" after discount: "+(game.getPrice()-discount));
	}


	

	
	
}


