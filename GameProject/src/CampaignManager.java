
public class CampaignManager implements  CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.campaignName+ " " + ":Kampanya Eklendi  ");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.campaignName+ " " + ":Kampanya Silindi  ");
		
	
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println(campaign.campaignName+ " " + ":Kampanya Güncellendi ");
		
	}

}
