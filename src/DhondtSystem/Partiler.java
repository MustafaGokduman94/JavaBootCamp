package DhondtSystem;

public class Partiler {
	private String partiAdi;
	private int oy;
	private int sandalye;
	
	public String getPartiAdi() {
		return partiAdi;
	}
	public int getOy() {
		return oy;
	}
	public int getSandalye() {
		return sandalye;
	}
	public Partiler(String partiAdi, int oy, int sandalye) {		
		this.partiAdi = partiAdi;
		this.oy = oy;
		this.sandalye = sandalye;
	}
	public void sandalyeSayisi() {
		System.out.println(this.partiAdi+" "+this.sandalye);
	}
	public void sandalyeArttir() {
		this.sandalye++;
		
	}
	

}
