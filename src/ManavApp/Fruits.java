package ManavApp;

public class Fruits {
	
	private String ad;
	private double fiyat;
	private double stok;
	private double alimMiktari;
	
	
	public Fruits(String ad, double fiyat, double stok) {		
		this.ad = ad;
		this.fiyat = fiyat;
		this.stok = stok;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public double getStok() {
		return stok;
	}
	public void setStok(double stok) {
		this.stok = stok;
	}
	public double getAlimMiktari() {		
		return alimMiktari;
	}
	public void setAlimMiktari(double alimMiktari) {
		this.alimMiktari = alimMiktari;
	}
	public double borcGoster() {
		return this.fiyat*this.alimMiktari;
	}
	public void stokGuncelle(double miktar) {
		this.stok-=miktar;
	}

}
