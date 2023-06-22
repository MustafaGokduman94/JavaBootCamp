package ManavApp;

public class Musteri {
	private String ad;
	private double toplamBorc=0;
	
	
	public Musteri(String ad) {		
		this.ad = ad;
		
	}
	public String getAd() {
		return ad;
	}
	public double getToplamBorc() {
		return toplamBorc;
	}
	public double borcTopla(double borc) {
		this.toplamBorc+=borc;
		return this.toplamBorc;
	}

}
