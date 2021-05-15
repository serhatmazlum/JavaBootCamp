
public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign, Game games) {
	
		System.out.println(campaign.getCampaignName()+" campaign added "+games.getGameName());
		
	}

	@Override
	public void updateCampaign(Campaign campaign, Game games) {
		
		System.out.println(campaign.getCampaignName()+" campaign updated "+games.getGameName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign, Game games) {
		
		System.out.println(campaign.getCampaignName()+" campaign deleted "+games.getGameName());
		
	}

}
