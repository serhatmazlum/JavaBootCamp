
public interface GameService {
	
	void buyGame(Customer customer, Game game);

	void getCampaign(Customer customer, Game game, Campaign campaign, double discount);

}
