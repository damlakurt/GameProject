import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class IdentityNumberVerification implements IdentityNumberVerificationService{
	
	

	
	

	@Override
	public boolean INV(Gamer gamer) {
		
		KPSPublicSoapProxy soapClient = new KPSPublicSoapProxy();
		boolean returnType= false;
		
		try {
			  returnType = soapClient.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalId()), gamer.getFirstName(),
					  gamer.getLastName(), 
					  gamer.getDateOfBirth().getYear());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return returnType;
	}
	
	
		
	
	
	
		
	}
	


