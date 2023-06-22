
public class OgrenciArray {
	private String ad;
	private String soyAd;
	private int number;
	
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyAd() {
		return soyAd;
	}

	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public OgrenciArray(String ad, String soyAd, int number) {
		
		this.ad = ad;
		this.soyAd = soyAd;
		this.number = number;
	}
	public void bilgiVer() {
		System.out.println(" "+this.ad+" "+this.soyAd+" ");
	}
	

}
