import java.rmi.RemoteException;
import java.time.LocalDate;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {
	

	public static void main(String[] args) throws NumberFormatException , RemoteException {
		
		
KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong("1111111"), "DAMLA", "KURT", 1999);
		System.out.println("DOGRULAMA: " + (result ? "Baþarýlý " : "Baþarýsýz"));
		


		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Damla");
		gamer.setLastName("K.");
		gamer.setNationalId("1235689");
		gamer.setDateOfBirth(LocalDate.of(1999,2,26));
		
		GamerManager gamerManager = new GamerManager(new IdentityNumberVerification());
		gamerManager.add(gamer);
		gamerManager.delete(gamer);
		gamerManager.update(gamer);
		
	
		
		Campaign campaign = new Campaign(1, "(%70'e Varan Bahar Ýndimi )");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);
		
		
		
		SalesManager salesManager = new SalesManager(new CampaignManager());
		salesManager.sale(gamer, campaign);
		
		
		
	}

}
