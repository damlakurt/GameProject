
public class SalesManager implements SalesService{
	
	private CampaignService campaignservice;
	

	public SalesManager(CampaignService campaignservice) {
		super();
		this.setCampaignservice(campaignservice);
	}


	@Override
	public void sale(Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName() + " " + "Ýsimli Oyuncu: " + campaign.campaignName + " Kampanyalý Oyunu Satýn Aldý ");
		
	}


	public CampaignService getCampaignservice() {
		return campaignservice;
	}


	public void setCampaignservice(CampaignService campaignservice) {
		this.campaignservice = campaignservice;
	}
	
	
}
