
public class GamerManager implements GamerService{
	
	public GamerManager(IdentityNumberVerification identityNumberVerification) {
		
		
		

		
	

	}
	
	
	
	public void add( Gamer gamer) {
		System.out.println("Yeni Oyuncu Eklendi : " +gamer.getFirstName());
	}
	
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu Silindi : " + gamer.getFirstName());
	}
	
	public void update(Gamer gamer) {
		System.out.println("Oyuncu Güncellendi : " + gamer.getFirstName());
		
		
	}
	

}
