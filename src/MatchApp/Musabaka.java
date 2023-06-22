package MatchApp;

public class Musabaka {
	private Boksor boksor1;
	private Boksor boksor2;
	private int minAgirlik;
	private int maxAgirlik;

	public Musabaka(Boksor boksor1, Boksor boksor2, int minAgirlik, int maxAgirlik) {

		this.boksor1 = boksor1;
		this.boksor2 = boksor2;
		this.minAgirlik = minAgirlik;
		this.maxAgirlik = maxAgirlik;
	}

	public void raundBasla() {
		int round = 1;
		if (sikletKontrol()) {
			while (this.boksor1.getSaglik() > 0 && this.boksor2.getSaglik() > 0) {
				System.out.println(">>>---" + round + ". Raund---<<<");
				boksor1.setSaglik(boksor2.vurus(boksor1));
				if(kazanan()) {
					break;
				}
				boksor2.setSaglik(boksor1.vurus(boksor2));
				if(kazanan()) {
					break;
				}
				sunucu();
				round++;
			}
		}else {
			System.out.println("Rakiplerin sikleti uyumsuz");
		}
	}
	

	private void sunucu() {
		System.out.println("-----------------");
		System.out.println(boksor1.getAd()+" Kalan Sağlık "+boksor1.getSaglik());
		System.out.println(boksor2.getAd()+" Kalan Sağlık "+boksor2.getSaglik());
		
	}

	public boolean kazanan() {
		if(boksor1.getSaglik()==0) {
			System.out.println("Maçı Kazanan: "+boksor2.getAd());
			return true;
		}else if(boksor2.getSaglik()==0) {
			System.out.println("Maçı kazanan: "+boksor1.getAd());
			return true;
		}
		
		return false;
	}

	public boolean sikletKontrol() {
		boolean durum = (boksor1.getSiklet() >= this.minAgirlik && boksor1.getSiklet() <= this.maxAgirlik)
				&& (boksor2.getSiklet() >= this.minAgirlik && boksor2.getSiklet() <= this.maxAgirlik);

		return durum;
	}

}
