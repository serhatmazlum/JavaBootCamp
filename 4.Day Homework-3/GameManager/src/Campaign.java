
public class Campaign {
	
	private int id;
	private String campaignName;
	
	
	public Campaign(int id, String campaignName) {
	
		this.id = id;
		this.campaignName = campaignName;
		
	}
	
	public int getId() {
		return id;
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCampaignName() {
		return campaignName;
	}
	
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	

}
