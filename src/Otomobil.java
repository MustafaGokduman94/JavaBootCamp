
public class Otomobil {
	private String marka;
	private String model;
	private int hiz=0;
	
	
	public String getMarka() {
		return marka;
	}
	public String getModel() {
		return model;
		
	}
	public void setMarka(String aracMarkasi) {
		
		this.marka = aracMarkasi;
	}
	public void setHiz(int hiz) {
		if(hiz<0) {
			this.hiz =0;
		}else if(hiz>180) {
			this.hiz =180;
		}
		this.hiz = hiz;
	}
	public void setModel(String model) {		
		this.model = model;
	}
	public void dur() {
		System.out.println("Araç Durdu");
	}
	public void hizlan() {
		System.out.println("Araç Hızlandı");
	}

}
