package SaatApp;

public class Saat {
	private int saat;
	private int dakika;
	private int saniye;

	public Saat(int saat, int dakika, int saniye) {
		this.saat = saat;
		this.dakika = dakika;
		this.saniye = saniye;
	}

	public void ilerle(int saniye) {
		if(saniye>0) {
		for(int i=0;i<saniye;i++) {
			this.saniye++;
		}
		saniyeKontrol(this.saniye);
		}
	}	

	private void saniyeKontrol(int saniye) {
		this.saniye += saniye;
		if (this.saniye % 60 == 0) {
			dakikaKontrol(this.saniye / 60);
			this.saniye = 0;
		} else {
			dakikaKontrol(this.saniye / 60);
			this.saniye = this.saniye % 60;
		}
		
	}

	public void dakikaKontrol(int dakika) {
		this.dakika += dakika;
		if (this.dakika % 60 == 0) {
			saatKontrol(this.dakika / 60);
			this.dakika = 0;
		} else {
			saatKontrol(this.dakika / 60);
			this.dakika = this.dakika % 60;
		}

	}

	public void saatKontrol(int saat) {
		this.saat+=saat;
		if(this.saat%24==0) {
			this.saat=0;
		}else {
			this.saat=this.saat%24;
		}

	}

	public void saatGoster() {
		System.out.println(this.saat + ":" + this.dakika + ":" + this.saniye);
	}

}
